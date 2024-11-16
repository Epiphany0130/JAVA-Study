package com.exercise_;

import com.hspedu.poly_.polyarr_.Student;

//1. 创建一个User类，成员属性有name和behavior。方法有无参无返回值方法work()。其中work是一个空方法。并完成对User类的封装
//2. 创建Teacher和Student两个类，并实现Teacher类和Student类继承User类。
//3. 在Teacher类和Student类中重写User类的方法work,Teacher中调用work方法时实现打印：Jerry is teaching。Student类中调用work方法时实现打印：Tom is learning。
//4. 创建Main类，在main方法中使用多态来创建Teacher和Student的对象，然后调用其对应的work方法来打印输出值。
public class Test {

    static class User {
        private String name;
        private String behavior;

        public User(String name, String behavior) {
            this.name = name;
            this.behavior = behavior;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBehavior() {
            return behavior;
        }

        public void setBehavior(String behavior) {
            this.behavior = behavior;
        }

        public void work() {

        }
    }

    static class Teacher extends User {
        public Teacher(String name, String behavior) {
            super(name, behavior);
        }

        @Override
        public void work() {
            System.out.println(getName() + " is teaching");
        }
    }

    static class Student extends User {
        public Student(String name, String behavior) {
            super(name, behavior);
        }

        @Override
        public void work() {
            System.out.println(getName() + " is learning");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            User teacher = new Teacher("Jerry", "teaching");
            User student = new Student("Tom", "learning");

            teacher.work();
            student.work();
        }
    }
}