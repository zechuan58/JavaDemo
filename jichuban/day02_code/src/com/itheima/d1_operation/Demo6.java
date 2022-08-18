package com.itheima.d1_operation;

/*
目标：掌握关系运算符的运算规律

关系运算符：> >= < <= == !=
    作用：对两个变量或者数值进行比较，比较的结果要么是true要么是false
 */
public class Demo6 {
    public static void main(String[] args) {
        //说出下面的结果是true还是false
        System.out.println(3 > 4); //
        System.out.println(3 < 4); //
        System.out.println(3 >= 4); //
        System.out.println(3 <= 4); //
        System.out.println(3 == 4); //
        System.out.println(3 != 4); //

        //注意：==和=的语义完全不一样
        int a = 10;
        int b = 20;
        //System.out.println(a=b); //
        //System.out.println(a==b); //
    }
}
