package com.itheima.d1_method;

import java.util.Scanner;

/*
目标：带参数方法的练习

需求：定义一个方法，方法中打印出 n 次 HelloWorld
 */
public class Demo7ArgsTest2 {
    public static void main(String[] args) {
        System.out.println("请输入打印次数:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printHelloWorld(n);
    }

    public static void printHelloWorld(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("HelloWorld");
        }
    }


}
