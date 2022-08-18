package com.itheima.d1_operation;

/*
目标：掌握数据类型转换规则
数据类型转换
    自动类型转换：小类型变大类型
    强制类型转换：大类型变小类型
 */
public class Demo2 {
    public static void main(String[] args) {
        //1.基本的自动类型转换（将小类型的数据赋值给大类型的变量）
        int i = 10;
        // double = int;
        double d = i;
        float f = 100F;
        System.out.println(d);
        System.out.println(f);
        //long = int , float = long, double = float ??


        //2.运算过程中的自动类型转换（小类型的数据会自动转换为大类型的数据再运算）
//        int x = 10;
//        double y = 12.3;
//        double z = x + y;
//        System.out.println(z); //

        //3.byte short char这三种类型会直接转换为int类型再参与运算
//        byte n = 10;
//        byte m = 20;
//        byte w = n + m;
//        System.out.println(w); //

        //4.char字符做运算也会转换为字符对应的编码值int在做运算
//        char ch = 'a';
//        int  num = ch+1;
//        System.out.println(num); //

        //5.强制类型转换
//        double k = 12.8;
//        // int h = k;
//        System.out.println(h); //
    }
}
