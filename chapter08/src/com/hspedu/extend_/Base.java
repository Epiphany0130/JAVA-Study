package com.hspedu.extend_;
//父类
public class Base {
    //四个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    //无参构造器
    //如果父类没有提供无参构造器
    public  Base() {
        System.out.println("父类 Base() 构造器被调用...");
    }

    public Base(String name, int age) {
        System.out.println("父类 Base(String name, int age) 构造器被调用...");
    }

    public Base(String name) {
        System.out.println("父类 Base(String name) 构造器被调用...");
    }

    //父类提供一个 public 的方法，返回了 n4
    public int getN4() {
        return n4;
    }

    //四个方法
    public void test100() {
        System.out.println("test100");
    }
    protected void test200() {
        System.out.println("test200");
    }
    void test300() {
        System.out.println("test300");
    }
    private void test400() {
        System.out.println("test400");
    }

    //call
    public void callTest400() {
        test400();
    }
}
