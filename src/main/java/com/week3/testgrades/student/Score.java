package com.week3.testgrades.student;


import com.week3.testgrades.gradevaluation.BasicEvaluation;
import com.week3.testgrades.gradevaluation.GradeEvaluation;

public class Score {
    private String[] score;
    private int korean;
    private int math;
    private int dance;
    private String[] grade;

    public Score(int korean, int math, int dance) {
        this.korean = korean;
        this.math = math;
        this.dance = dance;
    }

    public Score(int korean, int math) {
        this.korean = korean;
        this.math = math;
    }

    public int getDance() {
        return dance;
    }

    private void validationGrade(GradeEvaluation evaluation) {
        grade = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            String grade = evaluation.getGrade(Integer.parseInt(score[i]));
            this.grade[i] = grade;
        }
    }

    public int getKorean() {
        return korean;
    }

    public int getMath() {
        return math;
    }

    public String[] getGrade() {
        return grade;
    }

    public Score(String[] scoreList) {
        this.korean = Integer.parseInt(scoreList[0]);
        this.math = Integer.parseInt(scoreList[1]);
        this.score = scoreList;
    }

    public String[] getScore() {
        return score;
    }
}
