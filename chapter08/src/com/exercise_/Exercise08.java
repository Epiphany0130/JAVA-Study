package com.exercise_;

/**
 * @author GuYuqi
 * 2024.9.23 19:45
 * 输入一个小数位数为 5 位的浮点型数据，利用公式对它小数点右边第三位四舍五入
 * 假设输入的数为3.14159，则公式计算完了后为 3.14 进行输出
 * 不管输出的格式控制为小数点后 2 位还是 3 位还是 4 位，输出的数值永远为3.14
 * 只不过如果输出小数点后 3 位的话，输出为 3.140
 */

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        double num = sc.nextDouble();
        num = (int)(num * 100 + .5);
        num /= 100;
        System.out.println("num = " + num);
    }
}
