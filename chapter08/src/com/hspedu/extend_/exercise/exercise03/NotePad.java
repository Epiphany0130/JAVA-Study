package com.hspedu.extend_.exercise.exercise03;

public class NotePad extends Computer{

    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public void printInfo() {
        System.out.println("NotePad 信息: ");
        //调用父类的 getDetails 方法，得到相关属性信息
        System.out.println(getDetails() + "\ncolor = " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
