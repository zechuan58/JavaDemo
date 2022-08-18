package com.itheima.d1_method;

import java.util.Scanner;

/*
目标：有返回值的方法定义和调用

需求：写一个方法，求两个整数的和，并且把和值返回给调用者。
 */
public class Demo8Return {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sum(10,20);
        System.out.println(sum);
    }
public static int sum(int a,int b){
        int c=a+b;
        return c;
}


}
