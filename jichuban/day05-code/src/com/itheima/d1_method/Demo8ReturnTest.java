package com.itheima.d1_method;

import java.util.Scanner;

/*
目标：有返回值的方法练习
需求：定义一个方法，求出两个整数的最大值并返回
 */
public class Demo8ReturnTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入第一个数:");
        int a=sc.nextInt();
        System.out.println("输入第二个数:");
        int b=sc.nextInt();
        System.out.println(max(a,b));
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


}
