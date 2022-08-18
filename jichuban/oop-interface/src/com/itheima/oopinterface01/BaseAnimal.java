package com.itheima.oopinterface01;


/**
 * @author 11959
 */

/**
 * 定义动物类
 */
public abstract class BaseAnimal {
    /**
     * 共有属性
     */
    private String name;
    private int age;

    /**
     * 构造方法
     */
    public BaseAnimal() {
    }

    public BaseAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 定义抽象类 吃
     */
    public abstract void eat();

}
