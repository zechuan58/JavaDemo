package com.itheima.d1_forfor;


public class Demo1 {
    public static void main(String[] args) {
        //循环嵌套的格式
        //称谓
        //执行特点:内层循环相当于外层循环的循环体,内层循环从头到尾循环一遍,对外层循环来说,只循环了一次.

        //外层循环
        for (int i = 1; i <= 2; i++) {
            //内层循环
            //循环体
            for (int j = 1; j <= 3; j++) {
                System.out.println("morning~~~");
            }
        }

    }

}
