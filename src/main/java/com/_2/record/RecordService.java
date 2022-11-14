package com._2.record;

import com._2.message.Message;
import com._2.sebject.Score;
import com._2.student.Student;

public class RecordService {
    /**
     * Kim 학생은 2과목을 수강했습니다.
     * 총점은 200점이고 평균은 100점입니다
     *
     * @param student
     * @param subject
     */
    private static Message message = new Message();


    //이름 학번 전공과목 국어 수학 영어
    public void printStartRawCal(Student student, Score subject) {
        System.out.print(student.getName() + " " + student.getHakbunName() + " " + student.getMajor() + " ");
        for (int i = 0; i < subject.getSubjects().length; i++) {
            System.out.print(subject.getSubjects()[i] + " ");
        }
        System.out.println();
    }

    //  Kim 학생은 2과목을 수강했습니다.
    //  총점은 200점이고 평균은 100점입니다.
    public void printRecord(Record record) {
        Student studentRecord = record.getStudentRecord();
        String[] scoreList = studentRecord.getScoreList();
        
        System.out.println(studentRecord.getName() + message.getSTUDENT_MESSAGE() + scoreList.length + message.getSCORE_MESSAGE1()
                + message.getSCORE_MESSAGE2() + getScore(scoreList) + message.getSCORE_MESSAGE3() + getScoreAvg(scoreList));
    }

    private int getScore(String[] scoreList) {
        int sum = 0;
        for (int i = 0; i < scoreList.length; i++) {
            sum += Integer.parseInt(scoreList[i]);
        }
        return sum;
    }

    private String getScoreAvg(String[] scoreList) {
        double avg = 0;
        int cnt = 0;
        for (int i = 0; i < scoreList.length; i++) {
            avg += Integer.parseInt(scoreList[i]);
            if (Integer.parseInt(scoreList[i]) == 0) {
                cnt++;
                continue;
            }
        }
        avg /= scoreList.length - cnt;
        return String.valueOf(avg);
    }

}
