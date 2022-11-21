package com.week4.mission1.shopping.membership;

import java.util.Comparator;
import java.util.Objects;

public class MemberShip implements Comparable<MemberShip> {
    private int id;
    private String name;
    private GRADE grade;

    public MemberShip(int id, String name, GRADE grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MemberShip)) {
            return false;
        }
        MemberShip m = (MemberShip) obj;
        return this.id == m.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
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

//    @Override
//    public int compare(MemberShip o1, MemberShip o2) {
//        return o1.id - o2.id;
//    }

//    @Override
//    public int compare(MemberShip o1, MemberShip o2) {
//        return o2.getName().compareTo(o1.getName());
//    }


    @Override
    public int compareTo(MemberShip o) {
        return (o.name.compareTo(this.name)) * -1;
    }
}
