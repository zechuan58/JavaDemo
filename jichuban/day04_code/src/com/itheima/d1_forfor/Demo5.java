package com.itheima.d1_forfor;

public class Demo5 {
    /*
        看程序,写结果
     */
    public static void main(String[] args) {
        //外层循环
        for (int i = 1; i <= 2; i++) {
            //内层循环
            //循环体
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("morning~~~");
            }
        }
    }
}
