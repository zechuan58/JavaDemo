package com.zechuan.lianxi02;


//嵌套循环打印三角形
public class Sanjiaoxing {
    public static void main(String[] args) {
        /*for (int i = 0; i <= 5; i++) {//正三角
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");//打印空格
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");//打印空格加*
            }
            System.out.println();//换行
        }*/

        for (int i = 0; i <= 5; i++) {//倒三角
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");//打印空格
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(" *");//打印空格加*
            }
            System.out.println();//换行
        }

    }
}
