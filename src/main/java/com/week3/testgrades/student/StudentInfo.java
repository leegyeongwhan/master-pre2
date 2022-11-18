package com.week3.testgrades.student;

import com.week3.testgrades.reader.ConsolReader;
import com.week3.testgrades.reader.Reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentInfo {
    private Student student;
    private MajorSubject subject;
    private Score score;
    private List<StudentInfo> list = new ArrayList<>();

    //private
    public StudentInfo(Student student, MajorSubject subject, Score score) {
        this.student = student;
        this.subject = subject;
        this.score = score;
    }


    public StudentInfo() throws IOException {
        start();
    }

    public Student getStudent() {
        return student;
    }

    public MajorSubject getSubject() {
        return subject;
    }

    public Score getScore() {
        return score;
    }


    public void start() throws IOException {
        List<String> list = getList();
        inputRecord(list);
    }

    private void inputRecord(List<String> fileList) {
        int recordSize = getRecordSize(fileList);
        //강감찬	211213	국어국문학과	국어	95	56
        for (int i = 0; i < recordSize; i++) {
            //input suduent ,subject
            String[] splits = fileList.get(i).split(" ");
            String[] studentList = {splits[0], splits[1], splits[2]};
            String[] removeSplits = removeSplits(splits, 2);
            String subjects = removeSplits[0];
            String[] scoreList = removeSplits(removeSplits, 0);
            Student student = new Student(studentList);
            MajorSubject subject = new MajorSubject(subjects);
            Score score = new Score(scoreList);
            StudentInfo studentInfo = new StudentInfo(student, subject, score);
            this.list.add(studentInfo);
        }
    }

    public List<StudentInfo> getStudentList() {
        return list;
    }

    private List<String> getList() throws IOException {
        Reader reader = new ConsolReader();
        List<String> fileList = reader.reader();
        return fileList;
    }

    private String[] removeSplits(String[] arr, int indx) {
        List<String> result = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i <= indx; i++) {
            result.remove(0);
        }
        return result.toArray(new String[0]);
    }

    private int getRecordSize(List<String> fileList) {
        int recordSize = 0;
        for (String s : fileList) {
            recordSize++;
        }
        return recordSize;
    }
}
