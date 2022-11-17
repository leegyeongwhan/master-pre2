package com.week3.testgrades.student;


public class Subject {

    private String guk;
    private String eng;
    private String math;
    private String[] subjects;
    private int subjectCnt;

    private Subject(String guk, String eng, String math) {
        this.guk = guk;
        this.eng = eng;
        this.math = math;
    }

    public Subject(String string) {
        this.guk = string;
    }

    public String[] getSubjects() {
        return subjects;
    }
}
