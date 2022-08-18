package com.itheima.d1_operation;

//目标：掌握自增、自减运算的运算规则
/*
一、单独使用：++、--放前放后没有区别

二、非单独使用
    【++、--放在操作数前面】：先让操作数+1、-1，然后用+1、-1后的结果去做其他运算
    【++、--放在操作数后面】：先让操作数做其他运算，运算完后再操作数+1或者-1
 */
public class Demo4 {
    public static void main(String[] args) {
        //1.单独使用
        int a = 5;
        a++;  //
        ++a;  //
        System.out.println("a=" + a); //

        //2.非单独使用：++放在操作数后面
//        int x = 10;
//        int y = x++; //等价于2句话： int y =x; x++;
//        System.out.println("x=" + x); //?
//        System.out.println("y=" + y); //?
//        System.out.println("---------------");

        //3.非单独使用：++放在操作数前面
//        int n = 8;
//        int z = ++n; //等价于：n++;  int z=n;
//        System.out.println("n=" + n); //?
//        System.out.println("z=" + z); //?
//        System.out.println("---------------");
    }
}
