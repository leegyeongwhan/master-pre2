package com._2.student;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private int hakbun;
    private String hakbunName;
    //private final int HAK_BUN;
    private String major;
    private String[] scoreList;

    public String getHakbunName() {
        return hakbunName;
    }

    public String[] getScoreList() {
        return scoreList;
    }

    public Student(String[] studentList, Score score) {
        this.name = studentList[0];
        this.hakbun = Integer.parseInt(studentList[1]);
        this.major = studentList[2];
        this.scoreList = score.getScore();
    }

    public Student(String[] studentList) {
        this.name = studentList[0];
        if (studentList[1].equals("학번")) {
            this.hakbunName = studentList[1];
        } else {
            this.hakbun = Integer.parseInt(studentList[1]);
        }
        this.major = studentList[2];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(hakbunName, student.hakbunName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hakbunName);
    }

    public String getName() {
        return name;
    }

    public int getHakbun() {
        return hakbun;
    }

    public String getMajor() {
        return major;
    }
}
