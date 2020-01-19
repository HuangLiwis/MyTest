package com.xiaozhi.test.javabase.base.Stream;

import com.google.common.collect.Lists;
import com.xiaozhi.test.javabase.base.Lambda.Customer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by 小智 on 2017/10/29 0029.
 */
public class StreamTest{
    public static void main(String[] args){
        List<Customer> customers = Lists.newArrayList();
        Map<String,List<Customer>> map = customers.stream()
                .distinct()
                .filter(a -> a.getName().length() > 3)
                .collect(Collectors.groupingBy(Customer::getId));
        //.collect(Collectors.toMap(a -> a.getId(), a -> a, (key1, key2) -> key1, HashMap::new));
    }
}
