package com.xiaozhi.test.javabase.base.Interface;

/**
 * Created by 小智 on 2017/10/29 0029.
 */

public interface TestInterface extends FunctionalInterface{
    static String staticFunction(){
        return "static function";
    }

    default String defaultFunction(){
        return "default function";
    }
}
