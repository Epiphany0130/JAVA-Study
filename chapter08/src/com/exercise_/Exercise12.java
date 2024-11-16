package com.exercise_;

/**
 * @author GuYuqi
 * 2024.9.23 20:04
 * 由半径为 1 的圆和半径为 2 的圆所围成的圆环
 * 编写程序，输入 x，y，若点（x，y）的圆环内
 * 则输出 TRUE，否则输出 FALSE
 */

import java.util.Scanner;

import static java.lang.Math.*;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sqrt(x * x + y * y);
        if(z >= 1 && z <= 2)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
