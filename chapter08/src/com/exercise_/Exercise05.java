package com.exercise_;

/**
 * @author GuYuqi
 * 2024.9.23 19:30
 * 输入华氏温度，输出摄氏温度。（保留小数点后 2 位，输入输出都有中文提示）
 * 公式为： c = 5 * ( f - 32 ) / 9
 */

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter F:");
        double f = sc.nextDouble();

        double c = 5 * ( f - 32 ) / 9;
        System.out.println("C = " + c);
    }
}
