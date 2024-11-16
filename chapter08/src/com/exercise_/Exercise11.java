package com.exercise_;

/**
 * @author GuYuqi
 * 2024.9.23 20:00
 * 有一函数，写一程序，输入 x 输出 y 值
 *    |- x      (x < 1)
 * y =|  2x - 1 (1 ≤ x < 10)
 *    |- 3x - 10(x ≥ 10)
 */

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        int y;
        if(x < 1)
            y = x;
        else if(x < 10)
            y = 2 * x - 1;
        else
            y = 3 * x - 10;
        System.out.println("y = " + y);
    }
}
