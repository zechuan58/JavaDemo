package com.itheima.oopinterface02;


/**
 * 教练
 *
 * @author 11959
 */
public abstract class BaseCoach extends BasePerson {
    public BaseCoach() {
    }

    public BaseCoach(String name, int age) {
        super(name, age);
    }

    /**
     * 教学
     */
    public abstract void teach();
}
