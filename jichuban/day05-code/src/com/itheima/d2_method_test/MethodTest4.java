package com.itheima.d2_method_test;

import java.util.Random;

/**
 * 前面我们学习到的所有需求，全都可以用方法来改写，尝试一下吧
 * <
 * 1.写一个方法，写一个方法打印int数组中的元素，数组由调用者传递，
 * 输出格式：[元素1, 元素2, 元素3]
 * 2.写一个方法，获取int数组中元素的最大值，数组由调用者传递，并把最大值返回
 * 3.写一个方法，获取int数组元素的最小值，数组由调用者传递，并把最小值返回
 * 4.写一个方法，对数int组进行随机打乱，数组由调用者传递
 * 5.写一个方法，查找int数组中指定元素的索引
 * 要求：数组有调用者指定，查找的元素也由调用者指定
 * 如果找到指定的元素，返回元素再数组中的索引；没有找到指定的元素，返回-1
 * 6.写一个方法，产生一个5个元素的数组，数组中的元素是随机产生的取值范围是[1,20]，并把该数组返回
 *
 * @author 11959
 */
public class MethodTest4 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 66, 99999, 771, 561, 79, 789, 652, 159, 357, 111, 10086};

        printArr(arr);

        System.out.println(arrMax(arr));

        System.out.println(arrMin(arr));

        chaosArr(arr);

        System.out.println(seekElement(arr, 789));

        //6题
        int[] arrseek = randomArr(5);
        System.out.print("随机");
        printArr(arrseek);
    }

    /**
     * 1.写一个方法，写一个方法打印int数组中的元素，数组由调用者传递，输出格式：[元素1, 元素2, 元素3]
     */
    public static void printArr(int[] a) {
        System.out.println("数组为:");
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i] + "]\n");
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }

    /**
     * 2.写一个方法，获取int数组中元素的最大值，数组由调用者传递，并把最大值返回
     */
    public static int arrMax(int[] a) {
        System.out.println("数组中最大值为:");
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    /**
     * 3.写一个方法，获取int数组元素的最小值，数组由调用者传递，并把最小值返回
     */
    public static int arrMin(int[] a) {
        System.out.println("数组中最小值为:");
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    /**
     * 4.写一个方法，对数int组进行随机打乱，数组由调用者传递
     */
    public static void chaosArr(int[] a) {
        System.out.println("随机打乱后数组:");
        Random r = new Random();
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            //产生随机数,随机数的范围是数组a的长度
            int num = r.nextInt(a.length);
            if (i == a.length - 1) {
                System.out.print(a[num] + "]\n");
            } else {
                System.out.print(a[num] + ", ");
            }
        }
    }

    /**
     * 5.写一个方法，查找int数组中指定元素的索引
     * 要求：数组有调用者指定，查找的元素也由调用者指定
     * 如果找到指定的元素，返回元素再数组中的索引；没有找到指定的元素，返回-1
     */
    public static int seekElement(int[] a, int b) {
        System.out.println("元素在数组中的索引位在:");
        int chushi = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                chushi = i;
            }
        }
        return chushi;
    }

    /**
     * 6.写一个方法，产生一个5个元素的数组，数组中的元素是随机产生的取值范围是[1,20]，并把该数组返回
     */
    public static int[] randomArr(int a) {
        //产生随机数
        Random sc = new Random();
        //new一个数组大小为a,a的大小由调用者传入
        int[] b = new int[a];
        //将随机数赋值到数组中
        for (int i = 0; i < b.length; i++) {
            int num = sc.nextInt(20) + 1;
            b[i] = num;
        }
        //返回数组给调用者
        return b;
    }
}
