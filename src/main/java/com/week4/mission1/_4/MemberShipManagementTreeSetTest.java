package com.week4.mission1._4;

import com.week4.mission1.membership.GRADE;

public class MemberShipManagementTreeSetTest {
    public static void main(String[] args) {


        MemberShipMangementTreeSet management = new MemberShipMangementTreeSet();
        management.addMemberShip(1003, "Hong", GRADE.SILVER);
        management.addMemberShip(1001, "Park", GRADE.VIP);
        management.addMemberShip(1002, "Kim", GRADE.PLATINUM);

        System.out.println("모든 멤버 보여주기: ");
        management.showAllMember();

        System.out.println("존재 하는 아이디를 지웠을때 :");
        if (management.removeMember(1001)) {
            management.showAllMember();
        }

        System.out.println("존재 하지 않는 아이디를 지우려 할때:");
        if (management.removeMember(1005)) {
            management.showAllMember();
        }


//        System.out.println("이미 존재 하는 아이디를 추가하려 할때:");
//        management.addMemberShip(1002, "Lee", GRADE.VIP);
        // 이름으로 비교하는 경우
        System.out.println("이미 존재 하는 이름을 추가하려 할때:");
        management.addMemberShip(1002, "Kim", GRADE.VIP);
        management.showAllMember();
    }

}
