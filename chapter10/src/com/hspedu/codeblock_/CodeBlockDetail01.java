package com.hspedu.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {

        //new时
        //AA aa = new AA();
        //new 子类时 父类加载
        //AA aa = new AA();
        //使用类的静态成员时加载
        //System.out.println(Cat.n1);

        //只执行一次
//        DD dd = new DD();
//        DD dd1 = new DD();
        System.out.println(DD.n1);
    }
}

class DD {
    public static int n1 = 8888;

    static {
        System.out.println("DD的静态代码块1被执行");
    }

    {
        System.out.println("DD的普通代码块1被执行");
    }
}

class Animal {
    static {
        System.out.println("Animal的静态代码块1被执行");
    }
}

class Cat extends Animal {
    public static int n1 = 999;

    static {
        System.out.println("Cat的静态代码块1被执行");
    }
}

class AA extends BB{
    static {
        System.out.println("AA的静态代码块1被执行");
    }
}

class BB {
    static {
        System.out.println("BB的静态代码块1被执行");
    }
}