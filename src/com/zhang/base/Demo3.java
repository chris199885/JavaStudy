package com.zhang.base;

public class Demo3 {
    public static void main(String[] args){
        int i = 128;
        byte b = (byte)i; //强制转换
        System.out.println(i);
        System.out.println(b);
        /*
        1.不能对布尔值转换
        2.不能把对象类型转换为不想干的类型
        3.在吧高容量转换为低容量的时候。强制转换
        4.转换的时候可能存在内存溢出。或者精度问题
         */
    }
}
