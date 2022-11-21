package com.week4.mission1.shopping.membership;

import com.week4.mission1.shopping.MemberShipMangementList;

public class MemberShip {
    private int id;
    private String name;
    private GRADE grade;

    public MemberShip(int id, String name, GRADE grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + "님의 아이디는" +
                id + " 이고" +
                " 등급은" + grade + "입니다";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GRADE getGrade() {
        return grade;
    }
}
