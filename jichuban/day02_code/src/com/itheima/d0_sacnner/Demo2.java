package com.itheima.d0_sacnner;


import java.util.Scanner;

//扩展：键盘录入其实也可以录入其他类型的数据
public class Demo2 {
    public static void main(String[] args) {
        //创建键盘录入扫描器对象
        Scanner sc = new Scanner(System.in);

        //录入一个小数
        System.out.println("请录入你的分数(小数):");
        double xiaoshu = sc.nextDouble();

        //录入一个字符串
        System.out.println("请输入你的大名(字符串)：");
        String st = sc.next();
    }
}
