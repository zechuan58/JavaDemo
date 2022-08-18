package com.itheima.demo1;

//洗衣机
public class WashingMachine extends Electrical {
    private String motorType; //电机类型
    private String washingCapacity; //洗涤容量

    public WashingMachine() {
    }

    public WashingMachine(String brand, String model, String color, double price, String motorType, String washingCapacity) {
        super(brand, model, color, price);
        this.motorType = motorType;
        this.washingCapacity = washingCapacity;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getWashingCapacity() {
        return washingCapacity;
    }

    public void setWashingCapacity(String washingCapacity) {
        this.washingCapacity = washingCapacity;
    }
}
