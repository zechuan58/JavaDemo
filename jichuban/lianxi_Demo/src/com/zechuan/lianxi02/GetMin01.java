package com.zechuan.lianxi02;

public class GetMin01 {
    /*定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。

            1. 定义方法getMin()，方法的参数是double a ，double b。
            2. 在方法中对两个数字进行判断，返回较小值。
            3. 在主方法中调用getMin()方法并接受返回值。
            4. 在主方法中打印结果。*/
    public static void main(String[] args) {
        //调用方法
        double min = getMin(3.14, 5.16);
        //输出结果
        System.out.println("较小值:" + min);
    }

    //定义方法
    private static double getMin(double a, double b) {
        //比较两者大小,返回较小值
        return a > b ? b : a;
    }
}
