package com.week4.mission1._3;

import com.week4.mission1.membership.GRADE;
import com.week4.mission1.membership.MemberShip;

import java.util.*;

public class MemberShipMangementMap {

    private final Map<Integer, MemberShip> memberShips;

    public MemberShipMangementMap() {
        this.memberShips = new HashMap<>();
    }

    public void addMemberShip(int id, String name, GRADE grade) {
        MemberShip memberShip = new MemberShip(id, name, grade);
        if (memberShips.containsKey(memberShip.getId())) {
            memberShips.replace(memberShip.getId(), memberShip);
            System.out.println("이미 있는 아이디" + memberShip.getId() + " 의값이 변경됩니다");
            return;
        }
        this.memberShips.put(memberShip.getId(), memberShip);
    }

    public void showAllMember() {
        System.out.println("=========================");
        for (Map.Entry<Integer, MemberShip> entry : memberShips.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("=========================");
    }

    public boolean removeMember(int index) {
        for (Integer integer : memberShips.keySet()) {
            if (index == integer) {
                memberShips.remove(index);
                return true;
            }
        }
        System.out.println(index + "에 해당하는 맴버가 없습니다");
        return false;
    }
}
