package com.pb.andrejkijas.hw13;

import java.util.concurrent.TimeUnit;

class Consumer extends Thread {
    Producer prod;
    Consumer(Producer prod) {
        this.prod = prod;
    }

    public void run() {
        for(int i = 0; i < 10; i++)
        {
            try {
                System.out.println("\"Консюмируем\": " + prod.bq.poll(10, TimeUnit.SECONDS));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}