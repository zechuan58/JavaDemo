package com.zechuan.lianxi02;

public class FengQiGuo {
    /*朋友聚会的时候可能会玩一个游戏：逢七过。
                规则是：从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时都要说：过。
                为了帮助大家更好的玩这个游戏，这里我们直接在控制台打印出1-100之间的满足逢七必过规则的数据。
                这样，大家将来在玩游戏的时候，就知道哪些数据要说：过。

            **操作步骤**

                1:数据在1-100之间，用for循环实现数据的获取。
                2:根据规则，用if语句实现数据的判断：要么个位是7，要么十位是7，要么能够被7整除。
                3:在控制台输出满足规则的数据。*/
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <= 100; i++) {
            count++;
            if (count%10==0){
                System.out.println();
            }

            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7) {
                System.out.print("过!\t");
            }else {
                System.out.print(i+"\t");
            }
        }

    }
}
