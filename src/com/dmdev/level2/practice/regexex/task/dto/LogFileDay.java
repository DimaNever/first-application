package com.dmdev.level2.practice.regexex.task.dto;

import java.util.ArrayList;
import java.util.List;

public class LogFileDay {
    private final List<LogFileRow> rows = new ArrayList<>();

    public void add(LogFileRow row) { //почему мы добавляем в поле final и почему это вообще работает?
        rows.add(row);
    }

    public List<LogFileRow> getRows() {
        return rows;
    }


}
