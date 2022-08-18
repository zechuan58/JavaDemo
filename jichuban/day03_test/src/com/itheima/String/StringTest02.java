package com.itheima.String;

import java.util.Scanner;
import java.util.Random;

//敏感词替换---replace方法
public class StringTest02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入:");
        String s= sc.nextLine();
        String result =s.replace("TMD","***");
        System.out.println(result);
    }
}
