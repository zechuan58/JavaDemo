package com.itheima.d3_random;


import java.util.Random;
import java.util.Scanner;

/*
需求：
    1.随机产生一个[1,100]范围内的随机数，然后让用户猜是多少
    2.采用键盘录入的方式猜，
         如果猜大了，提示“猜大了”，还需要重新猜
         如果猜小了，提示"猜小了"，还需要重新猜
         如果猜中了，提示"恭喜你，猜中了"，结束游戏
分析：

 */
public class Demo2 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100) + 1;
        System.out.println(a);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入猜的数:");
            int b = sc.nextInt();
            if (a > b) {
                System.out.println("猜小了!");
            }
            if (a < b) {
                System.out.println("猜大了!");
            }
            if (a == b) {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
    }
}
