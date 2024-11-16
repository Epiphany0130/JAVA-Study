package com.exercise_;

/**
 * @author GuYuqi
 * 2024.9.23 19:08
 * 已知三角形两边 a、b 及夹脚 α，求第三边 c 及面积 s，结果保留两位小数
 */

import java.util.Scanner;

import static java.lang.Math.*;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter alpha");
        double alpha = sc.nextDouble();
        alpha = alpha * 3.14 / 180;
        double c = sqrt(a * a + b * b - 2 * a * b * cos(alpha));
        double s = a * b * sin(alpha) / 2;
        System.out.println("c = " + c + ", s = " + s);

    }
}
