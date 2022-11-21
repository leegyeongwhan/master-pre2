package com.week4.mission1.shopping;

import com.week4.mission1.shopping.membership.GRADE;
import com.week4.mission1.shopping.membership.MemberShip;

import java.util.ArrayList;
import java.util.List;

public final class MemberShipMangementList {

    private final List<MemberShip> memberShips = new ArrayList<>();

    public void addMemberShip(int id, String name, GRADE grade) {
        this.memberShips.add(new MemberShip(id, name, grade));
    }


    public void showAllMember() {
        System.out.println("=========================");
        for (MemberShip memberShip : memberShips) {
            System.out.println(memberShip.toString());
        }
    }

}
