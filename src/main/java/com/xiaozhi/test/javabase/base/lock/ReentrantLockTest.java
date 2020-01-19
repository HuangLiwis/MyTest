package com.xiaozhi.test.javabase.base.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @author huangzhi on 2019-11-29.
 */
public class ReentrantLockTest {

    private final Lock lock = new ReentrantLock();

    public void reduceMoney(Money money) {
        lock.lock();
        try {
            int n = --money.moneyCount;
            try {
                //此处sleep要考虑主线程等待时间
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money.moneyCount = n;
            System.out.println(n);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Money money = new Money();
        money.moneyCount = 100;
        System.out.println("start:" + money.moneyCount);
        ReentrantLockTest reentrantLockTest = new ReentrantLockTest();

        for (int i = 0; i < 100; i++) {
            new Thread(() -> reentrantLockTest.reduceMoney(money)).start();
        }
        //保证所有线程执行完毕
        Thread.sleep(3000);

        System.out.println("result:" + money.moneyCount);
    }

    static class Money {

        int moneyCount;
    }
}
