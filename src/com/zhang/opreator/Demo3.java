package com.zhang.opreator;

public class Demo3 {
    public static void main(String[] args){
        //与（and）  或（or）  非（取反）、
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: "+(b&&a));
        System.out.println("a && b: "+(b||a));
        System.out.println("a && b: "+!(b&&a));
    }
}
