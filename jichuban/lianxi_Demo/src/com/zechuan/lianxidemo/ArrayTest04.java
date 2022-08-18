package com.zechuan.lianxidemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest04 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = getStudent();
        Student stu2 = getStudent();
        Student stu3 = getStudent();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
    }

    private static Student getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        Student stu = new Student(name, age);
        return stu;
    }
}
