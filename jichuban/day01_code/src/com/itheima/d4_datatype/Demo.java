package com.itheima.d4_datatype;

//目标：能够选择合适的数据类型，根据实际情景来定义变量
public class Demo {
    public static void main(String[] args) {
        //1.定义一个变量，表示你考试的成绩，比如：99.5
        double score=99.5;
        System.out.println(score);

        //2.定义一个变量，表示你自己的身高，比如：170cm
        double statrue=170;
        System.out.println((int)statrue+"cm");

        //3.定义一个变量，表示你的年龄，比如：20岁
        int age=20;
        System.out.println(age+"岁");
        //定义一个字符类型的变量,然后打印变量的值
        char a='a';
        System.out.println(a);
        //定义一个布尔(真/假)类型的变量,然后打印其值
        boolean b=true;
        System.out.println(b);
        //4.定义一个变量，表示你自己的姓名，比如："张飞"
        //扩展：字符串类型，用String表示
        String c="张飞";
        System.out.println(c);

        //练习1：定义一个变量，表示超市里白菜的价格


        //练习2：定义一个变量，表示你购买的白菜的斤数


        //练习3：定义另一个变量，用来表示你购买白菜需要的金额


        //练习4：最后打印输出：你购买了多少斤白菜，一共花了多少钱
        //扩展：字符串和任何数据做+运算，起到的作用是拼接



        System.out.println("----------------------");
        //定义变量的注意事项：
//        long a = 88888888888888L;
//        System.out.println(a);


//        float f = 3.14F;
//        System.out.println(f);

//        int c; //定义变量
//        c = 10; //给变量赋值
//        System.out.println(c);

//        {
//            //变量在哪个大括号范围内定义，就只能在哪个大括号范围内使用。
//            int d2 = 10;
//            System.out.println(d2);
//        }
         //System.out.println(d2); // d2已经没有了
    }
}
