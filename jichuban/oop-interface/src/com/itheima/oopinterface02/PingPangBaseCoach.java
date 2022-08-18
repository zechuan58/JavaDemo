package com.itheima.oopinterface02;


/**
 * 乒乓球教练
 *
 * @author 11959
 */
public class PingPangBaseCoach extends BaseCoach implements English {//调用英语接口

    public PingPangBaseCoach() {
    }

    public PingPangBaseCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在学习英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练正在教如何打乒乓球!");
    }


}
