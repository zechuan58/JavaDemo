package com.itheima.d1_switch;

import java.util.Scanner;

/*
case省略break的应用(如果有多个case值，匹配同一个语句就可以利用case穿透现象)
     案例：键盘录入一个月份，输出对应的季节
        3,4,5 春季
        6,7,8 夏季
        9,10,11 秋季
        12,1,2 冬季
 */
public class Demo3 {
    public static void main(String[] args) {
        //1. 键盘录入一个月份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份：");
        int month = sc.nextInt();

        //2.使用switch对录入的月份进行匹配


    }
}
