package com.hspedu.poly_.exercise_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub0 s = new Sub0();
        System.out.println(s.count);
        s.display();
        Base0 b = s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();
    }
}

class Base0 {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}

class Sub0 extends Base0 {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}