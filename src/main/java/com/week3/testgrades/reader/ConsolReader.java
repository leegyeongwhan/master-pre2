package com.week3.testgrades.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsolReader implements Reader {

    @Override
    public List<String> reader() {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add(scanner.nextLine());
        return list;
    }
}
