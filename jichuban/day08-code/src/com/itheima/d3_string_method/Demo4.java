package com.itheima.d3_string_method;

/*
String类的方法：在调用方法之前，必须先准备好一个字符串对象，然后用对象调用方法。

    判断方法
        public boolean contains(CharSequence s)
            判断一个字符串是否包含一个自字符串
            参数：需要判断包含的子串
            返回值：包含返回true, 不包含返回false

        public boolean endsWith(String suffix)
            判断字符串以什么后缀结尾
            参数：需要判断额后缀
            返回值： 以指定的后缀结尾返回true; 否则返回false
            举例：hello.java //以java结尾

        public boolean startsWith(String prefix)
            判断字符串以什么前缀开头
            参数：需要判断额前缀
            返回值： 以指定的前缀开头返回true; 否则返回false
            举例：hello.java //以hello开头

        public boolean equals(Object anObject)
            判断字符串和另一个字符串的内容是否相等
            参数：比较的另一个字符串
            返回值：相同返回true,不相同返回false

        public boolean equalsIgnoreCase(String anotherString)
            判断字符串和另一个字符串的内容是否相等, 忽略大小写
            参数：比较的另一个字符串
            返回值：相同返回true,不相同返回false



知道判断方法的含义后，去StringTest2类中练习一下吧，给你准备了丰盛的练习题^_^
 */
public class Demo4 {
    public static void main(String[] args) {
        //创建一个字符串
        String s = "HelloWorldJava";

        //判断字符串中是否包含”Java“
        // contains
//        boolean b = s.contains("Java");
//        System.out.println(b);//true


        //判断字符串以什么后缀结尾
//        System.out.println("美女.jpg".endsWith(".jpg"));//true
//        System.out.println("美女.jpg".endsWith(".txt"));//false


        //判断字符串以什么前缀开头
//        System.out.println("张三丰".startsWith("张"));//true
//        System.out.println("张翠山".startsWith("张"));//true


        //判断字符串和另一个字符串内容是否相同
        String s1 = "hello";
        String s2 = new String("hello");

//        System.out.println(s1 == s2);// false
//        System.out.println(s1.equals(s2));// true
        //==比较的是地址, equals()比较内容


        //判断字符串是否相等忽略大小写
        String s3 = "AF4ed";
        System.out.println(s3.equals("af4ed"));//false
        System.out.println(s3.equalsIgnoreCase("af4ed"));//true

    }
}
