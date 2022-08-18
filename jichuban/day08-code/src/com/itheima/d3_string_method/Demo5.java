package com.itheima.d3_string_method;

/*
String类的方法：在调用方法之前，必须先准备好一个字符串对象，然后用对象调用方法。

    分割和替换
        public String[] split(String regex)
            把一个字符串分割为多个字符串
            参数：分割的标记
            返回值： 返回多个字符串组成的String[]

        public String replaceAll(String regex, String replacement)
            使用新的字符串替换旧的字符串
            参数：旧的字符串，新的字符串
            返回值：返回替换后的字符串



知道了分割和替换功能之后，去StringTest3类中练习一下吧！
 */
public class Demo5 {
    public static void main(String[] args) {
        String s = "hello.world.java";
        //按照"-"进行切割
        //public String[] split(String regex) //正则表达式
//        String[] split = s.split("\\."); // 正常的分隔符直接用, 特殊用 \\.
//        System.out.println("数组的长度:" + split.length);
//        //遍历数组
//        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
//        }
//
//
//      System.out.println("------------------");

        String str = "你会不会玩呀，你大爷的...你妹的...你NMD的!!!";
        //把"大爷","妹的","NMD"替换为“****”
        // public String replaceAll(String regex, String replacement)
        //String replaceAll = str.replaceAll("大爷", "****");
        //System.out.println(str);//本身不变

        //链式编程
        String replaceAll = str.replaceAll("大爷", "****").
                replaceAll("妹的", "****").
                replaceAll("NMD", "****");

        System.out.println(replaceAll);
    }
}
