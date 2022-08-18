package com.itheima.d2_method_test;

/**
 * 需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的
 * 打印格式如：[11, 22, 33, 44, 55]
 *
 * @author 11959
 */
public class MethodTest1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArr(arr);
    }

    public static void printArr(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }
    //2个明确


}
