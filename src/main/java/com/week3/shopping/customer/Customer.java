package com.week3.shopping.customer;

import com.week3.shopping.Grade;

public abstract class Customer {
    protected static Long id = 0L;
    protected String name;
    protected int price;
    protected int parkingTime;
    protected int mileage;
    protected int parkingPrice;

    protected Customer(String name, int price, int parkingTime) {
        this.id++;
        this.name = name;
        this.price = price;
        this.parkingTime = parkingTime;
    }

    protected void getGrade(Grade grade) {
    }

    public void printCustomer() {
        System.out.println(name + "님의 지불금액은" + price + "원이고, 적립포인트는.");
    }

    protected int getParkingTime() {
        return parkingTime * price;
    }
}
