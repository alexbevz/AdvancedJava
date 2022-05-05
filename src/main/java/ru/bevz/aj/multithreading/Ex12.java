package ru.bevz.aj.multithreading;

public class Ex12 {

    static final Object lock = new Object();

    void mobileCall()  {
        System.out.println(this);
        System.out.println("Mobile call starts");
        synchronized (lock) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Mobile call ends");
    }

    synchronized void skypeCall()  {
        System.out.println(this);
        System.out.println("Skype call starts");
        synchronized (lock) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Skype call ends");
    }

    synchronized void whatsUpCall() {
        System.out.println(this);
        System.out.println("WhatsUp call starts");
        synchronized (lock) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("WhatsUp call ends");
    }

    public static void main(String[] args) {
        Ex12 ex12 = new Ex12();
        Thread thread1 = new Thread(new RunnableImplMobile(ex12));
        Thread thread2 = new Thread(new RunnableImplWhatsUp(ex12));
        Thread thread3 = new Thread(new RunnableImplSkype(ex12));

        thread1.start();
        thread2.start();
        thread3.start();


    }


}

class RunnableImplMobile implements Runnable {
    private Ex12 ex12;

    public RunnableImplMobile(Ex12 ex12) {
        this.ex12 = ex12;
    }

    @Override
    public void run() {
        ex12.mobileCall();
    }
}

class RunnableImplWhatsUp implements Runnable {
    private Ex12 ex12;

    public RunnableImplWhatsUp(Ex12 ex12) {
        this.ex12 = ex12;
    }

    @Override
    public void run() {
        ex12.whatsUpCall();
    }
}

class RunnableImplSkype implements Runnable {
    private Ex12 ex12;

    public RunnableImplSkype(Ex12 ex12) {
        this.ex12 = ex12;
    }

    @Override
    public void run() {
        ex12.skypeCall();
    }
}
