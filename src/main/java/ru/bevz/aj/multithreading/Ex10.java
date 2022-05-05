package ru.bevz.aj.multithreading;

public class Ex10 {

    public static void main(String[] args) {
        MyRunnableImpl myRunnable = new MyRunnableImpl();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(Counter.count);
    }
}

class Counter {
    volatile static int count = 0;
}

class MyRunnableImpl implements Runnable {
    synchronized public void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}