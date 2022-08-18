package com.itheima.day06test;

public class Test05 {
    /**
     * 5. 数组元素反转
     * 案例需求
     * 已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值交换，
     * 交换后的数组 arr = {50, 46, 37, 28, 19}; 并在控制台输出交换后的数组元素。
     */
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素的初始化
        int[] arr = {19, 28, 37, 46, 50};

        //调用反转的方法
        reverse(arr);

        //遍历数组
        printArray(arr);
    }

    //反转数组
    public static void reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }


    //遍历数组
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
        System.out.println("]");
    }
}

