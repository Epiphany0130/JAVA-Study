package com.hspedu.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 使用 OOP
 * 将各个功能对应一个方法
 */
public class SmallChangeSysOOP {

    //属性
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String detail = "--------------零钱通明细--------------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";

    //显示主菜单
    public void mainMenu() {
        do {

            System.out.println("\n--------------零钱通菜单OOP--------------");
            System.out.println("\t\t\t1. 零钱通明细");
            System.out.println("\t\t\t2. 收益入账");
            System.out.println("\t\t\t3. 消费");
            System.out.println("\t\t\t4. 退出");

            System.out.println("请选择（1 - 4）：");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        }while (loop);
        System.out.println("已退出项目...");
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(detail);
    }

    //完成收益入账
    public void income() {
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        if(money <= 0) {
            System.out.println("收益金额要大于 0");
            return; //与 POP 不一致
        }
        balance += money;
        date = new Date();  //获取当前日期
        detail += "\n收益入账 +" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //支付
    public void pay() {
        System.out.println("消费金额：");
        money = scanner.nextDouble();
        if(money <= 0 || money > balance) {
            System.out.println("消费金额应该在 0 -- " + balance);
            return;
        }
        System.out.println("消费说明");
        note = scanner.next();
        balance -= money;
        date = new Date();  //获取当前日期
        detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit() {
        String choise = "";
        while (true) {
            System.out.println("你确定要退出吗？ y / n");
            choise = scanner.next();
            if ("y".equals(choise) || "n".equals(choise)) {
                break;
            }
        }
        if(choise.equals("y")) {
            loop = false;
        }
    }
}
