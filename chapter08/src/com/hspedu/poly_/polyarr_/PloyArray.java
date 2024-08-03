package com.hspedu.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        //要求创建一个 Person 对象、两个 Student 对象和两个 Teacher 对象，统一放在数组中，并调用 say 方法
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 18, 100);
        persons[2] = new Student("smith", 19, 30.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);

        //循环便利多态数组，调用 say
        for (int i = 0; i < persons.length; i++) {
            //person[i] 编译类型是 Person，运行类型是根据实际情况由 JVM 来判断
            System.out.println(persons[i].say());   //动态绑定机制

            if(persons[i] instanceof Student) { //判断 person[i] 的运行类型是不是 Student
                Student student = (Student) persons[i]; //向下转型
                student.study();
                //((Student)person[i]).study()  和上面两行一样
            } else if(persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            } else {
                System.out.println("你的类型有误，请自己检查...");
            }
        }
    }
}
