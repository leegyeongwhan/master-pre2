package com.week3.testgrades.record;

public class Record {

    //    public void print(Student student, Subject subject) {
//        System.out.println(student.getName() + "학생은" + getSubjectCount(subject) + "을수강했습니다");
//        System.out.println("총점은" + getSubjectAllSum(subject) + "이고 평균은" + getSubjectAvg(subject) + "입니다");
//        System.out.println();
//    }
//
//    private int getSubjectCount(Subject subject) {
//        return subject.getSubjects().length - subjectcnt(subject.getSubjects());
//    }
//
//    private int subjectcnt(String[] subjects) {
//        int cnt = 0;
//        for (int i = 0; i < subjects.length; i++) {
//            if (Integer.parseInt(subjects[i]) == 0) {
//                cnt++;
//            }
//        }
//        return cnt;
//    }
//
//    private String getSubjectAvg(Subject subject) {
//        String[] subjects = subject.getSubjects();
//        double avg = 0;
//        int cnt = 0;
//        for (int i = 0; i < subjects.length; i++) {
//            avg += Integer.parseInt(subjects[i]);
//            if (Integer.parseInt(subjects[i]) == 0) {
//                cnt++;
//                continue;
//            }
//        }
//        avg /= subjects.length - cnt;
//        return String.valueOf(avg);
//    }
//
//    private String getSubjectAllSum(Subject subject) {
//        String[] subjects = subject.getSubjects();
//        double sum = 0;
//        for (int i = 0; i < subjects.length; i++) {
//            sum += Integer.parseInt(subjects[i]);
//        }
//        return String.valueOf(sum);
//    }
}