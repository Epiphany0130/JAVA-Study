package com.hm.wenzigedou;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("张三", 100);
        Role r2 = new Role("李四", 100);
        while(true) {
            r1.attack(r2);
            if(r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                System.out.println("游戏结束");
                break;
            }
            r2.attack(r1);
            if(r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                System.out.println("游戏结束");
                break;
            }
        }
    }
}
