package com.week3.shopping.customer;

import com.week3.shopping.Grade;
import com.week3.shopping.discount.Discountable;

public class RedCustomer extends Customer implements Discountable {
    private Grade grade;
    private final int discount = 10;
    private int mileage;
    private int parkingPrice = 3000;
    private boolean agent = true;

    public RedCustomer(String name, String grade, int price, int parkingTime) {
        super(name, price, parkingTime);
        this.grade = Grade.valueOf(grade);
        mileageCount(price);
        parkingPrice = parkingTime * parkingPrice;
    }

    @Override
    public void getGrade(Grade grade) {
        this.grade = grade;
    }


    @Override
    public int discount(int price) {
        return price * discount / 100;
    }

    @Override
    public int mileageCount(int price) {
        return mileage = price * discount / 1000;
    }


    @Override
    public void printCustomer() {
        super.printCustomer();
        System.out.println(mileage + "점 입니다 주차요금은" + parkingPrice);
    }

    @Override
    public int getParkingTime() {
        return parkingPrice * parkingTime;
    }
}
