package com.hspedu.extend_.exercise.exercise03;

public class PC extends Computer{

    private String brand;

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC 信息: ");
        //调用父类的 getDetails 方法，得到相关属性信息
        System.out.println(getDetails() + "\nbrand = " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
