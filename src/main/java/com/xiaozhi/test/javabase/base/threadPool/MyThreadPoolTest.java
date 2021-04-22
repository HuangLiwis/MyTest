package com.xiaozhi.test.javabase.base.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public class MyThreadPoolTest {

    public static void main(String[] args) {

        ExecutorService executorService = new ThreadPoolExecutor(1, 2,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(8));
        for (int i = 0; i < 10; i++) {
            final int n = i;
            executorService.execute(() -> {
                System.out.println("第" + n + "个线程执行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
