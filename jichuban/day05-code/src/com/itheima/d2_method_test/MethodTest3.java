package com.itheima.d2_method_test;

/**
 * 需求：设计一个方法用于获取数组中元素的最大值
 *
 * @author 11959
 */
public class MethodTest3 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 66, 99999, 771, 561, 79, 789, 652, 159, 357, 111, 10086};
        arrMax(arr);
    }

    public static void arrMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
