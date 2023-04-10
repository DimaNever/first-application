package com.dmdev.level2.practice.regexex.task.report;

import com.dmdev.level2.practice.regexex.task.dto.LogFileDay;

import java.util.List;

public interface ReportGenerator {

    String generate(List<LogFileDay> logFileDays);
}
