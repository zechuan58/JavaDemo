package com.itheima.array;

import java.util.Scanner;

public class arrDemo02 {//找数值中的最大最小值
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//键盘录入
        int[] arr = new int[5];//定义数组存储空间大小
        for (int i = 0; i < arr.length; i++) {//数值遍历输入
            arr[i] = sc.nextInt();//获取键盘录入值
        }
        int max = arr[0];//将数组中第一个元素值赋给max
        int min =arr[0];//将数组中第一个元素值赋给min
        for (int i = 1; i < arr.length; i++) {//循环比较
            if (max < arr[i]) {//比较最大值
                max = arr[i];//最大值赋值给max
            }
            if (min>arr[i]){//比较最小值
                min=arr[i];//最小值赋值给min
            }
        }
        System.out.println("数组中最大值为:"+max);//输出最大值
        System.out.println("数组中最小值为:"+min);//输出最小值
    }
}
