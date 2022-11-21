package com.week4.mission1.shopping.customer;

import com.week4.mission1.membership.GRADE;
import com.week4.mission1.shopping.discount.Discountable;

public class RedCustomer extends Customer implements Discountable {
    private GRADE grade;
    private final int discount = 10;
    private boolean agent = true;

    public RedCustomer(String name, String grade, int price, int parkingTime) {
        super(name, price, parkingTime);
        this.grade = GRADE.valueOf(grade);
        this.mileageCount(price);
        this.parkingPrice= 3000;
        this.parkingPrice = parkingTime * parkingPrice;
    }

    @Override
    public void getGrade(GRADE grade) {
        this.grade = grade;
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

    @Override
    public int discount(int price) {
        return price * discount / 100;
    }

    @Override
    public int mileageCount(int price) {
        return mileage = price * discount / 1000;
    }
}
