package com.itheima.oopinterface01;

/**
 * @author 11959
 */
public class Dog extends BaseAnimal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗在狗刨");
    }
}
