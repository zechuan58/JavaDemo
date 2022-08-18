package com.zechuan.lianxidemo;

import java.util.Random;

public class ArrDemo07 {
    /*        题目要求 题7
              1. 产生10个 1-100 之间的随机数并存入数组中，随机数不能重复，随后遍历打印数组（元素都在一行打印）
              2. 反转数组中元素，再次遍历打印数组（元素都在一行打印）
              3. 找出数组中偶数元素并打印在控制台，要求每行打印两个元素*/
    public static void main(String[] args) {

//        产生10个 1-100 之间的随机数并存入数组中，随机数不能重复，随后遍历打印数组（元素都在一行打印）

//        创建随机数
        Random r = new Random();
        //创建大小为10的数组
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {

            //产生随机数给num
            int num = r.nextInt(100) + 1;
            int count = 0;

            //去重
            //每产生一个随机数,就在数组里遍历对比一次
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }


            //如果数组中没有相同的数,就将这个随机数存到数组中下标为i的位置
            if (count == 0) {
                arr[i] = num;
            } else {//如果数组中存在相同的随机数,就回到下标为i的位置重新赋随机数
                i--;
            }
        }

        //遍历打印数组,且不换行
        System.out.println("产生的10个随机数为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();


        //反转数组中元素，再次遍历打印数组（元素都在一行打印）
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //输出反转后的数组
        System.out.println("反转后的数组元素为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

//        找出数组中偶数元素并打印在控制台，要求每行打印两个元素


        int count = 0;//用于判断偶数的个数
        System.out.println("数组中偶数元素有:");
        for (int i = 0; i < arr.length - 1; i++) {

            //找出偶数
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + "\t");
                count++;

                //每两个偶数换行一次
                if (count % 2 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
