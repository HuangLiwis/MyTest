package com.xiaozhi.test.javabase.base.Lambda;

import java.util.List;
import com.google.common.collect.Lists;
import com.xiaozhi.test.javabase.base.Interface.MyRunnable;

/**
 * Created by 小智 on 2017/10/29 0029.
 */
public class LambdaTest {

    public static void main(String[] args) throws Exception {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 45, 6, 67, 68, 67, 7, 89, 87, 978, 1, 908, 1);
        long normalStartTime = System.currentTimeMillis();
        for (Integer integer : list) {
            int b = ++integer;
            System.out.println(b);
        }
        long normalEndTime = System.currentTimeMillis();
        System.out.println("for循环执行时间:" + (normalEndTime - normalStartTime));

        long lambdaStartTime = System.currentTimeMillis();
        list.stream().forEach(a -> {
            int b = ++a;
        });
        long lambdaEndTime = System.currentTimeMillis();
        System.out.println("stream循环执行时间:" + (lambdaEndTime - lambdaStartTime));
    }
}
