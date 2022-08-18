package com.zechuan.lianxidemo;

import java.util.ArrayList;

public class ArrayTast01 {
    public static void main(String[] args) {
        ArrayList<String> List=new ArrayList<>();
        List.add("abc");
        List.add("111");
        List.add("222");
        List.add("333");
        List.add("444");
        List.add("555");
        List.remove("555");//去掉"555"
        List.remove(0);//去掉下标为0的元素
        List.set(1,"777");//将下标为1的元素改为777
        String s=List.get(0);//获取下标为0的元素
        int s1=List.size();//获取集合长度
        System.out.println(s+"...."+List+"...."+s1);

    }

    private static void SetTest() {
        ArrayList<String> List=new ArrayList<>();
        List.add("abc");
        List.add("111");
        List.add("222");
        List.add("333");
        List.add("444");
        List.add("555");
        String s=List.set(1,"999");
        System.out.println(s);
        System.out.println(List);
    }


    private static void RemoveTest() {
        ArrayList<String> List=new ArrayList<>();
        List.add("abc");
        List.add("111");
        List.add("222");
        List.add("333");
        List.add("444");
        List.add("555");
        String s=List.remove(0);
        System.out.println(s);
        System.out.println(List);


        List.add("abc");
        List.add("111");
        List.add("222");
        List.add("333");
        List.add("444");
        List.add("555");
        boolean s1=List.remove("333");
        boolean s2=List.remove("999");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(List);
    }

}
