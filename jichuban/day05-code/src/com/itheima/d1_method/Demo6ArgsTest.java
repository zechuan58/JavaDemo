package com.itheima.d1_method;

import java.util.Scanner;

/*
目标：带参数方法的练习

需求：定义一个方法，方法中打印出 n-m 之间所有的偶数，并调用方法
 */
public class Demo6ArgsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入开始值:");
        int n = sc.nextInt();
        System.out.println("输入结束值:");
        int m = sc.nextInt();
        System.out.println(n + "-" + m + "之间的偶数有:");
        ouShu(n, m);
    }

    public static void ouShu(int n, int m) {
        int count = 0;
        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }


}
