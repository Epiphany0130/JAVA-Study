package com.hspedu.override_;

public class Dog extends Animal{

    //因为 Dog 是 Animal 子类
    //Dog 的 cry 方法和 Animal 的 cry 定义类型一样
    //这时我们说 Dog 的 cry 方法重写了 Animal 的 cry 方法
    public void cry() {

        System.out.println("小狗汪汪叫");
    }
}
