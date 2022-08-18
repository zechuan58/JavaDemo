package com.zechuan.lianxidemo;

import java.util.ArrayList;

public class ArrayTest06 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 19);
        Student stu2 = new Student("李四", 16);
        Student stu3 = new Student("王五", 20);
        Student stu4 = new Student("王六", 17);
        Student stu5 = new Student("王七", 18);
        Student stu6 = new Student("张四", 10);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        list.add(stu6);
        ArrayList<Student> newList = getList(list);
        for (int i = 0; i < newList.size(); i++) {
            Student stu = newList.get(i);
            System.out.println(stu.getName() + ".." + stu.getAge());
        }
    }


    public static ArrayList<Student> getList(ArrayList<Student> list) {
        ArrayList<Student> newlist = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            int age = stu.getAge();
            if (age < 18) {
                newlist.add(stu);
            }
        }
        return newlist;
    }
}