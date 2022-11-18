package com.week3.testgrades.writer;

import com.week3.playboard.PlayerLevel;
import com.week3.testgrades.gradevaluation.BasicEvaluation;
import com.week3.testgrades.gradevaluation.GradeEvaluation;
import com.week3.testgrades.gradevaluation.MajorEvalution;
import com.week3.testgrades.record.Record;
import com.week3.testgrades.record.RecordService;
import com.week3.testgrades.student.Data;
import com.week3.testgrades.student.MajorSubject;
import com.week3.testgrades.student.StudentInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReportWriter implements Writer {
    private Record record = new Record();
    private List<StudentInfo> studentInfoList;

    @Override
    public void writer() throws IOException {
        getStudentInfo();
        printResultInfo();
    }

    public void getStudentInfo() throws IOException {
        StudentInfo studentInfo = new StudentInfo();
        studentInfoList = studentInfo.getStudentList();
    }

    public List<String> findBySubjectRecordList() {
        List<String> subjectList = new ArrayList<>();
        for (int i = 0; i < studentInfoList.size(); i++) {
            MajorSubject subject = studentInfoList.get(i).getSubject();
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
        StudentInfo studentInfo = studentInfoList.get(idx);
        GradeEvaluation basicEvaluation = new BasicEvaluation();
        GradeEvaluation majorEvalution = new MajorEvalution();

        if (subject.equals(String.valueOf(Data.국어))) {
            if (studentInfo.getSubject().getSubject().equals(subject)) {
                String grad = majorEvalution.getGrade(studentInfo.getScore().getKorean());
                System.out.print(studentInfo.getScore().getKorean() + ":" + grad);
                System.out.println();
                return;
            }
            String grad = basicEvaluation.getGrade(studentInfo.getScore().getKorean());
            System.out.print(studentInfo.getScore().getKorean() + ":" + grad);
        } else if (subject.equals(String.valueOf(Data.수학))) {
            if (studentInfo.getSubject().getSubject().equals(subject)) {
                String grad = majorEvalution.getGrade(studentInfo.getScore().getMath());
                System.out.print(studentInfo.getScore().getMath() + ":" + grad);
                System.out.println();
                return;
            }
            String grad = basicEvaluation.getGrade(studentInfo.getScore().getMath());
            System.out.print(studentInfo.getScore().getMath() + ":" + grad);
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
