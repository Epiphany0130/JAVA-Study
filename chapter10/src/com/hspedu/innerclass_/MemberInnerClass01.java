package com.hspedu.innerclass_;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
    }
}

class Outer08 { //内部类
    private int n1 = 10;
    public String name = "张三";

    private void hi() {
        System.out.println("say() 方法...");
    }

    public class Innter08 {    //成员内部类 可以加修饰符
        public void say() {
            System.out.println("Outer08 的 n1= " + n1 + " name = " + name);
            hi();
        }
    }
    public void t1() {
        Innter08 innter08 = new Innter08();
        innter08.say();
    }
}