package com.itheima.method;

import java.util.Scanner;

public class method02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个数：");
            int a = sc.nextInt();
            if (a < 0) {
                System.out.println("程序结束，谢谢使用！");
                break;
            }
            isEvenNumber(a);//实际参数
        }
    }

    public static void isEvenNumber(int num) {//形式参数
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
