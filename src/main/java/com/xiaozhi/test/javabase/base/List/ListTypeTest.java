package com.xiaozhi.test.javabase.base.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import com.google.common.collect.Maps;
public class ListTypeTest {

    public static void main(String[] args) {
        Map<String,Object> map= Maps.newHashMap();
        map.put("a",new ArrayList<>());
        map.put("b",new LinkedList<>());
        for (Object value : map.values()) {
            System.out.println(value.getClass());
        }
        Entry<String, Object> next = map.entrySet().iterator().next();
    }

    public static void init(Map<String,Object> bizContent) {
        Iterator<Entry<String, Object>>  it = bizContent.entrySet().iterator();
        while (it.hasNext()){
            Entry<String, Object> next = it.next();
        }
    }
}
