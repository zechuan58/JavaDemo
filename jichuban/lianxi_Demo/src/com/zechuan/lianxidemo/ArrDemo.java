package com.zechuan.lianxidemo;

import java.util.Random;

public class ArrDemo {
    /*        题目要求 题7
              1. 产生10个 1-100 之间的随机数并存入数组中，随机数不能重复，随后遍历打印数组（元素都在一行打印）
              2. 反转数组中元素，再次遍历打印数组（元素都在一行打印）
              3. 找出数组中偶数元素并打印在控制台，要求每行打印两个元素
    */
    public static void main(String[] args) {
        //创建一个大小为10的数组
        int[] arr = new int[10];
        //创建随机数
        Random r = new Random();
        //去重
        for (int i = 0; i < arr.length; i++) {
            //产生1-100的随机数
            int num = r.nextInt(100) + 1;
            //创建计数器(用于判断数组中有没有重复的数)
            int count = 0;
            //将产生的随机数与数组中的每个元素进行对比
            for (int j = 0; j < arr.length; j++) {
                //如果有重复的数,计数器自增
                if (arr[j] == num) {
                    count++;
                }
            }
            //如果没有重复就把这个随机数赋给数组
            if (count == 0) {
                arr[i] = num;
            } else {//重复就重新获取随机数
                i--;
            }
        }
        //遍历打印数组（元素都在一行打印）
        System.out.println("反转前数组为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //反转数组中元素
        System.out.println("\n反转后数组为:");
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //再次遍历打印数组（元素都在一行打印）
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //找出数组中偶数元素并打印在控制台
        System.out.println("\n偶数元素为:");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                count++;
            }
            //要求每行打印两个元素
            if (count == 2) {
                System.out.println();
                count = 0;
            }
        }
    }
}
