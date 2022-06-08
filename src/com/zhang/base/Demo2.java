package com.zhang.base;

public class Demo2 {
    public static void main(String[] args){
        //整数拓展： 进制    二进制0b    十进制     八进制0     十六进制0x
        int i = 10;
        int i2 = 010;
        int i3 = 0x11;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        //浮点数扩展   银行业务 BigDecimal
        float f = 0.1f;
        double b = 1.0/10;
        System.out.println(f==b); //判断是否相等

        //字符拓展？   所有的字符本质还是数字
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int)c2);
        //转义字符
        // \t 制表符
        // \n 换行

        System.out.println("com.zhang.base.Hello\tWorld");
        System.out.println("com.zhang.base.Hello\nWorld");

        //

    }
}
