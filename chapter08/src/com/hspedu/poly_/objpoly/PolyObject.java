package com.hspedu.poly_.objpoly;

public class PolyObject {

    public static void main(String[] args) {
        //对象多态的特点
        Animal animal = new Dog();
        animal.cry();   //因为运行时，即执行到该行时，animal 运行类型是 Dog，所以 cry 是 Dog 的 cry

        animal = new Cat();
        animal.cry();
    }
}
