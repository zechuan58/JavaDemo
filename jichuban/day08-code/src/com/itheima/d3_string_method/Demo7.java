package com.itheima.d3_string_method;

/*
String类的方法：在调用方法之前，必须先准备好一个字符串对象，然后用对象调用方法。

    字符串比较大小
         public int compareTo(String anotherString)
            按照字典顺序比较两个字符串的大小
            参数：被比较的另一个字符串
            返回值：
                    正数、调用方法的当前字符串较大
                    负数、参数字符串较大
                    0，   2个字符串内容相等

         作用: 可以对多个字符串进行排序
 */
public class Demo7 {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "bbb";

        //分别演示,正数,负数,0, 内容相同但长度不同
        //正数
        //System.out.println("bbb".compareTo("aaa"));//1
        //负数
        //System.out.println("aaa".compareTo("bbb"));// -1
        //0
        //System.out.println("aaa".compareTo("aaa"));// 0

        //如果2个字符串内容相同,长度不同,返回2个字符串的长度之差 (了解)
        //System.out.println("aaa".compareTo("aaaccc"));//-3

//        int compare = s1.compareTo(s2);
//        System.out.println("比较的结果:" + compare);
    }
}
