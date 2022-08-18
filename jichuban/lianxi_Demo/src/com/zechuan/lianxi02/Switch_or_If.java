package com.zechuan.lianxi02;

import java.util.Scanner;

public class Switch_or_If {
    /*通过键盘录入的方式输入星期数(1-7的整数)，显示今天的减肥活动，使用switch和if两种判断语句分别完成。
            周一：跑步
            周二：游泳
            周三：慢走
            周四：动感单车
            周五：拳击
            周六：爬山
            周日：好好吃一顿

**操作步骤**

           1:键盘录入一个1-7的星期数，用一个变量week接收。
           2:对week进行判断，用if和switch两种方式分别完成。
           3:在对应的语句控制中输出对应的减肥活动。*/

    /*    switch方法
    public static void main(String[] args) {

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数:");
        //赋值给week
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢跑");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入星期数有误!");
        }
    }*/

    public static void main(String[] args) {

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数:");
        //接收键盘录入
        int week = sc.nextInt();

        if ( week<1 || week > 7) {
            System.out.println("输入星期数有误!!!");
        } else if (week == 1) {
            System.out.println("跑步");
        } else if (week == 2) {
            System.out.println("游泳");
        } else if (week == 3) {
            System.out.println("慢跑");
        } else if (week == 4) {
            System.out.println("动感单车");
        } else if (week == 5) {
            System.out.println("拳击");
        } else if (week == 6) {
            System.out.println("爬山");
        } else
            System.out.println("好好吃一顿");
    }
}

