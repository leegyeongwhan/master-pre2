package com._2.writter;


import com._2.reader.FileReader;
import com._2.record.Record;
import com._2.record.RecordService;
import com._2.sebject.Subject;
import com._2.student.Score;
import com._2.student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileWriter implements Writer {

    @Override
    public void writer() {
        start();
    }

    public void start() {
        List<String> fileList = getList();
        inputRecord(fileList);
    }

    private void inputRecord(List<String> fileList) {
        int recordSize = getRecordSize(fileList);
        RecordService recordService = getRecordService();
        getRecordStartRawCal(fileList);
        fileList.remove(0);

        for (int i = 0; i < recordSize; i++) {
            //input suduent ,score
            String[] splits = fileList.get(i).split(" ");
            String[] list1 = {splits[0], splits[1], splits[2]};
            String[] list2 = removeSplits(splits, 2);
            Student student = new Student(list1,new Score(list2));
        }
    }

    private void getRecordStartRawCal(List<String> fileList) {
        String[] split = fileList.subList(0, 1).get(0).split(" ");
        String[] list1 = {split[0], split[1], split[2]};
        String[] list2 = removeSplits(split, 2);
        Student student = new Student(list1, new Score(list2));
        Subject subject = new Subject(list2);
    }


    private List<String> getList() {
        FileReader reader = new FileReader();
        List<String> fileList = reader.recordReader();
        return fileList;
    }

    private RecordService getRecordService() {
        Record record = new Record();
        RecordService recordService = record.recordService();
        return recordService;
    }

    private String[] removeSplits(String[] arr, int indx) {
        List<String> result = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i <= indx; i++) {
            result.remove(0);
        }
        return result.toArray(new String[0]);
    }

    private int getRecordSize(List<String> fileList) {
        int recordSize = 0;
        for (String s : fileList) {
            recordSize++;
        }
        return recordSize;
    }
}
