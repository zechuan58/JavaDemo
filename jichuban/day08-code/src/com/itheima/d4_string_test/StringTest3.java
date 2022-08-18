package com.itheima.d4_string_test;

import java.util.Scanner;

/*
练习1：有一个字符串"张三,20,90", 使用","对字符串进行切割，然后将切割好的数据封装为Student对象

练习2：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
     最终效果为：156****1234
 */
public class StringTest3 {
    public static void main(String[] args) {
        method2();
        //method();
    }

    //练习2：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
    //输入: 15688881234
    //效果：156****1234   substring(0,3), substring(7)

            //  前3位 + "****" +  后4位
    /*
    分析思路：
        1. 键盘录入一个手机号字符串
        2. 截取前3位
        3. 截取后4位
        4. 拼接 前3位 + "****" +  后4位
        5. 打印结果字符串
     */
    public static void method2(){
//        1. 键盘录入一个手机号字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的手机号:");
        String phoneNum = sc.next();
//        2. 截取前3位
        String begin = phoneNum.substring(0,3);//包括起点,不包括终点
//        3. 截取后4位
        String end = phoneNum.substring(7);
//        4. 拼接 前3位 + "****" +  后4位
        String newPhoneNum = begin + "****" + end;
//        5. 打印结果字符串
        System.out.println("最后展示的手机号:" + newPhoneNum);
    }

    //练习1：有一个字符串"张三,20,90", 使用","对字符串进行切割，然后将切割好的数据封装为Student对象
    //姓名,年龄,分数
    /*
    分析思路：
           1.定义字符串变量,保存 "张三,20,90"
           2.切割字符串,得到String[] split
           3.定义Student类
           4.创建Student对象
           5.给Student对象的成员变量赋值,使用setName(name),setAge(age),setScore(score)
           6.打印Student对象的成员变量,使用getXXX()
     */
    public static void method(){
//        1.定义字符串变量,保存 "张三,20,90"
        String s = "张三,20,90";
//        2.切割字符串,得到String[] split
        String[] split = s.split(",");
//        3.定义Student类
//        4.创建Student对象
          Student stu = new Student();
//        5.给Student对象的成员变量赋值,使用setName(name),setAge(age),setScore(score)
         stu.setName(split[0]);
         stu.setAge(split[1]);
         stu.setScore(split[2]);
//        6.打印Student对象的成员变量,使用getXXX()
        System.out.println(stu.getName() + "," + stu.getAge() + "," + stu.getScore());
    }
}
