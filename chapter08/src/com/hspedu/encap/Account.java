/**
 * @author GuYuqi
 * 2024/7/8 23:16
 * 创建程序，在其中定义两个类：Account 和 AccountTest 类体会 Java 的封装性
 *
 * 1. Account 类要求具有属性：姓名（长度为2、3、4位）、余额（必须 >20）、密码（必须是六位），如果不满足，则给出提示信息，并给默认值
 * 2. 通过 setXxx 的方法给 Account 的属性赋值
 * 3. 在 AccountTest 中测试
 */
package com.hspedu.encap;

public class Account {
    String name;
    double balance;
    String passwork;

    //构造器
    public Account() {
    }
    public Account(String name, double balance, String passwork) {
        this.name = name;
        this.balance = balance;
        this.passwork = passwork;
        setBalance(balance);
        setName(name);
        setPasswork(passwork);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //姓名 长度2、3、4位
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名长度输入错误，给默认姓名");
            this.name = "张三";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("余额过低，给默认余额");
            this.balance = 20;
        }
    }

    public String getPasswork() {
        return passwork;
    }

    public void setPasswork(String passwork) {
        if(passwork.length() == 6) {
            this.passwork = passwork;
        } else {
            System.out.println("密码长度输入错误，给默认密码");
            this.passwork = "123456";
        }
    }

    public String info() {
        return name + " " + balance + " " + passwork;
    }
}