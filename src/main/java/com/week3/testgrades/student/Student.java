package com.week3.testgrades.student;

public class Student {
    private String name;
    private String hakbun;
    // private static int hakbun = 1000;
    //private final int HAK_BUN;
    private String major;

    public Student(String[] studentList) {
        this.name = studentList[0];
        //    HAK_BUN = hakbun++;
        this.hakbun = studentList[1];
        this.major = studentList[2];
    }

    public String getName() {
        return name;
    }

    public String getHakbun() {
        return hakbun;
    }

    public String getMajor() {
        return major;
    }
}
