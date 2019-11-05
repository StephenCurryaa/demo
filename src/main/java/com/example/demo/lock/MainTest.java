package com.example.demo.lock;

/**
 * Created by 170251 on 2018/5/11.
 */
public class MainTest {
    public static void main(String[] args) {
        final Object resource01="resource01";
        final Object resource02="resource02";
        Thread01 thread01=new Thread01(resource01, resource02);
        Thread02 thread02=new Thread02(resource01, resource02);
        thread01.start();
        thread02.start();
    }
}
