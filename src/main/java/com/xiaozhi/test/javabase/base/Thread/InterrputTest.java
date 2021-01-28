package com.xiaozhi.test.javabase.base.Thread;

/**
 * @author huangzhi on 2019-12-09.
 */
public class InterrputTest {

    public static void main(String[] args) throws InterruptedException {
        Thread threadA=new Thread(()->{
            System.out.println("A线程开始");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println();
                e.printStackTrace();
            }
            System.out.println("A线程执行完成");
        });
        Thread thread = new Thread(() -> {
            while (true) {
                // 响应中断
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Java技术栈线程被中断，程序退出。");
                    break;
                }

                try {
                    threadA.join();
                } catch (InterruptedException e) {
                    System.out.println("ThreadA被中断");
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
                System.out.println("join中断之后继续执行");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Java技术栈线程休眠被中断，程序退出。");
                    Thread.currentThread().interrupt();
                }

                System.out.println("睡醒之后继续执行");
            }
        });
        thread.start();
        threadA.start();
        Thread.sleep(200);
        thread.interrupt();
    }



}
