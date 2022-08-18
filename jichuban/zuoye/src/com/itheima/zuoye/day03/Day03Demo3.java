package com.itheima.zuoye.day03;

public class Day03Demo3 {
    /*需求 : 按照从小到大的顺序输出四位数中 (个位 + 百位 = 十位 + 千位 )  的数字及个数 , 要求使用while循环完成

    举例 : 3553 , 2332 , 1166 , 2233

    1、定义统计变量 , 记录满足要求的数据的个数

    2、通过while循环拿到1000-9999之间所有的数据

    3、拿到四位数中个位十位百位千位的数据

    4、通过if语句判断 , 四位数是否 个位 + 百位 = 十位 + 千位

    5、满足要求 , 打印这个四位数 , 并且统计变量自增

    6、循环结束之后 , 打印满足要求的元素的个数
    */
    public static void main(String[] args) {
        //定义统计变量 , 记录满足要求的数据的个数
        int count = 0;
        int num = 1000;

        //拿到四位数中个位十位百位千位的数据
        while (num < 9999) {
            int ge = num % 10;
            int shi = num / 10 % 10;
            int bai = num / 10 / 10 % 10;
            int qian = num / 10 / 10 / 10 % 10;

            //通过if语句判断 , 四位数是否 个位 + 百位 = 十位 + 千位
            if (ge + shi == bai + qian) {
                System.out.println(num);
                count++;
            }
            num++;
        }
        System.out.println("满足要求的数据个数为:" + count + "个");
    }
}
