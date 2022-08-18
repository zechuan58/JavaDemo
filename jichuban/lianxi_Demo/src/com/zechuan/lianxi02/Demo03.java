package com.zechuan.lianxi02;


//能被2和5整除的数
//两个打印一行,三个打印一行,依次打印
public class Demo03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
                count++;
                if (count == 2) {
                    System.out.println();
                } else if (count == 5) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}
