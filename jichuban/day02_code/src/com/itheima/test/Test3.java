package com.itheima.test;

/*
面试题：看程序说出结果，并运行代码验证结果是否正确
 */
public class Test3 {
    public static void main(String[] args) {
        int x = 10;
        int y = ++x; //int y =?;
        int z = y++; //int z=y; y++; 自动后y=?

        System.out.println("x=" + x); //
        System.out.println("y=" + y); //
        System.out.println("z=" + z); //

        System.out.println("----------------------");


     //思考题(课后做): 看程序,写结果
//        int b = 10;
//        int c = (++b) + (b++) + (b * 10);

//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
    }
}
