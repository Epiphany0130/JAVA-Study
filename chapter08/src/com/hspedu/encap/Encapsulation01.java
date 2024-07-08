package com.hspedu.encap;

public class Encapsulation01 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(30000);

        System.out.println(person.info());

        //如果用构造器指定属性
        Person person1 = new Person("smilt", 20, 50000);
        System.out.println("=====smith=====");
        System.out.println(person1.info());
    }
}

class Person {
    public String name;     //名字公开
    private int age;        //age 私有化
    private double salary;  //salary 私有化

    //构造器 - 无参
    public Person() {
    }
    //构造器 - 含参
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        //将 set 方法写在构造器中，这样仍可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }


    //set 和 get 的快捷键，Alt + Insert
    //自动生成后根据要求完善代码

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //对数据的校验，相当于增加了业务逻辑
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对，需要(2-6)个字符，给默认名字");
            this.name = "张三";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你设置的年龄不对，需要在(1-120)，给默认年龄18");
            this.age = 18;  //给一个默认年龄
        }
    }

    public double getSalary() {
        //可以增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public String info() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
}