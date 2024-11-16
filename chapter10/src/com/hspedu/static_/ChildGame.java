package com.hspedu.static_;

public class ChildGame {

    public static void main(String[] args) {


        Child child1 = new Child("白骨精");
        child1.join();
        child1.count++;
        Child child2 = new Child("狐狸精");
        child2.join();
        child2.count++;
        Child child3 = new Child("老鼠精");
        child3.join();
        child3.count++;

        //类变量可以通过类名访问
        System.out.println("共有" + Child.count + "个孩子加入了游戏");
    }

}

class Child {   //类
    private String name;
    //定义类变量
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }
    public void join() {
        System.out.println(name + "加入了游戏");
    }
}