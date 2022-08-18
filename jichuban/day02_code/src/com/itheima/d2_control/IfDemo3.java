package com.itheima.d2_control;

import java.util.Scanner;

/*
目标：掌握if语句的格式3和执行流程(多选一)
格式：
    if(条件判断1){
        语句体1;
    }else if(条件判断2){
        语句体2;
    }
    ...
    else if(条件判断n){
        语句体n;
    }else{
        语句体n+1;
    }
 */
public class IfDemo3 {
    public static void main(String[] args) {
        //需求：键盘录入你考试的成绩，根据考试成绩在范围来发奖励
        //条件1: 分数>=95 并且 分数<=100, 奖励自行车一辆
        //条件2: 分数>=90 并且 分数<95, 奖励游乐园完一次
        //条件3: 分数>=80 并且 分数<90, 奖励一个恐龙玩偶一个
        //条件4: 分数<80  并且 分数>=60, 算是及格了
        //如果前面条件都不满足，揍一顿就好了

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你考试的成绩：");
        int score = sc.nextInt();


    }
}
