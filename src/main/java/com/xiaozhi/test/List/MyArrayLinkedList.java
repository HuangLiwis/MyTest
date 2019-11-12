package com.xiaozhi.test.List;

import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;
/**
 * @author huangzhi on 2019-11-05.
 */
public class MyArrayLinkedList {

    public static void main(String[] args) {
        ArrayLinkedList<String> arrayLinkedList=new ArrayLinkedList<>();
        arrayLinkedList.add("a");
        System.out.println(arrayLinkedList);
    }



}
