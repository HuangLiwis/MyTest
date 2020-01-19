package com.xiaozhi.test.javabase.base.lock;

import java.util.concurrent.locks.LockSupport;
/**
 * @author huangzhi on 2019-11-29.
 */
public class UnLockTest {

    public static void main(String[] args) {
        LockSupport.parkUntil(1);
    }

}
