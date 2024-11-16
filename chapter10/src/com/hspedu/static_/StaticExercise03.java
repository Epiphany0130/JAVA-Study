package com.hspedu.static_;

class Person1 {
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total) {
        total = total;  //在 static 方法中，不可以使用 this 关键字
        Person1.total = total;
    }
    public Person1() {
        total++;
        id = total;
    }
}

public class StaticExercise03 {
    public static void main(String[] args) {
        Person1.setTotalPerson(3);
        new Person();
    }
}