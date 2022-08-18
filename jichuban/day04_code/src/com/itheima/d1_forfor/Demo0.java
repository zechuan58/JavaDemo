package com.itheima.d1_forfor;

public class Demo0 {
    /*
        Debug的作用:
            1.查看程序的执行流程
            2.排除逻辑错误
        Debug的步骤:
            1.打断点
            2.右键,debug 运行
            3.点下箭头,一步步执行
     */
    public static void main(String[] args) {
        //1.定义一个求和变量
        int sum = 0;

        //2.循环获取到1~5每一个整数,完成累加
        for (int i = 1; i <= 5; i++) {
            //sum = sum + i;
            sum += i;
        }

        //3.打印sum的值
        System.out.println("sum = " + sum);
    }
}
