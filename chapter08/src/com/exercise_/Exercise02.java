package com.exercise_;

/**
 * @author GuYuqi
 * 2024.9.23 18:58
 * 输入直角三角形的两个直角边长，求第三边的边长和三角形的面积
 */

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercise02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter a number: ");
        double num2 = sc.nextDouble();
        double num3 = sqrt(num1 * num1 + num2 * num2);
        System.out.println("num3 = " + num3);
        System.out.println("s = " + (num1 * num2 * .5));

    }
}
