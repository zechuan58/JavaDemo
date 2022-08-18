package com.itheima.oopinterface01;

/**
 * @author 11959
 */
public class Rabbit extends BaseAnimal {
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");
    }
}
