package com.week3.testgrades.gradevaluation;

import com.week3.playboard.PlayerLevel;

public class Evaluatiner {
    private GradeEvaluation evaluation;

    public void play(int score) {
        this.evaluation.getGrade(score);
    }

    public void changeEvaluation(GradeEvaluation evaluation) {
        this.evaluation = evaluation;

    }

    public GradeEvaluation getEvaluation() {
        return evaluation;
    }
}
