package com.example.demo;

/**
 * Created by 170251 on 2018/5/8.
 */
public class SingletonDemo {
//    private static SingletonDemo instance;
//    private SingletonDemo(){
//
//    }
//    public static synchronized SingletonDemo getInstance(){
//        if(instance==null){
//            instance=new SingletonDemo();
//        }
//        return instance;
//    }
    /**
     静态类内部加载
     */
//    private static class SingletonHolder{
//        private static SingletonDemo instance=new SingletonDemo();
//    }
//    private SingletonDemo(){
//        System.out.println("Singleton has loaded");
//    }
//    public static SingletonDemo getInstance(){
//        return SingletonHolder.instance;
//    }
    private static SingletonDemo instance=new SingletonDemo();
    private SingletonDemo(){

    }
    public static SingletonDemo getInstance(){
        return instance;
    }
}
