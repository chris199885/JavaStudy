package com.zhang.struct;

import java.util.Scanner;

public class Demo02 {
    public Demo02() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容");
        String s = scanner.nextLine();
        if (s.equals("Hello")) {
            System.out.println(s);
        }

        System.out.println("End");
        scanner.close();
    }
}
