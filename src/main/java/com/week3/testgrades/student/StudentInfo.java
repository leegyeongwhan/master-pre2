package com.week3.testgrades.student;

import com.week3.testgrades.reader.ConsolReader;
import com.week3.testgrades.reader.Reader;

import javax.security.auth.Subject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentInfo {
    private static Student student;
    private static Subject subject;
    private static Score score;
    private List<String> list = new ArrayList<>();

    private StudentInfo(Student student, Subject subject, Score score) {
        this.student = student;
        this.subject = subject;
        this.score = score;
    }

    public void start() throws IOException {
        List<String> list = getList();
        inputRecord(list);
    }

    private void inputRecord(List<String> fileList) {
        int recordSize = getRecordSize(fileList);

        for (int i = 0; i < recordSize; i++) {
            //input suduent ,subject
            String[] splits = fileList.get(i).split(" ");
            String[] studentList = {splits[0], splits[1], splits[2]};
            String[] subjectList = removeSplits(splits, 2);
            student = new Student(studentList);
        //    subject = new Subject(subjectList);
            Score score = null;
        }
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

    public static StudentInfo getStudentInfoInstance() {
        return new StudentInfo(student, subject, score);
    }
}
