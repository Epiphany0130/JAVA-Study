package com.hspedu.pkg;

import com.hspedu.modifier.A;

//修饰类 - public
public class Test {

    public static void main(String[] args) {
        A a = new A();
        //在不同包下，可以访问 public 修饰的属性或方法
        //不能访问 protected，默认，private 修饰的属性或方法
        System.out.println("n1 = " + a.n1);

        a.m1(); //只能调用 a.m1();
    }
}


//修饰类 - 默认
class Tiger {

}