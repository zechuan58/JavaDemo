package com.itheima.zuoye.day03;

import java.util.Scanner;

public class Day03Demo2 {
    /*需求 : 假设一个简单的在ATM的取款过程如下：

            - 提示用户输入金额（money）
            - ATM只能输出100元的纸币一次取钱数要求最低0元，最高10000元。
            - 如果用户输入的金额符合上述要求，则打印输出用户取的钱数
            - 如果输入的取款金额有误, 请给出提示并继续录入, 直到用户输入正确为止

            1、键盘录入用户取款金额
            2、判断用户的金额是否是 0 ~ 1000 之间, 并且是否能被100整除.
            3、将输入金额 + 判断的代码使用无限循环包裹
            4、取走现金后，通过 break 结束无限循环
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您要取的金额:");
        while (true) {
            //键盘录入用户取款金额
            int money = sc.nextInt();
            //判断用户的金额是否是 0 ~ 1000 之间, 并且是否能被100整除.
            if (money > 0 && money <= 1000 && money % 100 == 0) {
                System.out.println("请取走您的现金:" + money + "元");
                break;
            } else {
                System.out.println("您的输入有误,请重新输入:");
            }
        }

    }
}
