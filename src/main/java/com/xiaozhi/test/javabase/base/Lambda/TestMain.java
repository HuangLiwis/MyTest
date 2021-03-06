package com.xiaozhi.test.javabase.base.Lambda;


import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 小智 on 2017/10/29 0029.
 */
public class TestMain {

    public static int testInt(Integer a) {
        return 0;
    }

    public static void main(String[] args) {
        ComparisonProvider provider = new ComparisonProvider();
        List<Customer> customerList = Lists.newArrayList();
        customerList.add(new Customer("111", "111", (short) 1));
        //使用lambda表达式
        //对象的实例方法
        Customer[] customers = (Customer[]) customerList.toArray();


        Comparator<Customer> comparator = (a, b) -> Customer.compareName(a, b);

        Arrays.sort(customers, (a, b) -> provider.compareByAge(a, b));
        Arrays.sort(customers, comparator);

        Arrays.sort(customers, (a, b) -> Customer.compareName(a, b));


        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


        //使用方法引用
        Arrays.sort(customers, Customer::compareName);


        customerList.stream().mapToInt(Customer::getNumber);
        Arrays.sort(customers, provider::compareByName);
    }

    public void print() {
        if (new Object() {
            boolean print() {
                System.out.print("a");
                return false;
            }
        }.print()) {
            System.out.print("a");
        } else {
            System.out.print("b");
        }
    }
}
