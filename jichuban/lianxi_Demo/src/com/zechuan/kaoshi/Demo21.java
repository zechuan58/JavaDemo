package com.zechuan.kaoshi;

import java.util.Random;
import java.util.Scanner;

public class Demo21 {
    /*public static void main(String[] args) {
        arrTest();
    }*/

    /*21定义一个方法,方法内完成:
    使用键盘录入数组的长度
    使用随机数给数组里面的元素赋值,随机数范围为15-85(包括15和85)
    求数组中的最大值和最小值*/
    public static void arrTest() {

        //使用键盘录入数组的长度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度:");
        int a = sc.nextInt();
        int[] arr = new int[a];

        //使用随机数给数组里面的元素赋值,随机数范围为15-85(包括15和85)
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            arr[i] = r.nextInt(85 - 15 + 1) + 15;
        }

        //遍历数组
        System.out.println("这个数组为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //求数组中的最大值和最小值
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最大值为:" + max);
        System.out.println("最小值为:" + min);
    }

}
