package com.hspedu.innerclass_;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02 { //外部类
    private int n1 = 100;
    private void m2() { //私有方法
    }
    public void m1() {  //外部类方法
        //1. 局部内部类是定义在外部类的局部位置，通常在方法中
        //3. 不能添加访问修饰符，但可以用 final 修饰
        //4. 作用域：仅仅在定义它的方法或代码块中
        final class Inner02 { //局部内部类
            //2. 可以直接访问外部类的所有成员，包括私有的
            public void f1() {
                //5. 局部内部类可以直接访问外部类的成员
                System.out.println("n1=" + n1);
                m2();
            }
        }
//        class Inner03 extends Inner02 { //局部内部类
//        }
        //6. 外部类在方法中可以创建 Inner02 对象，然后调用方法
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
