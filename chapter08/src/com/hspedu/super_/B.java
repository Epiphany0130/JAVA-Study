package com.hspedu.super_;

public class B extends A{

    //访问父类的属性，但不能访问父类的 private 属性
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    public void sum() {
        System.out.println("B 类的 sum() 方法...");
        //希望调用父类 A 的 cal 方法
        //这时，因为子类 B 没有 cal 方法，所以，有三种方法
        cal();          //先子类，再父类
        this.cal();     //同上
        super.cal();    //直接父类，不找子类

    }

    //访问父类的方法，但不能访问父类的 private 方法
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
    }

    //访问父类的构造器

    public B() {
//        super();
//        super("Jack");
        super("Jack", 18);
    }
}
