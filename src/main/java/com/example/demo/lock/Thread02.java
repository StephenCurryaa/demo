package com.example.demo.lock;

/**
 * Created by 170251 on 2018/5/11.
 */
public class Thread02 extends Thread{
    private Object resource01;
    private Object resource02;
    public Thread02(Object resource01, Object resource02) {
        this.resource01 = resource01;
        this.resource02 = resource02;
    }
    @Override
    public void run() {
        synchronized(resource02){
            System.out.println("Thread02 locked resource02");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (resource01) {
                System.out.println("Thread02 locked resource01");
            }
        }
    }
}
