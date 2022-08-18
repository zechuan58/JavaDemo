package com.itheima.day06test;


/**
 * 3. 判断两个数组是否相同
 * 案例需求
 * 定义一个方法，用于比较两个数组的内容是否相同
 * 思路：
 * 1:定义两个数组，分别使用静态初始化完成数组元素的初始化
 * 2:定义一个方法，用于比较两个数组的内容是否相同
 * 3:比较两个数组的内容是否相同，按照下面的步骤实现就可以了
 * 首先比较数组长度，如果长度不相同，数组内容肯定不相同，返回false
 * 其次遍历，比较两个数组中的每一个元素，只要有元素不相同，返回false
 * 最后循环遍历结束后，返回true
 * 4:调用方法，用变量接收
 * 5:输出结果
 */
public class Test03 {
    public static void main(String[] args) {
        //定义两个数组，分别使用静态初始化完成数组元素的初始化
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};
        boolean be = equals(arr1, arr2);
        System.out.println(be);
    }

    //定义一个方法，用于比较两个数组的内容是否相同
    public static boolean equals(int[] a1, int[] a2) {
        //比较长度是否相同
        if (a1.length != a2.length) {
            return false;
        }
        //比较数组元素是否相同
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
}