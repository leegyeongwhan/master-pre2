package com.week3.testgrades.student;


import com.week3.testgrades.gradevaluation.BasicEvaluation;
import com.week3.testgrades.gradevaluation.GradeEvaluation;

public class Score {
    private String[] score;
    private String[] grade;
    GradeEvaluation gradeEvaluation = new BasicEvaluation();

    private void validationGrade() {
        grade = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            String grade = gradeEvaluation.getGrade(Integer.parseInt(score[i]));
            this.grade[i] = grade;
        }
    }

    public String[] getGrade() {
        return grade;
    }

    public Score(String[] scoreList) {
        this.score = scoreList;
        validationGrade();
    }

    public String[] getScore() {
        return score;
    }
}
