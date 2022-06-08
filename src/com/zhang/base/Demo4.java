package com.zhang.base;

public class Demo4 {
    public static void main(String[] args){
        //操作比较大的数的时候，注意溢出问题
        //JDK7新特性，数字之间可以用下划线分割
        int Money = 10_0000_0000;
        int Years = 20;
        long total = Money*((long)Years);
        System.out.println(total);
    }
}
