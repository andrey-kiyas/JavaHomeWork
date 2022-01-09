package com.pb.andrejkijas.hw13;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer extends Thread {
    BlockingQueue<String> bq;
    Producer() {
        bq = new ArrayBlockingQueue<String>(5);
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("\"Продюсируем\": " + i);
                bq.put("" + i);
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}