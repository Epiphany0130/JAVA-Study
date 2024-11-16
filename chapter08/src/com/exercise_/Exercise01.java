package com.exercise_;

/**
 * @author GuYuqi
 * 2024.9.23 18:42
 * 从键盘上输入两个整数，不使用第三个变量，将两个整数交换顺序输出
 * 例如：输入 3 4  输出 4 3
 */

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1 + " " + num2);
    }
}
