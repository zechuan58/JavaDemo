package com.itheima.zuoye.day03;

public class Day03Demo1 {

    /*请打印出1988年到2020年的所有闰年年份。

    操作步骤:
    1、定义for循环,循环变量开始是1988,结束是2020.

    2、在循环中对年份进行判断,判读条件为:可以被4整除,并且不可以被100整除 , 或者可以被400整除.

    3、如果符合条件,输出该年份.*/
    public static void main(String[] args) {
        for (int year = 1988; year <= 2020; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + "是闰年");
            }
        }
    }
}
