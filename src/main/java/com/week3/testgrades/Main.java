package com.week3.testgrades;

import com.week3.testgrades.writer.ReportWriter;
import com.week3.testgrades.writer.Writer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Writer writer = new ReportWriter();
        writer.writer();
    }
}
