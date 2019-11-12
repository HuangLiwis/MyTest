package com.xiaozhi.test.pattern;

import sun.misc.Unsafe;
/**
 * @author huangzhi on 2019-09-10.
 */
public class Singleton {

    /**
     * 由于编译器优化了程序指令, 允许对象在构造函数未调用完前, 将共享变量的引用指向部分构造的对象, 虽然对象未完全实例化, 但已经不为null了
     * 增加volatile防止指令重排
     */
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
