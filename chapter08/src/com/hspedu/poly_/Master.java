package com.hspedu.poly_;

public class Master {

    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //利用多态机制，统一管理喂食问题
    public void feed(Animal animal, Food food) {
        System.out.println("主人 " + name + " 给 " + animal.getName() + " 喂 " + food.getName());
    }

//    //主人给小狗喂食
//    public void feed(Dog dog, Bone bone) {
//        System.out.println("主人 " + name + " 给 " + dog.getName() + " 吃 " + bone.getName());
//    }
//    //主人给小猫喂黄花鱼
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("主人 " + name + " 给 " + cat.getName() + " 吃 " + fish.getName());
//    }
}
