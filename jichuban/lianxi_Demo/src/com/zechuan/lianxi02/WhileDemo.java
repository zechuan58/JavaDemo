package com.zechuan.lianxi02;

import java.util.Scanner;

/*
 需求：系统密码是520(整数!!!)，请用户不断的输入密码验证，验证不对输出
        密码错误，验证成功输出欢迎进入系统，并停止程序。

 分析：
       1.定义int变量保存已存在的密码
       2.键盘录入你登录的密码 int
       3.判断 2个密码是否一致
            true : 欢迎进入系统 ,break;
            FALSE: 密码错误
       4.while (true) {2,3 步}

 */
public class WhileDemo {

    public static void main(String[] args) {
        // 1.定义int变量保存已存在的密码
        //int password = 520;
        String password = "520";
        Scanner sc = new Scanner(System.in);

        while (true) {
            //2.键盘录入你登录的密码 int
            System.out.println("请输入您的密码:");
            //int pwd = sc.nextInt();//alt + enter
            String pwd = sc.next();//alt + enter

            // 3.判断 2个密码是否一致
            //if (pwd == password) {
            if (password.equals(pwd)) { //字符串比较要用 equals()方法
                System.out.println("欢迎进入系统");
                //结束死循环
                break;
            } else {
                System.out.println("密码错误");
            }
        }
    }
}
