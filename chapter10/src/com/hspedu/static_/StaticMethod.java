package com.hspedu.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("Tom");
        tom.payFee(100);
        Stu mary = new Stu("Mary");
        mary.payFee(200);

        Stu.showFee();
    }
}

class Stu {
    private String name;
    //定义一个静态变量，来累加学生学费
    private static int fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee) {
        Stu.fee += fee; //累计到
    }
    public static void showFee() {
        System.out.println("学费为：" + Stu.fee);
    }
}
