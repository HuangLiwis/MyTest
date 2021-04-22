package com.xiaozhi.test.javabase.base.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.springframework.beans.factory.annotation.Autowired;
public class TimeoutThread {

        public static void main(String[] args) {
            Executor executor= Executors.newSingleThreadExecutor();
            FutureTask<String> future=new FutureTask<String>(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    // TODO Auto-generated method stub
                    TimeoutThread m=new TimeoutThread();
                    return m.getValue();
                }
            });
            executor.execute(future);
            try{
                String result=future.get(1, TimeUnit.SECONDS);
                System.out.println(result);
            }catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println("方法执行中断");
                // future.cancel(true);
            }catch (ExecutionException e) {
                System.out.println("Excution异常");
                // TODO: handle exception
                future.cancel(true);
            }catch (TimeoutException e) {
                // TODO: handle exception
                System.out.println("方法执行时间超时");
                //future.cancel(true);
            }
            System.out.println("爱上大声地");
        }
        public String getValue(){
            try{
                Thread.sleep(33000);
            }catch (Exception e) {

                e.printStackTrace();// TODO: handle exception
            }
            return "阿斯顿撒旦阿斯顿 sad";
        }

}
