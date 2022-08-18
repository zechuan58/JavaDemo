package com.itheima.d2_control;

import java.util.Scanner;

/*
目标：掌握if语句的格式二和执行流程(二选一)
格式：
    if(条件判断){
        语句体1;
    }else{
        语句体2;
    }
 */
public class IfDemo2 {
    public static void main(String[] args) {
        //需求：键盘录入你当前的体温，判断是否发烧(>37)；如果发烧，拉去隔离; 如果不发烧教室上课
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的体温：");
        double temperature = sc.nextDouble();

        //如果发烧，拉去隔离; 如果不发烧教室上课

        System.out.println("-------------------");
        //键盘录入一个成绩，判断成绩是否合格
        System.out.println("请输入你的成绩：");
        int score = sc.nextInt();

        String result = ""; //用来记录判断后的结果,如果成绩>=60,将"及格" 赋值给result,否则将"不及格"赋值给result

        System.out.println(result);
    }
}
