package com.week3.testgrades.reader;

import java.io.IOException;
import java.util.List;

public interface Reader {
    List<String> reader() throws IOException;
}
