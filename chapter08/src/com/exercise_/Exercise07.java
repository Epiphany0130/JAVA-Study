package com.exercise_;

/**
 * @author GuYuqi
 * 2024.9.23 19:40
 * 输入 a、b，求解 ax² - b = 0 的解（a、b 皆为正整数，结果保留小数点后 1 位）
 */

import java.util.Scanner;

import static java.lang.Math.*;

public class Exercise07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        double x1 = sqrt((double)b / a);
        double x2 = -sqrt((double)b / a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }
}
