package com.itheima.array;

import java.util.Scanner;

public class arrDemo03 {//数组求和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            count += arr[i];
        }
        System.out.println(count);
    }
}
