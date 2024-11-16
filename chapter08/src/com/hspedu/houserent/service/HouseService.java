package com.hspedu.houserent.service;

import com.hspedu.houserent.domain.House;

public class HouseService {

    private House[] houses;

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "18888888888", "hongkong", 2000, "empty");
    }

    public House[] list() {
        return houses;
    }
}
