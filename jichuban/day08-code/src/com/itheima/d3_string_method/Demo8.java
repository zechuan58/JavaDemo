package com.itheima.d3_string_method;

/*
    public String trim()
        把字符串中的前后空格去掉

    应用场景: 登录和注册时,可以过滤掉前后空格

 */
public class Demo8 {
    public static void main(String[] args) {
        String str = "   admin   ";
        //System.out.println(str);

        //把前面和后面的空格去掉
        String s2 = str.trim();
        System.out.println("str:" + str);
        System.out.println("s2:" + s2);

        //注意:中间的空格不会去掉
    }
}
