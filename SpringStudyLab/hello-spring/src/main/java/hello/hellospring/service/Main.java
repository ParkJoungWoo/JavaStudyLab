package hello.hellospring.service;

public class Main extends Thread {
    int value;
    Object key;
    public Main() {
        key = new Object();
    }
    public Object getKey() {
        return key;
    }
    public synchronized void increase() {
        value++;
        System.out.print(value + " , ");
    }
    public boolean over10() {
        return value >= 10;
    }
    public void run() {
        synchronized (key) {
            try {
                increase();
                System.out.println("enter to non-runnable state");
                key.wait();
            } catch (InterruptedException ie) {
            }
            System.out.println("return to runnable state");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Main thread = new Main();
        thread.start();
        while (true) {
            if (thread.over10()) {
                synchronized (thread.getKey()) {
                    thread.getKey().notify();
                }
                break;
            } else {
                thread.increase();
            }
            Thread.sleep(10);
        }
    }
}



