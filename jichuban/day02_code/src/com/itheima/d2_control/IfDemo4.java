package com.itheima.d2_control;

/*
if语句的注意事项：
      1)if语句小括号的后面，不能加;
      2)如果if、else的语句体只有一条语句，{}可以省略
        不建议省略{}， 还是按照标准个格式写
 */
public class IfDemo4 {
    public static void main(String[] args) {
        int a = 11;
        if (a % 2 == 0) {
            System.out.println(a + "是偶数");
        } else {
            System.out.println(a + "是奇数");
        }
    }
}
