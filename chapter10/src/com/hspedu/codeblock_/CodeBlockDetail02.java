package com.hspedu.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A(3);
    }
}

class A {
    private int n2 = getN2();
    {
        System.out.println("A的普通代码块");
    }

    static {
        System.out.println("A的静态代码块");
    }
    private static int n1 = getN1();
    public static int getN1() {
        System.out.println("getN1被调用...");
        return 100;
    }
    public int getN2() {
        System.out.println("getN2被调用...");
        return 100;
    }

    public A(int n2) {
        System.out.println("构造器被调用");
        this.n2 = n2;
    }
}