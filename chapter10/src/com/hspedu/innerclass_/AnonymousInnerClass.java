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