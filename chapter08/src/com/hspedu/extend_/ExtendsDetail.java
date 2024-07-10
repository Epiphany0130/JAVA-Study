package com.hspedu.extend_;

public class ExtendsDetail {

    public static void main(String[] args) {
        //子类必须调用父类的构造器
        Sub sub = new Sub();    //创建了子类对象 Sub
        //sub.sayOK();

        //当创建子类对象时，不管使用子类的哪个构造器，默认情况在总会去调用父类的无参构造器
        System.out.println("=====第二个对象=====");
        Sub sub1 = new Sub("jack");

        System.out.println("=====第三个对象=====");
        Sub sub2 = new Sub("king", 10);

    }
}
