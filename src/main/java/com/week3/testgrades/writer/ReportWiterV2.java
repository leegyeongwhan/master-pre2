package com.week3.testgrades.writer;

import com.week3.testgrades.gradevaluation.*;
import com.week3.testgrades.record.Record;
import com.week3.testgrades.record.RecordService;
import com.week3.testgrades.student.*;

import javax.security.auth.Subject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReportWiterV2 implements Writer {
    private Record record = new Record();
    private List<StudentInfo> studentInfoList = new ArrayList<>();
    private GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvalution(), new CheckEvalution()};
    private StringBuilder sb = new StringBuilder();

    @Override
    public void writer() throws IOException {
        studentInfoList.add(new StudentInfo(new Student("강감찬", "211213", "국어국문학과"),
                new MajorSubject("국어"), new Score(95, 56, 95)));
        studentInfoList.add(new StudentInfo(new Student("김유신", "212330", "컴퓨터공학과"),
                new MajorSubject("수학"), new Score(95, 98, 85)));
        studentInfoList.add(new StudentInfo(new Student("신사임당", "211213", "국어국문학과"),
                new MajorSubject("국어"), new Score(100, 88, 55)));
        studentInfoList.add(new StudentInfo(new Student("이순신", "202360", "국어국문학과"),
                new MajorSubject("국어"), new Score(89, 95)));
        studentInfoList.add(new StudentInfo(new Student("홍길동", "201290", "컴퓨터공학과"),
                new MajorSubject("수학"), new Score(83, 56)));
        printResultInfo();

    }

    public void getStudentInfo() throws IOException {
        StudentInfo studentInfo = new StudentInfo();
        studentInfoList = studentInfo.getStudentList();
    }

    /**
     * enum형식으로 받기
     *
     * @return
     */
    public List<String> findBySubjectDataRecordList() {
        List<String> subjectList = new ArrayList<>();
        for (Data data : Data.values()) {
            subjectList.add(String.valueOf(data));
        }
        return subjectList;
    }

    /**
     * List 형식으로 받기
     *
     * @return
     */
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
        List<String> recordList = findBySubjectDataRecordList();
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


        if (subject.equals(String.valueOf(Data.국어))) {
            if (sujectCheckToEvaluationer(subject, studentInfo, studentInfo.getScore().getKorean())) return;
        } else if (subject.equals(String.valueOf(Data.수학))) {
            if (sujectCheckToEvaluationer(subject, studentInfo, studentInfo.getScore().getMath())) return;
        } else if (subject.equals(String.valueOf(Data.방송댄스))) {
        }
    }


    private boolean sujectCheckToEvaluationer(String subject, StudentInfo studentInfo, int score) {

        Evaluatiner evaluatiner = new Evaluatiner();

        if (studentInfo.getSubject().getSubject().equals(subject)) {
            GradeEvaluation majorEvalution = new MajorEvalution();
            evaluatiner.changeEvaluation(majorEvalution);
            String grade = evaluatiner.getEvaluation().getGrade(score);
            System.out.print(score + ":" + grade);
            System.out.println();
            return true;
        }
        GradeEvaluation basicEvaluation = new BasicEvaluation();
        evaluatiner.changeEvaluation(basicEvaluation);
        String grade = evaluatiner.getEvaluation().getGrade(score);
        System.out.print(score + ":" + grade);
        System.out.println();
        return false;
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
