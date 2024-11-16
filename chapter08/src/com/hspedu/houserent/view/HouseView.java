package com.hspedu.houserent.view;

import com.hspedu.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;    //控制显示菜单
    private char key = ' ';    //接收用户选择


    //显示主菜单
    public void mainMenu(){
        do {
            System.out.println("------------房屋出租系统------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出");
            System.out.println("请选择(1-6):");
            key = Utility.readChar();
            switch (key){
                case '1':
                    System.out.println("新 增 房 源");
                    break;
                case '2':
                    System.out.println("查 找 房 屋");
                    break;
                case '3':
                    System.out.println("删 除 房 屋 信 息");
                    break;
                case '4':
                    System.out.println("修 改 房 屋 信 息");
                    break;
                case '5':
                    System.out.println("房 屋 列 表");
                    break;
                case '6':
                    System.out.println("退 出");
                    loop = false;
                    break;
            }
        }while(loop);
    }
}
