package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String detail = "--------------零钱通明细--------------";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String note = "";

        do {

            System.out.println("\n--------------零钱通菜单--------------");
            System.out.println("\t\t\t1. 零钱通明细");
            System.out.println("\t\t\t2. 收益入账");
            System.out.println("\t\t\t3. 消费");
            System.out.println("\t\t\t4. 退出");

            System.out.println("请选择（1 - 4）：");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
                    if(money <= 0) {
                        System.out.println("收益金额要大于 0");
                        break;
                    }
                    balance += money;
                    date = new Date();  //获取当前日期
                    detail += "\n收益入账 +" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额：");
                    money = scanner.nextDouble();
                    if(money <= 0 || money > balance) {
                        System.out.println("消费金额应该在 0 -- " + balance);
                        break;
                    }
                    System.out.println("消费说明");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();  //获取当前日期
                    detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
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
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        }while (loop);

        System.out.println("已退出项目...");
    }
}
