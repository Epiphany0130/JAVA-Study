package com.hspedu.houserent;

import com.hspedu.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建 HouseView 对象，并显示主菜单， 是整个程序的入口
        new HouseView().mainMenu();
        System.out.println("========已退出房屋出租系统========");
    }
}
