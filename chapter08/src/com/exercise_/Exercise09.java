package com.exercise_;

/**
 * @author GuYuqi
 * 2024.9.23 19:50
 * 用户输入小明和小红的年龄，分别存入变量 age1 和 age2
 * 如果小明的年龄大于小红的年龄泽输出“小明比小红大”
 * 如果小红的年龄大于小明的年龄泽输出“小红比小明大”
 * 否则输出“小明和小红一样大”
 */

import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter XiaoMing: ");
        int age1 = sc.nextInt();
        System.out.printf("Enter XiaoHong: ");
        int age2 = sc.nextInt();
        if(age1 > age2)
            System.out.println("小明比小红大");
        else if(age1 < age2)
            System.out.println("小红比小明大");
        else
            System.out.println("小明小红一样大");
    }
}
