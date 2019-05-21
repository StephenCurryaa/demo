package com.example.demo.Deadlock;

import java.util.List;

/**
 * Created by 170251 on 2018/5/11.
 */
public class Consumer implements Runnable {
    List<Integer> cache;

    public Consumer(List<Integer> cache) {
        this.cache = cache;
    }

    @Override
    public void run() {
        while (true) {
            consume();
        }
    }

    private void consume() {
        synchronized (cache) {
            try {
                while (cache.isEmpty()) {
                    cache.wait();
                }

                System.out.println("Consumer consumed [" + cache.remove(0) + "]");
                cache.notify();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
