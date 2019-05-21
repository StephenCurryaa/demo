package com.example.demo.Deadlock;

import java.util.List;
import java.util.Random;

/**
 * Created by 170251 on 2018/5/11.
 */
public class Producer implements Runnable{
    List<Integer> cache;

    public Producer(List<Integer> cache) {
        this.cache = cache;
    }

    @Override
    public void run() {
        while (true) {
            produce();
        }
    }

    private void produce() {
        synchronized (cache) {
            try {
                while (cache.size() == 1) {
                    cache.wait();
                }

                // 模拟一秒生产一条消息
                Thread.sleep(1000);
                cache.add(new Random().nextInt());

                cache.notify();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
