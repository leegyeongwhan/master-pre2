package com._2.student;

public class Student {
    private String name;
    private int hakbun;
    //private final int HAK_BUN;
    private String major;
    private Score score;

    public Student(String[] studentList, Score score) {
        this.name = studentList[0];
        this.hakbun = Integer.parseInt(studentList[1]);
        this.major = studentList[2];
        this.score = score;
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
