package com.week3.shopping.customer;

import com.week3.shopping.Grade;
import com.week3.shopping.discount.Discountable;

public class RedCustomer extends Customer implements Discountable {
    private Grade grade;

    public RedCustomer(Long id, String name, int price, int parkingTime) {
        super(id, name, price, parkingTime);
    }

    @Override
    void getGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public void discount() {

    }
}
