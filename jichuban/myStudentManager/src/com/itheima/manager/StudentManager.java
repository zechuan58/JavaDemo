package com.itheima.manager;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/*
 学生管理系统主程序
 */
public class StudentManager {
    //主方法,打印菜单
    public static void main(String[] args) {
        //主菜单编写
        //创建集合,保存Student对象,集合只能有一个,
        ArrayList<Student> list = new ArrayList<>();

        a:
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            //键盘录入
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的选择:");
            String choose = sc.next(); //用字符串接收
            //switch判断
            switch (choose) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(list);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudent(list);
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent(list);
                    break;
                case "4":
                    System.out.println("查看学生");
                    findStudent(list);
                    break;
                case "5":
                    System.out.println("谢谢使用,欢迎下次使用本系统~~~");
                    break a; //结束外层的循环
                default:
                    System.out.println("你的输入有误,请输入1-5");
                    break;
            }
        }
    }

    //添加学生的方法
    public static void addStudent(ArrayList<Student> list) {
        //添加学生逻辑
        //键盘录入学号,姓名,年龄,生日
        Scanner sc = new Scanner(System.in);
        String sid;

        while (true) {
            System.out.println("请输入学号:");
            sid = sc.next();

            int index = getIndex(list, sid);

            if (index == -1) {
                // sid不存在, 学号可以使用
                break;
            }else{
                System.out.println("学号已存在,请重新输入!");
            }
        }
        System.out.println("请输入姓名:");
        String name = sc.next();

        System.out.println("请输入年龄:");
        int age = sc.nextInt();

        System.out.println("请输入生日:");
        String birthday = sc.next();
        //封装学生对象
        Student stu = new Student(sid, name, age, birthday);

        //添加对象到集合
        list.add(stu);
        //打印添加成功
        System.out.println("添加学生成功!");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        //键盘录入要删除的学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学号:");
        String delId = sc.next();

        //判断学号是否存在
        int index = getIndex(list, delId);
        //如果存在,执行删除,提示消息
        if (index != -1) {
            Student remove = list.remove(index);
            System.out.println("学号:"+remove.getId()+"姓名:"+remove.getName()+"删除成功!");
        } else {
            //如果不存在,提示学号不存,结束方法
            System.out.println(delId + "不存在,请检查~~");
            return;
        }

    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        //1.键盘录入要修改的学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学号:");
        String updateId = sc.next();

        //2.判断学号是否存在
        int index = getIndex(list, updateId);
        // 2.1 学号存在
        if (index != -1) {
            //继续输入 新的姓名,新年龄,新生日
            System.out.println("请输入要修改的姓名:");
            String name = sc.next();

            System.out.println("请输入新的年龄:");
            int age = sc.nextInt();

            System.out.println("请输入新的生日:");
            String birthday = sc.next();

            //将输入信息封装为学生对象
            Student stu = new Student(updateId, name, age, birthday);

            //list.set(index,新的学生对象);
            list.set(index, stu);
            //提示消息
            System.out.println("修改学生成功~");
        } else {
            // 2.2 学号不存在  提示学号不存在,结束方法
            System.out.println(updateId + "不存在,请检查后重试~");
        }

    }

    //查看学生
    public static void findStudent(ArrayList<Student> list) {

        //如果没有学生,给与提示
        if (list.isEmpty()) {
            System.out.println("抱歉,还没有添加学生,请先添加学生再来查看~~~");
            return;
        }

        //打印标题
        System.out.println("学号\t\t\t\t姓名\t\t年龄\t\t生日");
        //遍历集合,打印对象的成员变量
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getBirthday());
        }
    }

    //判断学号是否存在,返回索引
    public static int getIndex(ArrayList<Student> list, String id) {
        //1.遍历集合,得到每个学生对象
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student tempstu = list.get(i);
            String tempId = tempstu.getId();
            if (tempId.equals(id)) {
                index = i;
                break;
            }
        }
        return index;
        //2.得到学生对象的学号
        //3.判断
        // 找到了,记录索引
        //4.找不到返回 -1
    }
}
