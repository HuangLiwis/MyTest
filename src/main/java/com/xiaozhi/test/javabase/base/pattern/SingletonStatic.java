package com.xiaozhi.test.javabase.base.pattern;

/**
 * @author huangzhi on 2019-09-10.
 */
public class SingletonStatic {

    private SingletonStatic() {
    }

    public static SingletonStatic getInstance() {
        return MySingleton.SINGLETON_STATIC;
    }

    private static class MySingleton {

        private static final SingletonStatic SINGLETON_STATIC = new SingletonStatic();
    }
}
