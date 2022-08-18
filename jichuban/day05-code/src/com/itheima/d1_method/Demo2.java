package com.itheima.d1_method;

/*
目标: 不带参数的方法定义和调用案例

需求：定义一个方法，方法中给定一个整数变量（数值随意），方法中判断出该数据是奇数还是偶数，并调用方法
 */
public class Demo2 {
    public static void main(String[] args) {
        zhengShu();
    }

    public static void zhengShu() {
        int a = 35;
        if (a % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }


}
