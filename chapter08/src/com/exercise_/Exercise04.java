package com.exercise_;

/**
 * @author GuYuqi
 * 2024.9.23 19:17
 * 输入一个学生的生日（年：y0、月：m0、日：d0）
 * 并输入当前日期（年：y1、月：m1、日：d1）
 * 求出该学生的年龄（实足年龄）
 */

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter y0、m0、d0: ");
        int y0 = sc.nextInt();
        int m0 = sc.nextInt();
        int d0 = sc.nextInt();
        System.out.print("Enter y1、m1、d1: ");
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int age = y1 - y0;
        if(m1 < m0 || m1 == m0 && d1 < d0)
            age --;

        System.out.println("age = " + age);
    }
}
