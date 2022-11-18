package com.week3.testgrades.gradevaluation;

public class CheckEvalution implements GradeEvaluation {

    @Override
    public String getGrade(int point) {
        String grade;

        if (point >= 70 && point <= 100) {
            return grade = "P";
        }
        return grade = "F";
    }
}
