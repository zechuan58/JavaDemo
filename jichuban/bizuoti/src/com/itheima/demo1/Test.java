package com.itheima.demo1;

public class Test {
    public static void main(String[] args) {
        Television tv= new Television("TCL","tcl001","星光色",10086.9,"39寸","1920*1080p");
        System.out.println(tv.getBrand()+", "+tv.getModel()+", "+tv.getColor()+", "+tv.getPrice()+", "+tv.getScreenSize());
    }
}
