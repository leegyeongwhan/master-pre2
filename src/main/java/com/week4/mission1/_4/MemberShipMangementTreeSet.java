package com.week4.mission1._4;

import com.week4.mission1.membership.GRADE;
import com.week4.mission1.membership.MemberShip;

import java.util.Comparator;
import java.util.TreeSet;

public class MemberShipMangementTreeSet {

    private TreeSet<MemberShip> memberShips;

    public MemberShipMangementTreeSet(ascendingComparaotr ascendingComparaotr) {

        this.memberShips = new TreeSet<>(ascendingComparaotr);
    }

    public void addMemberShip(int id, String name, GRADE grade) {
        MemberShip memberShip = new MemberShip(id, name, grade);
        if (memberShips.contains(memberShip)) {
            System.out.println("이미 존재하는 아이디" + memberShip.getId() + " 는 추가 할 수없습니다");
            return;
        }
        this.memberShips.add(memberShip);
    }

    public void showAllMember() {
        System.out.println("=========================");
        for (MemberShip memberShip : memberShips) {
            System.out.println(memberShip);
        }
        System.out.println("=========================");
    }

    public boolean removeMember(int index) {
        for (MemberShip memberShip : memberShips) {
            if (memberShip.getId() == index) {
                memberShips.remove(memberShip);
                return true;
            }
        }
        System.out.println(index + "에 해당하는 맴버가 없습니다");
        return false;
    }

    public TreeSet<MemberShip> getMemberShips() {
        return memberShips;
    }
}


