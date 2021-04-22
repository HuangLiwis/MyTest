package com.xiaozhi.test.javabase.base.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @author huangzhi on 2019-11-29.
 */
public class syncTest {

    public static void main(String[] args) throws InterruptedException {
        Lock lock =new ReentrantLock();

        new Thread(()->{
            syncTest syncTest=new syncTest();
            try {
                lock.lock();
                syncTest.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();
        Thread.sleep(1000*100*10);
    }

}
