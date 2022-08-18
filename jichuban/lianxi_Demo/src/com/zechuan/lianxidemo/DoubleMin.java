package com.zechuan.lianxidemo;

//现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。
public class DoubleMin {
    public static void main(String[] args) {
        double[] arr={12.9, 53.54, 75.0, 99.1, 3.14};
        double min=arr[0];
        double max=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }else if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("最小值:"+min);
        System.out.println("最大值:"+max);
    }
}
