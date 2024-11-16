package com.hspedu.homework;

public class Homework01 {
    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Person(10, "jack", "JavaEE工程师");
        persons[1] = new Person(50, "tom","大数据工程师");
        persons[2] = new Person(30, "mary","PHP工程师");

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        Person tmp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                if(persons[j].getAge() < persons[j+1].getAge()) {
                    tmp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}