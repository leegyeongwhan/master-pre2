package com.week3.testgrades.record;

import com.week3.testgrades.student.StudentInfo;
import com.week3.testgrades.student.Subject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Record {
    private StudentInfo studentInfo;
    private List<StudentInfo> list;

    public void getStudentInfo() throws IOException {
        studentInfo = new StudentInfo();
        list = studentInfo.getStudentList();
        System.out.println("11"+list);
    }

    public List<String> findBySubjectRecordList() {
        List<String> subjectList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Subject subject = list.get(i).getSubject();
            subjectList.add(String.valueOf(subject));
        }
        return subjectList;
    }

    public void printResultInfo() {
        List<String> recordList = findBySubjectRecordList();
        for (int i = 0; i < recordList.size(); i++) {
            getHeader(recordList.get(i));

        }
    }

    public void getHeader(String subject) {
        System.out.println(subject + " 과목 결과");
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