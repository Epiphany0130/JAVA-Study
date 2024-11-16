package com.hspedu.extend_.exercise.exercise02;

public class ExtendsExercise02 {

    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    public A() {
        System.out.println("我是 A 类");
    }
}

class B extends A {
    public B() {
        System.out.println("我是 B 类的无参构造");
    }
    public B(String name) {
        System.out.println(name + "我是 B 类的有参构造");
    }
}


class C extends B {
    public C() {
        this("hello");
        System.out.println("我是 C 类的无参构造");
    }
    public C(String name) {
        super("hahah");
        System.out.println("我是 C 类的有参构造");
    }
}