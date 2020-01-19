package com.xiaozhi.test.javabase.base.StringCalculation;

public class OverrideTest {

    public void test1(){
        return;
    }
    public void test1(int a){
        return;
    }

    public static void main(String[] args) {
        Integer integer1 =3;
        Integer integer2 = 3;
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));
    }
}
