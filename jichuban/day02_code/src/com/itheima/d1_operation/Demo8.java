package com.itheima.d1_operation;

import java.util.Scanner;

/*
目标：掌握三元运算符的运算规则
三元运算符格式：
    数据类型 f = 判断语句? 值1: 值2;

三元运算作用：一般用于对条件进行判断，根据条件是真还是假还决定结果是值1还是值2
 */
public class Demo8 {
    public static void main(String[] args) {
        //需求：键盘录入一个成绩，判断成绩是及格还是不及格，如果及格打印"及格"，不及格打印"不及格"
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个学生的成绩：");
        int score = sc.nextInt();

        //执行流程：先判断score>=60是否成立
        //如果结果为true, 返回"及格"
        //如果结果false, 返回"不及格"

    }
}
