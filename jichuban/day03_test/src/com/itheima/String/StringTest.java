package com.itheima.String;

import java.util.Scanner;


//屏蔽电话号码中的四位数---字符截取,调用substring方法
public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话号:");

        //获取电话号码
        String telNumber=sc.nextLine();

        //获取电话号码前三位
        String start=telNumber.substring(0,3);

        //获取电话号码后四位
        String end=telNumber.substring(7);

        System.out.println(start+"****"+end);
    }
}
