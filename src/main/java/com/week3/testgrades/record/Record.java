package com.week3.testgrades.record;

import com.week3.testgrades.student.Data;
import com.week3.testgrades.student.StudentInfo;
import com.week3.testgrades.student.Subject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Record {
    private List<StudentInfo> studentInfoList;

    public void getStudentInfo() throws IOException {
        StudentInfo studentInfo = new StudentInfo();
        studentInfoList = studentInfo.getStudentList();
    }

    public List<String> findBySubjectRecordList() {
        List<String> subjectList = new ArrayList<>();
        for (int i = 0; i < studentInfoList.size(); i++) {
            Subject subject = studentInfoList.get(i).getSubject();
            String str = subject.getSubject();
            str = str.replaceAll("\\s", "");
            if (!subjectList.contains(str)) {
                subjectList.add(str);
            }
        }
        return subjectList;
    }

    public void printResultInfo() {
        List<String> recordList = findBySubjectRecordList();
        for (int i = 0; i < recordList.size(); i++) {
            getHeader(recordList.get(i));
            for (int j = 0; j < studentInfoList.size(); j++) {
                System.out.print(studentInfoList.get(j).getStudent().getName() + "  | " +
                        studentInfoList.get(j).getStudent().getHakbun() + " | " +
                        studentInfoList.get(j).getSubject().getSubject() + " | ");
                getScoreAndGrade(j, recordList.get(i));
                System.out.println("--------------------------------------");
            }
            System.out.println();
        }
    }

    private void getScoreAndGrade(int idx, String subject) {
        String[] grade = studentInfoList.get(idx).getScore().getGrade();
        String[] score = studentInfoList.get(idx).getScore().getScore();
        if (String.valueOf(Data.국어).equals(subject)) {
            System.out.print(score[0] + ":" + grade[0]);
        } else if (String.valueOf(Data.수학).equals(subject)) {
            System.out.print(score[1] + ":" + grade[1]);
        }
        System.out.println();
    }

    public void getHeader(String subject) {
        System.out.println(subject + " 과목 결과");
        System.out.println("--------------------------------------");
        System.out.println("    " + subject + " 수강생  학점");
        System.out.println("이름   |   학번  |  중점과목   |   점수");
        System.out.println("--------------------------------------");
    }

    public void printStudentList() {
        for (int i = 0; i < studentInfoList.size(); i++) {
            System.out.println(studentInfoList.get(i));
        }
    }

    public RecordService recordService() {
        return new RecordService();
    }

}