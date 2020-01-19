package com.xiaozhi.test.javabase.base.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by huangzh on 2018/5/9.
 */
public class RegexTest {
    public static void main(String[] args) {
        String a = "#{a11aaaa}${aaa}";
        String regex = "(\\$|#)\\{([A-Za-z_]{1}.*?)\\}";            // ^\$\{*+\}$
        System.out.println(a.matches(regex));
        String s[] = a.split(regex);
        System.out.println("s:"+s.toString());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(a);

        if (matcher.find()) {
            matcher.reset();
            while (matcher.find()) {
                System.err.println("0:"+matcher.group(0));
                System.err.println("1:"+matcher.group(1));
                System.err.println("2:"+matcher.group(2));
            }
        }
    }
}
