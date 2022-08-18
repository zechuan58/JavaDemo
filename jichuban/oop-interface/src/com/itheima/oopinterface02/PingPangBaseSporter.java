package com.itheima.oopinterface02;


/**
 * 乒乓球运动员
 *
 * @author 11959
 */
public class PingPangBaseSporter extends BaseSporter implements English {//调用英语接口

    public PingPangBaseSporter() {
    }

    public PingPangBaseSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在学习英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习打乒乓球");
    }
}
