package com.xiaozhi.test.javabase.base.interview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RecursiveTask;
public class MyTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> future1 = new FutureTask<>(new MyThread(1, 2));
        FutureTask<Integer> future2 = new FutureTask<>(new MyThread(1, 2));
        FutureTask<Integer> future3 = new FutureTask<>(new MyThread(1, 2));
        future1.run();
        future2.run();
        future3.run();
        int futureResult1 = future1.get().intValue();
        int futureResult2 = future2.get().intValue();
        int futureResult3 = future3.get().intValue();

        System.out.println(futureResult1 + futureResult2 + futureResult3);
    }

    public static class MyThread implements Callable {

        private int a;

        private int b;

        public MyThread(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public Object call() throws Exception {
            return a + b;
        }
    }
}
