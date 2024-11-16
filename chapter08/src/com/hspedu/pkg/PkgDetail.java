//package 的作用是生命当前类所在的包，需要放在 class 的最上面，一个类中最多只有一句 package
package com.hspedu.pkg;
//import 指令位置放在 package 的下面，在类定义前面，可以有多句且没有顺序要求
import java.util.Arrays;
import java.util.Scanner;

public class PkgDetail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0, -1, 1};
        Arrays.sort(args);
    }
}
