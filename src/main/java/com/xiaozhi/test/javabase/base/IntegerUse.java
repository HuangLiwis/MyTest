package com.xiaozhi.test.javabase.base;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * @author huangzhi on 2019-10-12.
 */
public class IntegerUse {

    public static void main(String[] args) {
        //        Integer a = null;
        //        int b = a;
        //        System.out.println(b);
        Map<String, String> map = new HashMap(10);
        map.put("a", "aaa");
        map.forEach((k, v) -> {
            //doSomething
        });
        System.out.println(map.size());
        Set<Entry<String, String>> entries = map.entrySet();
        Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
        if (entries.iterator().hasNext()) {
            //doSomething
        }
        map.entrySet().forEach(a -> {
            a.getKey();
            a.getValue();
            //doSomething
        });

        Iterator<String> keyIterator = map.keySet().iterator();
        if (keyIterator.hasNext()) {
            //doSomething
        }

        map.keySet().forEach(key -> {
            String value = map.get(key);
            //doSomething
        });
        map.values().forEach(value -> {
            //doSomething
        });

        map.keySet();
        map.values();

        System.out.println(map.entrySet().size());
        System.out.println("----------");
        int n = 10;
        n = n - 1;
        n |= n >>> 1;
        System.out.println(n);
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);
    }
}
