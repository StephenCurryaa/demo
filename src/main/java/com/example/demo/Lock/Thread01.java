package com.example.demo.Lock;

/**
 * Created by 170251 on 2018/5/11.
 */
public class Thread01 extends Thread{
    private Object resource01;
    private Object resource02;
    public Thread01(Object resource01, Object resource02) {
        this.resource01 = resource01;
        this.resource02 = resource02;
    }
    @Override
    public void run() {
        synchronized(resource01){
            System.out.println("Thread01 locked resource01");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (resource02) {
                System.out.println("Thread01 locked resource02");
            }
        }
    }
}
