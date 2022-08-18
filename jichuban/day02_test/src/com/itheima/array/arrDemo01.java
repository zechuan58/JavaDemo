package com.itheima.array;

import java.util.Scanner;

public class arrDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];//定义int类型的数组,数组名叫arr,通过new关键字创建了一个叫int类型的数组容器
        for (int i = 0; i < arr.length; i++) {//遍历数组输入
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {//遍历数组输出,arr.length获取数组元素个数
            System.out.println(arr[i]);
        }
    }
}
