package com.xiaozhi.test.javabase.base.interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
public class MyTest0330 {

    public static void main(String[] args) {
        LinkedBlockingQueue queue = new LinkedBlockingQueue(100);
        new Thread(new Productor(queue)).start();
        new Thread(new Consumer(queue)).start();
    }

    static class Productor implements Runnable {

        LinkedBlockingQueue queue;

        public Productor(LinkedBlockingQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            for (; ; ) {
                try {
                    Object object = queue.take();
                    System.out.println(object);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable {

        LinkedBlockingQueue queue;

        public Consumer(LinkedBlockingQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            for (; ; ) {
                try {
                    Object object = new Object();
                    queue.put(object);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
