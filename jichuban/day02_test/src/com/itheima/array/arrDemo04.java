package com.itheima.array;

import java.util.Scanner;

public class arrDemo04 {//在数组中查找值的索引位
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数:");
        int a = sc.nextInt();//键盘获取查找值
        int index = -1;//先定义这个数不存在,初值赋-1
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {//将键盘输入的值在数组中进行比较
                index = i;//找到就将索引值赋给index
                break;
            }
        }
        if (index != -1) {//查找到就输出索引位
            System.out.println("查找的数在数组中索引位于:" + index);
        }else//没查到就输出以下语句
            System.out.println("查找的数在数组中不存在!");
    }
}
