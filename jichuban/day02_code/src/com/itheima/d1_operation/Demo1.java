package com.itheima.d1_operation;

/*
目标：掌握算数运算符的作用

算数运算符： + - * /
    + : 两个变量或者数值做加法运算
    - : 两个变量或者数值做减法运算
    * : 两个变量或者数值做乘法运算
    / : 两个变量或者数值做除法运算，结果取商
        注意：整数相除只能得到整数

    % (模): 两个变量或者数值做除法运算，结果取余数
 */
public class Demo1 {
    public static void main(String[] args) {
        //求两个整数5加上2的和
        int sum = 5 + 2;
        System.out.println(sum); //

        //求两个整数5减去2的差
        int sub = 5 - 2;
        System.out.println(sub); //

        //乘法
        System.out.println( 5 * 2 );

        //求两个整数5除以2的商
        int div = 0;
        System.out.println(div); //??

        //求两个整数5除以2的余数
        int mod = 0;
        System.out.println(mod); //??

//        System.out.println(8 % 5 );
//        System.out.println(5 % 5 );
//        System.out.println(3 % 5 );
//        System.out.println("===========================");
//
//        System.out.println(-8 % 5 );
//        System.out.println(8 % -5 );
    }
}
