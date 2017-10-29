package com.xiaozhi.test.Lambda;

/**
 * Created by 小智 on 2017/10/29 0029.
 */
public class ComparisonProvider{


    public int compareByName(Customer a, Customer b){
        return a.getName().compareTo(b.getName());
    }

    public int compareByAge(Customer a, Customer b){
        return a.getId().compareTo(b.getId());
    }
}
