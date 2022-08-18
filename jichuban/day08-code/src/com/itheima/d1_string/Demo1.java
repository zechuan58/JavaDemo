package com.itheima.d1_string;

/*
String类的特点：
    1.所有的字符串字面值，都是String类的对象
    2.字符串是常量，一旦创建，其内容不能更改
        解释：字符串不能发生改变，指的是字符的内容不能发生改变
        String s = "abc";
        s = "hello"; //这是把"hello"这个字符串重新赋值给了变量s, 但是"abc"这个字符串还在内存中保留着
    3.字符串虽然不可变，但是可以被共享
        解释：字符串字面值存储在常量池中，常量池中的数据可以被共享。
        String s1 = "java";
        String s2 = "java"
        System.out.println(s1==s2); //true 同一个地址

学习String类有什么用呢？
    主要学习的就是String类的构造方法、 String类的成员方法
 */
public class Demo1 {
    public static void main(String[] args) {
        //1.所有的字符串字面值，都是String类的对象
//        String s = "abc中国"; //对象
//        int length = s.length();//获取字符串的长度(字符个数)
//        //NullPointerException: 没有创建对象,调用对象的任何方法,都会抛出此异常
//        System.out.println(length);

       // System.out.println("abc".length());

//        String str = "hello";
//        System.out.println(str);//字符串很特殊,打印字符串对象,不是地址值,是字符串的内容


        //2.字符串是常量，一旦创建，字符串其内容不能更改
//        String s2 = "hello";
//        s2 = "world";
//        System.out.println(s2); // world

        //3.字符串虽然不可变，但是可以被共享
        String s3 = "java";
        String s4 = "java";
//        // == 用于基本类型比较,是比较数据值是否相等
//        // == 用于引用类型比较,是比较地址值是否相等
        System.out.println(s3 == s4);// true
    }
}
