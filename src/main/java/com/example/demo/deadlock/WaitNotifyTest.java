package com.example.demo.deadlock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 170251 on 2018/5/11.
 */
public class WaitNotifyTest {
    public static void main(String[] args) throws Exception {
        List<Integer> cache = new ArrayList();
        new Thread(new Consumer(cache)).start();
        new Thread(new Producer(cache)).start();
    }
}
