package com.zechuan.kaoshi;

import java.util.Random;

public class Demo23 {
    /* 23
       1. 产生10个1-100 之间的随机数并存入数组中，随机数不能重复，随后遍历打印数组
       2. 打印出数组元素大于平均数的个数*/
    public static void main(String[] args) {

        Random r = new Random();

        //创建大小为10的数组
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {

            //产生1-100之间得随机数
            int num = r.nextInt(100) + 1;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }

            //随机数存入数组中，保证元素不重复
            if (count == 0) {
                arr[i] = num;
            } else {
                i--;
            }
        }

        System.out.println("产生的10个随机数为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //求出平均数
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int ave = sum / arr.length;

        System.out.println("平均数为:"+ave);

        //打印出数组元素大于平均数的个数
        int cun=0;
        for (int i = 0; i < arr.length; i++) {
            if (ave<arr[i]){
                cun++;
            }
        }
        System.out.println("大于平均数有"+cun+"个");
    }
}
