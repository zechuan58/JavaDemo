package com.itheima.d4_string_test;

/*
学生类：用于封装学生的属性信息

 */
public class Student {

    private String name; //姓名
    private String age; //年龄
    private String score; //成绩

    //空参构造
    public Student() {
    }
    //带参构造


    public Student(String name, String age, String score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
