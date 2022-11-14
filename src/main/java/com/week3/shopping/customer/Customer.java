package com.week3.shopping.customer;

import com.week3.shopping.Grade;

public abstract class Customer {
    private Long id;
    private String name;
    private int price;
    private int parkingTime;

    public Customer(Long id, String name, int price, int parkingTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.parkingTime = parkingTime;
    }

    void getGrade(Grade grade) {

    }
}
