package com.week3.testgrades.record;

import com.week3.testgrades.student.StudentInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Record {
    private StudentInfo studentInfo;
    private List<StudentInfo> list;

    public void getStudentInfo() throws IOException {
        studentInfo = new StudentInfo();
        list = studentInfo.getStudentList();
    }

    public String getRecordSubject() {
        return "";
    }



    public void getHeader() {
        System.out.println("--------------------------------------");
        System.out.println(studentInfo.getSubject() + "수강생  학점");
        System.out.println("이름   |   학번  | 중점과목 |  점수");
        System.out.println("--------------------------------------");
    }

    public void printStudentList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public RecordService recordService() {
        return new RecordService();
    }

}