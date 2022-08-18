package com.zechuan.lianxidemo;

import java.util.ArrayList;

public class ArrayTest05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ("test".equals(s)) {
                list.remove(i);
                i--;//集合中删除会整体向前移动,索引位就要向前移动才能遍历到所有的元素
            }
        }
        System.out.println(list);
    }
}
