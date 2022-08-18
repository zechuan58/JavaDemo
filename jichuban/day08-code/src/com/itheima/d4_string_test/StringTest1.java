package com.itheima.d4_string_test;

import java.util.Scanner;

/*
练习1：键盘录入一个字符串，遍历字符串中的每一个字符，并打印输出
练习2：键盘录入一个字符串，求大写字母，小写字母，数字字符出现的个数
 */
public class StringTest1 {
    public static void main(String[] args) {
        //method1();
        method2();
    }

    public static void method1() {
        //练习1：键盘录入一个字符串，遍历字符串中的每一个字符，并打印输出
        //步骤:
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.next();

        //2.遍历字符串中的每个字符  charAt(int index),0, length()
        for (int i = 0; i < s.length(); i++) {
            //charAt(int index)
            char c = s.charAt(i);
            System.out.println(c);
        }
        //倒着遍历  s.length() - 1 --->  0  ,i--

    }

    public static void method2() {
      //练习2：键盘录入一个字符串，求大写字母，小写字母，数字字符出现的个数
        // "ABCabc0123"
        // 统计问题, 定义3个统计变量
        //  统计问题,套路
        // 遍历字符串
        //  每个字符 进行判断
        // char 编号  A 65, a 97, '0'  48
        // if (char >= '0' && char <= 9) 数字字符
        // if (char >= 'A' && char <= 'Z') 大写字符
         // if (char >= 'a' && char <= 'z') 小写字符
        //输出3个统计变量

        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.next();
        //2.定义3个统计变量
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        //统计中文字符
        int chineseCount = 0;
        //U+4E00..U+9FA5
        //3.遍历字符串,得到每个字符
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
        //4.对每个字符 进行判断
            // if (char >= '0' && char <= '9') 数字字符++
            // if (char >= 'A' && char <= 'Z') 大写字符++
            // if (char >= 'a' && char <= 'z') 小写字符++
            if (ch >= '0' && ch <= '9') {
                //数字字符++
                numberCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            }  else if (ch >= '\u4E00' && ch <= '\u9FA5') {
                chineseCount++;
            }
        }
        //5.输出3个统计变量
        System.out.println("大写字符个数:" + bigCount);
        System.out.println("小写字符个数:" + smallCount);
        System.out.println("数字字符个数:" + numberCount);
        System.out.println("中文字符个数:" + chineseCount);

    }
}
