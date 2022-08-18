package com.zechuan.kaoshi;

import java.util.Scanner;

public class Demo22 {
  /*  我国的居民身份证号码，由18位数字组成. 请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
    规则为：
            1.身份证号码为18位，不能以数字0开头，
            2.18位数必须是数字组成
            3.不满足条件,提示用户输入错误*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码:");
        String idnumber = sc.next();
        System.out.println(check(idnumber));
    }

    public static String check(String idnum) {

        //判断身份证号码是否为null,是否为18位
        if (idnum == null || idnum.length() != 18) {
            return "身份证号码输入错误";
        }

        //不能以数字0开头
        if (idnum.startsWith("0")) {
            return "身份证第一位不能为'0'";
        }

        //判断是否都是数字
        for (int i = 0; i < idnum.length(); i++) {
            char ch = idnum.charAt(i);
            if (ch < '0' || ch > '9') {
                return "身份证号码中存在非数字";
            }
        }

        return "身份证号码为:" + idnum.substring(0);
    }
}
