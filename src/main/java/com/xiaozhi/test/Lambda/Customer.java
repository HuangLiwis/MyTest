package com.xiaozhi.test.Lambda;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 小智 on 2017/10/29 0029.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer{
    private String id;
    private String name;
    private int number;    //0:男  1:女

    public static int compareName(Customer a, Customer b){
        return a.getName().compareTo(b.getName());
    }

    public double getBigNumber(){
        double a = Math.tan(Math.log(number) * Math.sqrt(number));
        for (int i = 0; i < 100; i++) {
            a += Math.sin(a);
            a *= Math.log(a);
            a /= Math.cos(a);
        }
        return a;
    }
}
