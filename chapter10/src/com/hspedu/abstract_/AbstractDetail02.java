package com.hspedu.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
//抽象类可以有任意成员
abstract class D {
    public int n1 = 10;
    public static String name = "hsp";
    public void hi() {
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok() {
        System.out.println("ok");
    }
}

//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为 abstract 类
abstract class E {
    public abstract void hi();
}
class F extends E {
    @Override
    public void hi() {//所谓实现就是要有方法体
    }
}
abstract class G extends E {

}

//抽象方法不能使用 private、final 和 static 来修饰，因为这些关键字都是和重写违背的
abstract class H {
//    private abstract void hi();
//    public final abstract void hello();
//    public static abstract void ok();
}