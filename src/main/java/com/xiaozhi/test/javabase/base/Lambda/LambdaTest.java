package com.xiaozhi.test.javabase.base.Lambda;

import com.xiaozhi.test.javabase.base.Interface.MyRunnable;

/**
 * Created by 小智 on 2017/10/29 0029.
 */
public class LambdaTest{
    public static void main(String[] args) throws Exception{
        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Hello World!");
            }
        }).start();

        new Thread(() -> System.out.println("Hello World!")).start();


        Runnable r1 = () -> System.out.println("Hello Lambda!");
        MyRunnable r2 = () -> System.out.println("Hello Lambda!");

        Customer customer = new Customer();
        int a = 1;
        Runnable r = () -> {
            System.out.println("Hello Lambda!");
        };
    }
}
