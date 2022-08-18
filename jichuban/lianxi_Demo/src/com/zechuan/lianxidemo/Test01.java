package com.zechuan.lianxidemo;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                s1 += c;
            } else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                s2 += c;
            }
        }
        System.out.println(s1 + s2);
    }
}
