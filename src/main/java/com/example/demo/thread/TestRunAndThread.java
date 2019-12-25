package com.example.demo.thread;

public class TestRunAndThread {
    private static void sayHello(){
        System.out.println("hello, world");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
//                sayHello();
                System.out.println("t"+Thread.currentThread().getName());
            }
        });

        thread.run();
//        thread.start();
        System.out.println("m"+Thread.currentThread().getName());

    }

}
