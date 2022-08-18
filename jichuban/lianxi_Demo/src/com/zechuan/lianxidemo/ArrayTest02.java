package com.zechuan.lianxidemo;

import java.util.ArrayList;

public class ArrayTest02 {
    public static void main(String[] args) {
        ArrayList<String> List=new ArrayList<>();
        List.add("张三");
        List.add("李四");
        List.add("王五");
        for (int i = 0; i < List.size(); i++) {
            String s=List.get(i);
            System.out.println(s);
        }
    }
}
