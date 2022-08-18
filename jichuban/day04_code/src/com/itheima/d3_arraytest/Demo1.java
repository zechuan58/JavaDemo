package com.itheima.d3_arraytest;

import java.util.Random;

/*
需求： 数组元素求和
    步骤:
        1.定义求和变量
        2.遍历数组,得到每个元素
        3.累加每个元素到求和变量
        4.遍历结束,打印求和变量
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        int sum = 0;
        //产生随机数给数组
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }

        //累加
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        System.out.println("\n数组元素和为:" + sum);
    }
}
