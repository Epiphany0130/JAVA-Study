package com.hspedu.innerclass_;

//演示匿名内部类
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04 { //外部类
    private int n1 = 10;    //属性
    public void method() {  //接口
        //基于接口的匿名内部类
//        IA tiger = new Tiger();
//        tiger.cry();

        //tiger 的编译类型 -- IA
        //tiger 的运行类型 -- 匿名内部类
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        };
        //底层会分配类名：类名 + $1
        System.out.println("tiger 的运行类型 = " + tiger.getClass());
        tiger.cry();
        //演示基于类的内部类
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了 test 方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();

    }
}
interface IA {   //接口
    public void cry();
}

//class Tiger implements IA { //类
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤");
//    }
//}
//
//class Dog implements IA { //类
//    @Override
//    public void cry() {
//        System.out.println("狗叫唤");
//    }
//}

class Father {  //类
    public Father(String name) {    //构造器
        super();
    }
    public void test() {    //方法

    }
}
abstract class Animal {
    abstract void eat();
}