package com.exercise_;

/**
 * @author GuYuqi
 * 2024.9.23 19:32
 * 输入一个大写字母，根据它在字母表上的顺序，从 Z 开始，倒数对应的字母
 * 例如：输入 ‘A’，输出 ‘Z’
 *      输入 ‘C’，输出 ‘X’
 */

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter c: ");
        char c = sc.next().charAt(0);
        char ch = (char)('Z' - (c - 'A'));
        System.out.println(ch);
    }

}
