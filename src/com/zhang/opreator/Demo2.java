package com.zhang.opreator;

public class Demo2 {
    public static void main(String[] args){
        //++ -- 自增 自减 一元运算符
        int a = 3;
        System.out.println(a);
        int b = a++;// a++ a = a+1 先使用再+1
        System.out.println(a);
        int c = ++a;// ++a 先加一在使用
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
