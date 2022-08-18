package com.itheima.d2_string_constructor;

/*
String类的构造方法： 构造方法是创来创建对象的，API文档中提供了很多个String类的构造方法
    String()
              初始化一个新创建的 String 对象，使其表示一个空字符串。
    String(byte[] bytes)
              通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
    String(char[] value)
              分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。
    String(String original)
              初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。
    //字面值
    String s = "hello"; //最推荐, 可以 共享
 */
public class Demo2 {
    public static void main(String[] args) {
        //利用String()构造方法创建对象, 这是一个空的字符串
        String s = new String();
//        System.out.println(s);//不是地址值
//        System.out.println("s.length():" + s.length()); //字符串的长度(字符个数)  s.length():0


        //利用String(byte[] bytes)构造方法创建字符串对象，byte[]数组里面存储的是字符对应的编码值
        //可以将byte[],转成String
        //byte[] bts = new byte[] {65,66,67,68};
        byte[] bts = {65,66,67,68}; // 48-'0',65-'A',97-'a'
        String s2 = new String(bts);

//        System.out.println("s2:" + s2);// s2:ABCD
//        System.out.println("s2.length():" + s2.length()); // s2.length():4


        //利用 String(char[] value)构造方法创建字符串对象
        // 可以将char[] 转成 字符串
        char[] chars = {'a','b','c','中','国'};
        String s3 = new String(chars);

//        System.out.println("s3:" + s3);// s3:abc中国
//        System.out.println("s3.length():" + s3.length()); // s3.length():5


        //利用String(String s)创建字符串对象
        String s4 = new String("hello"); //浪费空间

//        System.out.println("s4:" + s4);// s4:hello
//        System.out.println("s4.length():" + s4.length()); // s4.length():5

        //直接量方式赋值
        String s5 = "world";

        //System.out.println(s5);

       // method1();
//        method2();
        method3();

    }

    //面试题1
    public static void method1() {
        String s1 = "abc"; //在常量池
        String s2 = new String("abc"); //new 对象在堆
        System.out.println(s1 == s2); //FALSE
    }

    //面试题2
    public static void method2() {
        String s1 = "abc";
        String s2 = "a" + "b" + "c";//有常量优化,编译后, String s2 = "abc";
        System.out.println(s1 == s2); //true ,常量池中的字符串对象可以共享
    }

    //面试题3
    public static void method3() {
        String s1 = "abc";
        String s2 = "a";
        String s3 = s2 + "bc"; //常量拼接,有优化,变量拼接,新开空间,完成拼接,最后结果转成字符串
        System.out.println(s1 == s3);//false
    }
}
