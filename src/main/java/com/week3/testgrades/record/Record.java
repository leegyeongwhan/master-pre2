package com.week3.testgrades.record;

import com.week3.testgrades.student.Score;
import com.week3.testgrades.student.Student;
import com.week3.testgrades.student.StudentInfo;

public class Record {
    private StudentInfo studentInfo;
    private Record record;

    public Record(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
        this.record = null;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo.getStudentInfoInstance();
    }

    public Record getRecord() {
        return record;
    }

    public RecordService recordService() {
        return new RecordService();
    }
}