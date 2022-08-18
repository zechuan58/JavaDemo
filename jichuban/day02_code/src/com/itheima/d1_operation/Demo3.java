package com.itheima.d1_operation;

//目标：掌握+作为字符串连接符的用法
/*
+符号运算规则
    1.有字符串参与运算，结果就是字符串；+符号起到的作用就是连接作用
    2.没有字符串参与运算，+符号起到的作用就是加法运算
 */
public class Demo3 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("abc" + 'a'); // abca
        System.out.println("abc" + a);  // abc5
        System.out.println(5 + a);   // 10
        System.out.println("abc" + 5 + 'a');//
        System.out.println(15 + "abc" + 15);//
        System.out.println(a + 'a'); //
        System.out.println(a + "" +'a');//
        System.out.println(a + 'a'+" itheima ");//
        System.out.println("itheima"+ a + 'a');//
        System.out.println("itheima"+ ( a + 'a' ));//
    }
}
