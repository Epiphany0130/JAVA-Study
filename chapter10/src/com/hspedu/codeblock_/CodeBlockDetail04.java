package com.hspedu.codeblock_;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new B02();
    }
}

class A02 {
    private static int n1 = getVal01();
    static {
        System.out.println("A02的静态代码块被执行");
    }
    {
        System.out.println("A02的普通代码块被执行");
    }
    public int n3 = getVal02();
    public static int getVal01() {
        System.out.println("getVal01");
        return 10;
    }
    public int getVal02() {
        System.out.println("getVal02");
        return 10;
    }
    public A02() {
        System.out.println("A02构造器被调用");
    }
}

class B02 extends A02 {
    private static int n2 = getVal03();
    static {
        System.out.println("B02的静态代码块被执行");
    }
    public int n5 = getVal04();
    {
        System.out.println("B02的普通代码块被执行");
    }
    public static int getVal03() {
        System.out.println("getVal03");
        return 10;
    }
    public int getVal04() {
        System.out.println("getVal04");
        return 10;
    }
    public B02() {
        System.out.println("B02构造器被调用");
    }
}