package com.hspedu.Interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("悟空");
        wukong.climing();
        wukong.swimming();
        wukong.flying();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climing() {
        System.out.println(name + "会爬树");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Fishable {
    void swimming();
}

interface Birdable {
    void flying();
}

class LittleMonkey extends Monkey implements Fishable, Birdable{
    public LittleMonkey(String name) {
        super(name);
    }
    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习，会游泳了");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "通过学习，会飞翔了");
    }

}