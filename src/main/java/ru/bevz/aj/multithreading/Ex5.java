package ru.bevz.aj.multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("my_thread");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of my thread5: " + myThread5.getName() + "\nPriority: " + myThread5.getPriority());

    }
}


class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("hello");
    }
}
