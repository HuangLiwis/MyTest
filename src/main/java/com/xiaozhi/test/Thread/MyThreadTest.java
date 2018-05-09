package com.xiaozhi.test.Thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by huangzh on 2017/12/1.
 */
public class MyThreadTest {
    private volatile boolean isRunning = false;

    public static void main(String[] args) {
        MyThreadTest myThreadTest = new MyThreadTest();
        ExecutorService executor = Executors.newFixedThreadPool(12);
        for (int i = 0; i < 10; i++) {
            final int a = i;
            executor.submit(() -> myThreadTest.sayHello(a));
            System.out.println("已开启第" + i + "个线程");
        }
        executor.shutdown();
    }

    public void sayHello(int i) {
        if (isRunning) {
            return;
        }
        isRunning = true;
        try {
            Thread.sleep(5000L);
            System.out.println("hello" + i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            isRunning = false;
        }
    }
}
