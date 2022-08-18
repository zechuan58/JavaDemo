package com.itheima.d3_string_method;

import java.util.Arrays;

/*
String类的方法：在调用方法之前，必须先准备好一个字符串对象，然后用对象调用方法。

    转换方法
         public char[] toCharArray()
             把字符串转换为字符数组
         public byte[] getBytes()
            把字符串转换为字节数组

         public String toLowerCase()
            把字符串转换为小写字母

         public String toUpperCase()
            把字符串转换为大写字母

 */
public class Demo6 {
    public static void main(String[] args) {
        String s = "HelloWorld";

        //1.把字符串转换为字符数组
       /* char[] chars = s.toCharArray();
        //遍历数组,通用
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }*/


        System.out.println("-------------");

        //2.把字符串转换为字节数组
        byte[] bytes = s.getBytes();

      /*  for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }*/
        //简便,查看数组的内容
        // String s = Arrays.toString(数组); 数组所有元素拼接成字符串
      //  System.out.println(Arrays.toString(bytes));


        //3.把字符串转换为小写字母
//        String s1 = s.toLowerCase();
//        System.out.println(s1);

        //4.把字符串转换为大写字母
        String s2 = s.toUpperCase();
        System.out.println(s2);

    }
}
