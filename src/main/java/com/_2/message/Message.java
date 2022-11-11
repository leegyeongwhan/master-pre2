package com._2.message;

public class Message {
    /*
     * Kim 학생은 2과목을 수강했습니다.
     * 총점은 200점이고 평균은 100점입니다
     */
    private final String STUDENT_MESSAGE = "학생은";
    private final String SUBJECT_MESSAGE = "과목을 수강했습니다";
    private final String SCORE_MESSAGE1 = "총점은";
    private final String SCORE_MESSAGE2 = "이고";
    private final String SCORE_MESSAGE3 = "입니다";

    public Message() {
    }

    public String getSTUDENT_MESSAGE() {
        return STUDENT_MESSAGE;
    }

    public String getSUBJECT_MESSAGE() {
        return SUBJECT_MESSAGE;
    }

    public String getSCORE_MESSAGE1() {
        return SCORE_MESSAGE1;
    }

    public String getSCORE_MESSAGE2() {
        return SCORE_MESSAGE2;
    }

    public String getSCORE_MESSAGE3() {
        return SCORE_MESSAGE3;
    }
}
