package com.itheima.day06test;

/**
 * 案例需求
 * 1. 逢七跳过
 * 朋友聚会的时候可能会玩一个游戏：逢七过。
 * 规则是：从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时都要说：过。
 * 为了帮助大家更好的玩这个游戏，这里我们直接在控制台打印出1-100之间的满足逢七必过规则的数据。
 * 这样，大家将来在玩游戏的时候，就知道哪些数据要说：过。
 *
 * @author 11959
 */
public class Test01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            if (ge == 7 || shi == 7 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
