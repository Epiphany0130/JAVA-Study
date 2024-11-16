package com.hm.wenzigedou;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role) {
        Random random = new Random();
        int hurt = random.nextInt(20) + 1;

        int remainder = role.getBlood() - hurt;
        remainder = remainder < 0 ? 0 : remainder;
        role.setBlood(remainder);

        System.out.println(this.getName() + "挥起拳头，打了" + role.getName() + "，" + role.getName() + "受到" + hurt + "点伤害，剩余" + remainder + "血量");
    }
}
