package com.itheima.day06test;

import java.util.Scanner;

public class Test04 {
    /**
     * 4. 查找元素在数组中出现的索引位置
     * 已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据，
     * 查找该数据在数组中的索引。
     * 并在控制台输出找到的索引值。如果没有查找到，则输出-1
     */
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //获取键盘录入
        System.out.println("请输入要查询的元素:");
        int b = sc.nextInt();
        //调用方法
        int[] arr = {19, 28, 37, 46, 50};
        int index = seekElement(arr, b);
        //判断查询结果
        if (index == -1) {
            System.out.println(b+"在数组中不存在!!!");
        } else {
            System.out.println(b + "在数组中的索引位为:" + index);
        }
    }

    public static int seekElement(int[] a, int b) {
        //没查询到返回-1
        int j = -1;
        //查询到返回元素所在索引值
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                j = i;
            }
        }
        return j;
    }
}
