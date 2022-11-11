package com._2.sebject;

public class Score {

    private String guk;
    private String eng;
    private String math;
    private String[] subjects;
    private int subjectCnt;

    private Score(String guk, String eng, String math) {
        this.guk = guk;
        this.eng = eng;
        this.math = math;
    }

    public Score(String[] subjectList) {
        this(subjectList[0], subjectList[1], subjectList[2]);
        this.subjects = subjectList;
        this.subjectCnt = subjectList.length;
    }

    public String[] getSubjects() {
        return subjects;
    }
}
