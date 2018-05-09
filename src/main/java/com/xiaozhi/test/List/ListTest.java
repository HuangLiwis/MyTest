package com.xiaozhi.test.List;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangzh on 2017/11/15.
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("1");
        names.add("2");
        names.forEach(System.out::println);
    }
}
