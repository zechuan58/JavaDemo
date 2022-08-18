package com.itheima.compare;

public class CompareDemo {//方法重载
    public static void main(String[] args) {
        int a=20;
        int b=20;
        System.out.println(compare(a,b));
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }

    public static boolean compare(byte a, byte b) {
        return a == b;
    }

    public static boolean compare(short a, short b) {
        return a == b;
    }

}
