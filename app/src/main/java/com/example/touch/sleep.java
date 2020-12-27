package com.example.touch;

public class sleep extends Thread {
    long delay=0;
    sleep(long a)
    {
        this.delay=a;
    }
    @Override
    public void run() {
        try {
            sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
