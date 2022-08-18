package com.itheima.d1_method;

import java.util.Scanner;

/*
目标：带参数的方法定义和调用

需求：写一个方法，判断任意一个数是奇数还是偶数，如果是奇数打印这个数是奇数，如果是偶数打印这个数是偶数
 */
public class Demo5Args {
    public static void main(String[] args) {
        System.out.println("请输入:");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        panDuanJiOu(a);
    }

    public static void panDuanJiOu(int a) {
        if (a % 2 == 0) {
            System.out.println("这个数是偶数");
        } else {
            System.out.println("这个数是奇数");
        }
    }

}
