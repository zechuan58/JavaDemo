package com.itheima.oopinterface02;


/**
 * 篮球运动员
 * @author 11959
 */
public class BasketballBaseSporter extends BaseSporter {
    public BasketballBaseSporter() {
    }

    public BasketballBaseSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员正在学习打篮球");
    }
}
