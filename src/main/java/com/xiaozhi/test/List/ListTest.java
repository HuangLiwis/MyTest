package com.xiaozhi.test.List;

import com.google.common.collect.Lists;
import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 * Created by huangzh on 2017/11/15.
 */
public class ListTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(4);
        names.add("1");
        names.add("2");
        names.add("3");
        names.add("4");
        names.add("5");
        names.add("6");

        List<String> list = names.subList(1, 2);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(names);

        //        for (String name : names) {
//            if (name.equals("2")) {
//                names.remove(name);
//            }
//        }
//
//        for (int i = 0; i < names.size(); i++) {
//            if (names.get(i).equals("2")) {
//                names.remove(i+1);
//            }
//        }

//        for (int i = names.size() - 1; i >= 0; i--) {
//            if (names.get(i).equals("2")) {
//                names.remove(i);
//            }
//        }
        System.out.println(names);
        ArrayLinkedList arrayLinkedList;
        Vector vector;
        LinkedList linkedList;
        HashSet set;
        Stack stack;
    }
}
