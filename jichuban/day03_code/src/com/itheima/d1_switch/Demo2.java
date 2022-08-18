package com.itheima.d1_switch;

import java.util.Scanner;

//目标：switch语句的注意事项

/*
注意事项：
    1.表达式的数据类型，只能是byte short,char,int 【没有long,float,double,boolean类型】
        JDK7之后可以支持字符串类型
    2.case后面的值不能重复 ，而且没有顺序
    3.case、default后面的break可以省略的，但是会有穿透的现象
 */
public class Demo2 {
    public static void main(String[] args) {
        //1.键盘录入一个整数，代表星期几
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是星期几：");
        int week = sc.nextInt();

        //String week = "1";

        //2.对星期进行匹配
        switch( week){
            case 1:
                System.out.println("埋头苦干，解决bug");
                break;
            case 2:
                System.out.println("请求大牛程序员帮忙");
                break;
            case 3:
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;
            case 4:
                System.out.println("主动帮助新来的女程序解决bug");
                break;
            case 5:
                System.out.println("今晚吃鸡");
                break;
            case 6:
                System.out.println("与王婆介绍的小芳相亲");
                break;
            case 7:
                System.out.println("郁郁寡欢、准备上班。");
                break;
            default:
                System.out.println("没有这个星期...");
                break;
        }
    }
}
