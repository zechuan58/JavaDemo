package com.itheima.oopinterface02;

/**
 * @author 11959
 */
public class Test {
    public static void main(String[] args) {


        //创建篮球运动员对象
        BasketballBaseSporter bs = new BasketballBaseSporter("姚明", 35);
        System.out.println(bs.getName() + ", " + bs.getAge());
        bs.study();

        //创建篮球教练对象
        BasketballBaseCoach bc = new BasketballBaseCoach("hhh", 45);
        System.out.println(bc.getName() + ", " + bc.getAge());
        bc.teach();


        //创建乒乓球运动员对象
        PingPangBaseSporter ps = new PingPangBaseSporter("林丹", 39);
        System.out.println(ps.getName() + ", " + ps.getAge());
        ps.study();
        ps.speakEnglish();

        //创建乒乓球教练对象
        PingPangBaseCoach pc = new PingPangBaseCoach("lll", 50);
        System.out.println(pc.getName() + ", " + pc.getAge());
        pc.teach();
        pc.speakEnglish();
    }
}
