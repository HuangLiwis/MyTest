package com.xiaozhi.test.javabase.base.Stream;

import com.google.common.collect.Lists;
import com.xiaozhi.test.javabase.base.Lambda.Customer;

import java.util.List;

/**
 * Created by 小智 on 2017/10/29 0029.
 */
public class StreamAbilityTest {

    public static void main(String[] args) {
        List<Customer> customers = Lists.newArrayList();
        for (int i = 0; i < 1000; i++) {
            customers.add(new Customer("id" + i++, "name" + i++, (int) (Math.random() * 100000)));
        }
        double sum = 0;
        Long startTime = System.currentTimeMillis();
        for (Customer customer : customers) {
            //            sum += customer.getNumber();
            //            sum += customer.getNumber() * customer.getNumber();
            //            double a = Math.tan(Math.log(customer.getNumber()) * Math.sqrt(customer.getNumber()));
            double a = customer.getBigNumber();
            sum += a;
        }
        Long endTime = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println("for循环时间：" + (endTime - startTime));

        sum = 0;
        startTime = System.currentTimeMillis();
        sum = customers.stream().mapToDouble(Customer::getBigNumber).sum();
        //        sum = customers.stream().mapToDouble(
        //                a -> Math.tan(Math.log(a.getNumber()) * Math.sqrt(a.getNumber()))).max().getAsDouble();
        //sum = customers.stream().mapToLong(Customer::getNumber).sum();
        //sum = customers.stream().mapToLong(a -> a.getNumber() * a.getNumber()).sum();
        endTime = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println("stream时间：" + (endTime - startTime));
    }
}
