package com.hspedu.debug_;

public class Debug02 {
    public static void main(String[] args) {
        //数组越界
        int[] arr = {1, 10, -1};
        for (int i = 0; i < arr.length; i++) { //数组名错误
            System.out.println(arr[i]);
        }
        System.out.println("end...");
    }
}
