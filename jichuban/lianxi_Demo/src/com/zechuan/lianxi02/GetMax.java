package com.zechuan.lianxi02;

public class GetMax {
    /*定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。

            1. 定义方法getMax()，方法的参数是三个int类型变量a,b,c，方法的返回值是int类型。
            2. 在方法中使用多分支if...else...判断出最大值并返回。
            3. 在主方法中调用getMax()方法并接受返回值。
            4. 在主方法中打印结果。*/
    public static void main(String[] args) {

        //调用方法传入参数
        int max = getMax(5, 69, 36);
        //打印最大值
        System.out.println("最大值:" + max);
    }

    //定义方法
    private static int getMax(int a, int b, int c) {
        //判断出三个数中的最大值
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
}
