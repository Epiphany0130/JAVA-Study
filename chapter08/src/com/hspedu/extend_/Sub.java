package com.hspedu.extend_;
//子类
public class Sub extends Base{

    public Sub(String name, int age) {
//        //调用父类无参构造器
//        super();    //或者空着不写也行，默认调用

//        //调用父类 Base(String name) 构造器
//        super("hsp");

        //调用父类 Base(String name, int age) 构造器
        super("king", 20);
        System.out.println("子类 Sub(String name, int age) 构造器被调用...");
    }

    public Sub() {
        //super();    //默认调用父类的无参构造器
        //如果父类没有提供无参构造器，则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作
        super("smith", 10);
        System.out.println("子类 Sub() 构造器被调用...");
    }

    //当创建子类对象时，不管使用子类的哪个构造器，默认情况在总会去调用父类的无参构造器
    public Sub(String name) {
        //do nothing...
        //如果父类没有提供无参构造器，则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作
        super("tom", 30);
        System.out.println("子类 Sub(String name) 构造器被调用...");
    }

    public void sayOK() {   //子类方法
        //非私有的属性和方法可以在子类直接访问
        //但是私有属性不能在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);

        test100();
        test200();
        test300();

        //要通过父类提供公共的方法去访问
        System.out.println("n4 = " + getN4());
        callTest400();
    }
}
