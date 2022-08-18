package com.itheima.d1_method;

/*
目标：不带参数的方法定义和调用练习

需求：定义一个方法，方法中打印出 1-10之间所有的偶数，并调用方法
 */
public class Demo4Debug {
    public static void main(String[] args) {
        System.out.println("begin");
        print();
        System.out.println("end");
    }

    public static void print() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }


}
