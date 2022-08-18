package com.itheima.d0_sacnner;

//  第一步：导包 import java.util.Scanner;  写在类的上边

import java.util.Scanner;

//目标：掌握键盘录入的使用步骤
/*
 第一步：导包 import java.util.Scanner;  写在类的上边
 第二步：创建Scanner扫描器对象
        Scanenr sc = new Scanner(System.in);
 第三步：获取键盘录入的数据
        int a = sc.nextInt();
 */
public class Demo1 {
    public static void main(String[] args) {
        //第二步：创建Scanner扫描器对象
        Scanner sc = new Scanner(System.in);

        //第三步：获取键盘录入的数据
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();

        System.out.println("请再输入一个整数：");
        int b = sc.nextInt();
        //2个数求和
        int sum=a+b;
        //打印结果
        System.out.println(sum);

    }
}
