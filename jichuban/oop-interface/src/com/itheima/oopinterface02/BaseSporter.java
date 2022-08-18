package com.itheima.oopinterface02;


/**
 * 运动员
 * @author 11959
 */
public abstract class BaseSporter extends BasePerson {
    public BaseSporter() {
    }

    public BaseSporter(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
