package com.itheima.d2_control;

import java.util.Scanner;

/*
目标：掌握if语句的第一种格式（一选一）
格式：
    if(条件判断){
        语句体;
    }
 */
public class IfDemo1 {
    public static void main(String[] args) {
        //需求：键盘录入你当前的体温，判断是否发烧(>37)；如果发烧，拉去隔离;
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入你的体温（小数）");
        double temperature = sc.nextDouble();

        //判断体温是否大于37度

    }
}
