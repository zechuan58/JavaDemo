package com.itheima.demo1;

//电视
public class Television extends Electrical {
    private String screenSize; //屏幕尺寸
    private String resolutionRatio; //分辨率

    public Television() {
    }

    public Television(String brand, String model, String color, double price, String screenSize, String resolutionRatio) {
        super(brand, model, color, price);
        this.screenSize = screenSize;
        this.resolutionRatio = resolutionRatio;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolutionRatio() {
        return resolutionRatio;
    }

    public void setResolutionRatio(String resolutionRatio) {
        this.resolutionRatio = resolutionRatio;
    }
}
