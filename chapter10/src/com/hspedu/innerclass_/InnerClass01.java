package com.hspedu.innerclass_;

public class InnerClass01 {     //外部其他类
    public static void main(String[] args) {

    }
}

class Outer {
    private int n1 = 100;   //属性
    public void m1() {     //方法
        System.out.println("Outer m1()");
    }
    {   //代码块
        System.out.println("Outer 类的构造代码块");
    }
    public Outer(int n1) {  //构造器
        this.n1 = n1;
    }
    class Inner {   //内部类
    }
}