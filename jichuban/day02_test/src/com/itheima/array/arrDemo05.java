package com.itheima.array;

import java.util.Scanner;

public class arrDemo05 {//输入六个0-100的成绩,去掉一个最高分去掉一个最低分,计算平均分
    public static void main(String[] args) {
        int[] arr = new int[6];//定义数组大小为6
        Scanner sc = new Scanner(System.in);//键盘录入
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个分数");//输入成绩
            int score = sc.nextInt();//获取键盘录入
            if (score >= 0 && score <= 100) {//判断分数是否合法
                arr[i] = score;
            } else {
                System.out.println("输入成绩有误,请检查!!");//不合法重新输入
                i--;
            }
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {//找出最大分数
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {//找出最小分数
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {//计算总分
            sum += arr[i];
        }
        int avg=(sum-max-min)/(arr.length-2);//去掉一个最高分和一个最低分,计算出平均分
        System.out.println("去掉一个最高分,去掉一个最低分,最终平均分为:"+avg);
    }
}
