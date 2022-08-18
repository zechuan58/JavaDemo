package com.itheima.d1_method;

public class Demo1 {
    /*
        方法(函数)介绍: 方法是一段具有独立功能的代码块, 不调用就不执行

        方法的定义格式:
            public static void 方法名(){
                方法体...
            }

        方法的调用格式:
            方法名();

        方法执行的特点?
            方法不调用不执行

     */
    public static void main(String[] args) {
        //调用方法
        show();
        fanQieJiDan("番茄", "鸡蛋");
    }

    //方法定义的位置
    public static void show() {
        System.out.println("这是show方法");
    }


    //需求：写一个方法，完成炒一盘番茄鸡蛋的功能
    public static void fanQieJiDan(String a, String b) {
        System.out.println(a + b);
    }

}
