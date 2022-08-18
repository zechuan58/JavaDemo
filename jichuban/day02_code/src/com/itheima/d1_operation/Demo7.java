package com.itheima.d1_operation;

import java.util.Scanner;

/*
目标：掌握逻辑运算符的运算规则

逻辑运算符：对两个布尔类型数据放在一起运算，结果也是一个布尔类型
    &: 两边都是true,结果才是true
    |: 两边都是fasle,结果才是false
    ^: 两边相同则为false,两边不同则为true
    !: false变true,true变false
 */
public class Demo7 {
    public static void main(String[] args) {
        //&与运算: 左右两边都是true, 结果才是true; 否则都是false
        System.out.println(false & false); //
        System.out.println(false & true); //
        System.out.println(true & false); //
        System.out.println(true & true); //

        System.out.println("--------------");
        //|或运算：左右两边有一个为true,结果就为true; 否则结果为false
        System.out.println(false | false); //
        System.out.println(false | true); //
        System.out.println(true | false); //
        System.out.println(true | true); //

        System.out.println("--------------");

        //^异或运算: 两边相同则为false; 两边不同则为true
        //男女朋友： 男男 =false  女女=false ; 男女=true
        System.out.println(false ^ false); //
        System.out.println(false ^ true); //
        System.out.println(true ^ false); //
        System.out.println(true ^ true); //

        System.out.println("--------------");

        //!非运算
        System.out.println(!true); //
        System.out.println(!false); //
        System.out.println(!!true); //

        System.out.println("-----------------");
        //&& 运算短路效果：左边为false右边不参与运算
//        int a = 9;
//        //          false        && 不运算
//        boolean b = (a == 0) && (a++ > 10);
//        System.out.println("a="+a); //   a的结果为9，就验证了后面a++没有执行
//        System.out.println("b="+b); //
    }
}
