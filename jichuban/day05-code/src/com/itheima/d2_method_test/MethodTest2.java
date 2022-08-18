package com.itheima.d2_method_test;

/**
 * 需求：设计一个方法用于数组遍历，要求倒序遍历并打印下列结果
 * 打印结果如：[55, 44, 33, 22, 11]
 *
 * @author 11959
 */
public class MethodTest2 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArr(arr);
    }

    public static void printArr(int[] a) {
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }
}
