package com.exercise_;

/**
 * @author GuYuqi
 * 2024.9.23 19:54
 * 用户输入一个三位的正整数，请判断该数字是否为水仙花数
 * 如果是水仙花数请输出 “Y”，否则请输出 “N”
 */

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int a = num % 10;
        int b = num / 10 % 10;
        int c = num / 100;
        if(a * a * a + b * b * b + c * c * c == num)
            System.out.println("Y");
        else
            System.out.println("N");
    }
}
