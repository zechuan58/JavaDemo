package com.itheima.d1_method;

/*
目标：理解什么是方法重载
方法重载指的是，在同一个类中方法名相同，参数列表不一样
 */
public class Demo10 {
    public static void main(String[] args) {
        System.out.println(sum(50,60));
        System.out.println(sum(6.3,9.9));
    }

    //写个方法,求2个int数的和
    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    //再写个方法,求2个小数的和
    public static double sum(double a, double b) {
        double c = a + b;
        return c;
        //调用一下,你写的2个方法

    }
}
