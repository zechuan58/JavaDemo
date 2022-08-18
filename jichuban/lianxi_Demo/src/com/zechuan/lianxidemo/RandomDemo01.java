package com.zechuan.lianxidemo;

import java.util.Random;

//创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，
//然后计算出数组中所有元素的和并打印
public class RandomDemo01 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[6];
        System.out.print("随机数为:");
        for (int i = 0; i < arr.length; i++) {
            int num = ran.nextInt(100);
            arr[i] = num;
            System.out.print(arr[i] + " ");
        }

        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("\n" + "随机数合为:" + sum);
    }
}
