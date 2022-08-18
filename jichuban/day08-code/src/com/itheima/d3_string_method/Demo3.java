package com.itheima.d3_string_method;

/*
String类的方法：在调用方法之前，必须先准备好一个字符串对象，然后用对象调用方法。
    1.获取方法
        public char charAt(int index)
            用于查找字符串中指定索引位置的字符
            参数：index 需要指定的索引位置
            返回：返回index位置的字符

        public int indexOf(String str)
            查找字符串中指定子串出现的所以位置
            举例：helloworldjavaworld 的子串
            参数： 是你要查找的字符串
            返回： 返回子字符串首字母第一次出现的所以位置; 如果没有找到返回-1

        public int length()
            获取字符串的长度
            参数：没有
            返回值：返回字符的个数

        public String substring(int beginIndex)
            截取字符串的一部,从指定的索引位置开始，一直到字符串的末尾
            参数：指定的索引位置
            返回值：截取的字串

        public String substring(int beginIndex, int endIndex)
            截取字符串的一部,从指定的beginIndex索引位置开始，到endIndex索引位置结束
            参数：开始索引位置(包含)，结束索引位置(不包含)
            返回值：截取的字串


知道的查找各个方法的含义后，去StringTest1类中练习一下吧！
 */
public class Demo3 {
    public static void main(String[] args) {
        String str = "HelloWorldJavaWorld";

        //获取2索引位置的字符
        char c = str.charAt(2);
        //System.out.println(c);

        //索引注意事项  索引不要越界
//        c = str.charAt(str.length()); //最大索引  str.length() - 1
        c = str.charAt(str.length() - 1); //最大索引  str.length() - 1
        //System.out.println(c);


        //查找"World"在str字符串中第一次出现的索引位置
        int index = str.indexOf("World");
        //System.out.println("index = " + index); // ? index = 5
        //System.out.println(str.indexOf('H')); // 0

        //System.out.println(str.indexOf("eao"));// -1


        //获取字符串的长度
        //System.out.println(str.length());


        //截取字符串的一部分
        //"HelloWorldJavaWorld" 从0索引开始，到5索引(不包含)结束
        //String str = "HelloWorldJavaWorld";
        //String substring = str.substring(0, 5);
        String substring = str.substring(1);
        //System.out.println("str:" + str);// str:HelloWorldJavaWorld
        System.out.println("substring:" + substring);//Hello  substring:Hello
    }
}
