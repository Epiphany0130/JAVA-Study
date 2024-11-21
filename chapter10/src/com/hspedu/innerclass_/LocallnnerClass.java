package com.hspedu.innerclass_;

//演示局部内部类的使用
public class LocallnnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}
class Outer02 { //外部类
    private int n1 = 10;
    private void m2() {

    }
    public void m1() {
        //1. 局部内部类，通常定义在方法
        //3. 不能添加访问修饰符，但可以用 final 修饰
        //4. 作用域仅限于该方法，出了该方法就不可以访问
        final class Inner02 { //局部内部类
            //2. 可以直接访问外部类的所有成员，包括私有的
            private int n1 = 100;
            public void f1() {
                //5. 局部内部类可以直接访问外部类的成员
                //7. 外部类和局部类成员重名，就近原则，如果要访问外部类的成员，使用外部类名.this.成员 访问
                System.out.println("n1=" + n1 + "外部类的n1=" + Outer02.this.n1);
                m2();
            }
        }
        //6. 外部类想要访问局部内部类的对象，需要通过外部类的方法，间接访问
        Inner02 inner02 = new Inner02();
        inner02.f1();
        /*
        class Inner03 extends Inner02{ //局部内部类可以继承，但这里 final 了，不能继承

        }
         */
    }

}