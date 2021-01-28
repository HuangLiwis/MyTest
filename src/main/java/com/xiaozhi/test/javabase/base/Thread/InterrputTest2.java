package com.xiaozhi.test.javabase.base.Thread;

public class InterrputTest2 {

    public static class MyThreadB extends Thread {

        @Override
        public void run() {
            super.run();
            try {
                for (int i = 0; i < 500000; i++) {
                    if (Thread.interrupted()) {
                        System.out.println("should be stopped and exit");
                        throw new InterruptedException();
                    }
                    System.out.println("i=" + (i + 1));
                }
                System.out.println("this line is also executed. thread does not stopped");//尽管线程被中断,但并没有结束运行。这行代码还是会被执行
            } catch (InterruptedException e) {
                //这样处理不好
                System.out.println("catch interrupted exception");
                e.printStackTrace();
                Thread.currentThread().interrupt();//这样处理比较好
                Thread.interrupted();
            }
        }
    }

    public static void main(String[] args) {
        try {
            MyThreadB thread = new MyThreadB();
            thread.start();
            Thread.sleep(20);//modify 2000 to 20
            thread.interrupt();//请求中断MyThread线程
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }

    public static class MyThreadA extends Thread {

        @Override
        public void run() {
            super.run();

        }
    }
}
