package com._2.record;

import com._2.student.Student;

public class Record {
    private Student studentRecord;

    public Record(Student student) {
        this.studentRecord = student;
    }

    public Student getStudentRecord() {
        return studentRecord;
    }

    public Record() {

    }

    public RecordService recordService() {

        return new RecordService();
    }
}