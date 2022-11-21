package com.week4.mission1.shopping.customer;

import com.week4.mission1.membership.GRADE;
import com.week4.mission1.shopping.discount.Discountable;

public class DiamondCustomer extends Customer implements Discountable {
    private GRADE grade;
    private final int discount = 10;
    private boolean agent = true;

    public DiamondCustomer(String name, String grade, int price, int parkingTime) {
        super(name, price, parkingTime);
        this.grade = GRADE.valueOf(grade);
        this.mileageCount(price);
        this.parkingPrice = 0;
    }

    @Override
    public void getGrade(GRADE grade) {
        this.grade = grade;
    }

    //10% 할인률 적용, 10%포인트 적립, 전문 상담원 배정	무료
    @Override
    public void printCustomer() {
        System.out.println(name + "님의 지불금액은" + (price - discount(price)) + "이고 적립포인트는");
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
        return mileage = price * discount / 100;
    }
}
