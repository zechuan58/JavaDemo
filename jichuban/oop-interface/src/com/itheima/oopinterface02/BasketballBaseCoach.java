package com.itheima.oopinterface02;


/**
 * 篮球教练
 * @author 11959
 */
public class BasketballBaseCoach extends BaseCoach {
    public BasketballBaseCoach() {
    }

    public BasketballBaseCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练正在如何教打篮球");
    }
}
