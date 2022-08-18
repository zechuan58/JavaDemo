package com.zechuan.lianxi02;

public class LingXing {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {//正三角
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");//打印空格
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");//打印空格加*
            }
            System.out.println();
        }
        for (int i = 0; i <= 3; i++) {//倒三角
            for (int j = 0; j <= i+1; j++) {
                System.out.print(" ");//打印空格
            }
            for (int j = 2; j >= i; j--) {
                System.out.print(" *");//打印空格加*
            }
            System.out.println();//换行
        }
    }
}
