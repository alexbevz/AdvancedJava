package ru.bevz.aj.multithreading;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}

class Market {
    private int breadCount = 0;
    private final Object lock = new Object();

    public void getBread() {
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount--;
            System.out.println("Consumer buys one bread!");
            System.out.println("Count of bread in market: " + breadCount);
            lock.notify();
        }
    }

    public synchronized void putBread() {
        synchronized (lock) {
            while (breadCount >= 5) {
                try {
                    lock.wait(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount++;
            System.out.println("Producer adds one bread!");
            System.out.println("Count of bread in market: " + breadCount);
            lock.notify();
        }
    }
}

class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}