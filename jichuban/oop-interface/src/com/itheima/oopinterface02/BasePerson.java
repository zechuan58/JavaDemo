package com.itheima.oopinterface02;


/**
 * @author 11959
 */

/**
 * abstract是为了不让外届直接创建人对象
 * 因为此时直接创建顶层父类人的对象没有意义(因为有sporter和coach两个子类继承了)
 * 人的类
 */
public abstract class BasePerson {
    private String name;
    private int age;

    public BasePerson() {
    }

    public BasePerson(String name, int age) {
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
}
