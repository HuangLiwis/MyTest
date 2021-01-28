package com.xiaozhi.test.javabase.base.string;

public class BoonTest {

    public static void main(String[] args) {
        Boolean a = new Boolean(true);
        Boolean b = new Boolean(true);
        System.out.println(a == b);

        Boolean c = true;
        Boolean d = true;
        System.out.println(c == d);

        Integer q = new Integer(1);
        Integer w = new Integer(1);
        System.out.println(q == w);

        Integer r = Integer.valueOf(1);
        Integer t = Integer.valueOf(1);
        System.out.println(r == t);
    }
}
