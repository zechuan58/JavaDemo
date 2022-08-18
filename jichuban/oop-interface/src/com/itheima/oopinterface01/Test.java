package com.itheima.oopinterface01;

/**
 * @author 11959
 */
public class Test {
    public static void main(String[] args) {

        //创建兔子对象
        Rabbit rabbit = new Rabbit("小兔", 1);
        System.out.println(rabbit.getName() + ", " + rabbit.getAge());
        rabbit.eat();

        //创建青蛙对象
        Frog frog = new Frog("小青", 2);
        System.out.println(frog.getName()+", "+frog.getAge());
        frog.eat();
        frog.swim();

        //创建狗对象
        Dog dog =new Dog("修勾",3);
        System.out.println(dog.getName()+", "+dog.getAge());
        dog.eat();
        dog.swim();
    }
}
