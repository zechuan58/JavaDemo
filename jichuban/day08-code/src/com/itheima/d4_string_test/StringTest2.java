package com.itheima.d4_string_test;

import java.util.Scanner;

/*
练习：已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示

分析：
      步骤:
        1.定义2个字符串,表示已经存在的用户名和密码 admin,123456
        2.键盘录入用户名和密码,分2次录入
        3.比较键盘录入和已存在的用户名和密码
                相同
                    登录成功
                不相同
                    登录失败
        4.使用for循环,包裹 第2,3步

 */
public class StringTest2 {
    public static void main(String[] args) {
        //1.定义2个字符串,表示已经存在的用户名和密码 admin,123456
        String username = "admin";
        String password = "123456";

        //2.键盘录入用户名和密码,分2次录入
        Scanner sc = new Scanner(System.in);

        //4.使用for循环,包裹 第2,3步
        for (int i = 0; i < 3; i++) {

            System.out.println("请输入用户名:");
            String name = sc.next();

            System.out.println("请输入密码:");
            String pwd = sc.next();

            //3.比较键盘录入和已存在的用户名和密码
            if (username.equals(name) && password.equals(pwd)) { // equals(),比较字符串内容
                System.out.println("登录成功!");
                break;//结束循环
            } else {
                System.out.println("用户名或密码错误!");

                if (i == 2) { //最后一次了
                    System.out.println("你没有机会了");
                } else {
                    //打印还剩几次机会  2 , 1 , 0
                    System.out.println("您还剩" + (2 - i) + "次机会");
                    // i             0,  1,  2,
                }

            }
        }
    }
}
