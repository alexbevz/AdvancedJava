package ru.bevz.aj.multithreading;

public class SynchronizedBlock1 {

    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnableImpl2();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }


}

class Counter2 {
    volatile static int count = 0;
}

class MyRunnableImpl2 implements Runnable {

    private void doWork2() {
        System.out.println("EEE");
    }
    private void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}