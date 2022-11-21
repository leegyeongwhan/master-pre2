package com.week3.testgrades.writer;


import com._2.record.Record;
import com._2.record.RecordService;
import com.week3.testgrades.reader.ConsolReader;
import com.week3.testgrades.reader.Reader;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FileWriter implements Writer {

    @Override
    public void writer() {

    }

//    public void start() {
//        List<String> list = getList();
//        inputRecord(list);
//    }
//
//    private void inputRecord(List<String> fileList) {
//        int recordSize = getRecordSize(fileList);
//        RecordService recordService = getRecordService();
//
//        for (int i = 0; i < recordSize; i++) {
//            //input suduent ,subject
//            String[] splits = fileList.get(i).split(" ");
//            String[] studentList = {splits[0], splits[1], splits[2]};
//            String[] subjectList = removeSplits(splits, 2);
//            Student student = new Student(studentList);
//            Subject subject = new Subject(subjectList);
//            recordService.print(student, subject);
//        }
//    }
//
//    private List<String> getList() {
//        Reader reader = new ConsolReader();
//        List<String> fileList = reader.reader();
//        return fileList;
//    }
//
//    private RecordService getRecordService() {
//        Record record = new Record();
//        RecordService recordService = record.recordService();
//        return recordService;
//    }
//
//    private String[] removeSplits(String[] arr, int indx) {
//        List<String> result = new ArrayList<>(Arrays.asList(arr));
//        for (int i = 0; i <= indx; i++) {
//            result.remove(0);
//        }
//        return result.toArray(new String[0]);
//    }
//
//    private int getRecordSize(List<String> fileList) {
//        int recordSize = 0;
//        for (String s : fileList) {
//            recordSize++;
//        }
//        return recordSize;
//    }
}
