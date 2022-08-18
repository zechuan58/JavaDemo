package com.itheima.d3_arraytest;

import java.util.Random;

/*
需求：数组元素求最大值
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            //去重
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count == 0) {
                arr[i] = num;
            } else {
                i--;
            }
        }
        //遍历打印数组
        System.out.println("数组为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //找出数组最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("\n数组中的最大值为:"+max);
    }
}
