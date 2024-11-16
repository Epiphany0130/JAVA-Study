package com.hspedu.poly_;

public class Poly01 {

    public static void main(String[] args) {
        Master master = new Master("Tom");
        Dog dog = new Dog("Mix");
        Bone bone = new Bone("bone");

        master.feed(dog, bone);

        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("黄花鱼");

        master.feed(cat, fish);
    }
}
