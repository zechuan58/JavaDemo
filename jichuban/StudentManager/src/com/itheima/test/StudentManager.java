package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 创建集合容器对象
        ArrayList<Student> list = new ArrayList<>();


        lo:
        while (true) {
            // 1. 搭建主界面菜单
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");

            String choice = sc.next();

            switch (choice) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(list);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent(list);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent(list);
                    break;
                case "4":
                    // System.out.println("查看学生");
                    queryStudents(list);
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }


    }

    // 修改学生的方法
    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("请输入您要修改的学生学号:");
        Scanner sc = new Scanner(System.in);
        String updateSid = sc.next();
        // 3. 调用getIndex方法, 查找该学号在集合中出现的索引位置
        int index = getIndex(list, updateSid);
        // 4. 根据索引判断, 学号在集合中是否存在
        if (index == -1) {
            // 不存在: 给出提示
            System.out.println("查无信息, 请重新输入");
        } else {
            // 存在: 接收新的学生信息
            System.out.println("请输入新的学生姓名:");
            String name = sc.next();
            System.out.println("请输入新的学生年龄:");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日:");
            String birthday = sc.next();
            // 封装为新的学生对象
            Student stu = new Student(updateSid, name, age, birthday);
            // 调用集合的set方法, 完成修改
            list.set(index, stu);
            System.out.println("修改成功!");
        }
    }

    // 删除学生的方法
    public static void deleteStudent(ArrayList<Student> list) {
        // 1. 给出提示信息 (请输入您要删除的学号)
        System.out.println("请输入您要删除的学生学号:");
        // 2. 键盘接收要删除的学号
        Scanner sc = new Scanner(System.in);
        String deleteSid = sc.next();
        // 3. 调用getIndex方法, 查找该学号在集合中出现的索引位置
        int index = getIndex(list, deleteSid);
        // 4. 根据索引判断, 学号在集合中是否存在
        if (index == -1) {
            // 不存在: 给出提示
            System.out.println("查无信息, 请重新输入");
        } else {
            // 存在:删除
            list.remove(index);
            System.out.println("删除成功!");
        }
    }

    // 查看学生的方法
    public static void queryStudents(ArrayList<Student> list) {
        // 1. 判断集合中是否存在数据, 如果不存在直接给出提示
        if (list.size() == 0) {
            System.out.println("无信息, 请添加后重新查询");
            return;
        }
        // 2. 存在: 展示表头数据
        System.out.println("学号\t\t\t姓名\t年龄\t生日");
        // 3. 遍历集合, 获取每一个学生对象的信息, 打印在控制台
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
        }
    }

    // 添加学生的方法
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        // 1. 给出录入的提示信息

        String sid;

        while (true) {
            System.out.println("请输入学号:");
            sid = sc.next();

            int index = getIndex(list, sid);

            if (index == -1) {
                // sid不存在, 学号可以使用
                break;
            }
        }

        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("请输入生日:");
        String birthday = sc.next();
        // 2. 将键盘录入的信息封装为学生对象
        Student stu = new Student(sid, name, age, birthday);
        // 3. 将封装好的学生对象, 添加到集合容器当中
        list.add(stu);
        // 4. 给出添加成功的提示信息
        System.out.println("添加成功!");
    }

    /*
        getIndex : 接收一个集合对象, 接收一个学生学号

        查找这个学号, 在集合中出现的索引位置
     */
    public static int getIndex(ArrayList<Student> list, String sid) {
        // 1. 假设传入的学号, 在集合中不存在
        int index = -1;
        // 2. 遍历集合, 获取每一个学生对象, 准备进行查找
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            // 3. 获取每一个学生对象的学号
            String id = stu.getSid();
            // 4. 使用获取出的学生学号, 和传入的学号(查找的学号)进行比对
            if (id.equals(sid)) {
                // 存在: 让index变量记录正确的索引位置
                index = i;
                System.out.println("当前学号已经存在,请验证后重新输入!");
            }
        }

        return index;
    }
}
