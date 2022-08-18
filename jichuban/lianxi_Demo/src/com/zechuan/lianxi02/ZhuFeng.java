package com.zechuan.lianxi02;

public class ZhuFeng {
    public static void main(String[] args) {
        int count = 0;
        double hou = 0.1;
        do {
            hou *= 2;
            count++;
        } while (hou < 8848860);
        System.out.println("要折" + count + "次");
    }
}
