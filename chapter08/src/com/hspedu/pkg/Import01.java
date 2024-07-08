package com.hspedu.pkg;

import java.lang.reflect.Array;
import java.util.Arrays;
public class Import01 {

    public static void main(String[] args) {

        //使用系统提供的 Arrays 完成数组排序
        int[] arr = {-1, 20, 2, 13, 3};

        Arrays.sort(arr);
        
        //输出结果
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
}
