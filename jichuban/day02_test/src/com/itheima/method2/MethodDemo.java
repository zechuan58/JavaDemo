package com.itheima.method2;

public class MethodDemo {
    public static void main(String[] args) {
        int result = getMax(40, 30);
        System.out.println(result);
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
