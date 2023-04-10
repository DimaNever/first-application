package com.dmdev.level2.practice.regexex.task;

import com.dmdev.level2.practice.regexex.task.parser.LogFileParser;
import com.dmdev.level2.practice.regexex.task.report.StatisticReportGenerator;
import com.dmdev.level2.practice.regexex.task.report.TimeReportGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

public class LessonRunner {

    public static void main(String[] args) throws IOException {
        var logFilePath = Path.of("resources/regex", "homework.log");
        var logFileParser = new LogFileParser();
        var logFileDays = logFileParser.parse(logFilePath);

        var timeReportGenerator = new TimeReportGenerator();
        var timeReport = timeReportGenerator.generate(logFileDays);
        Files.writeString(Path.of("resources/regex", "time-report.txt"), timeReport, CREATE, TRUNCATE_EXISTING);

        var statisticReportGenerator = new StatisticReportGenerator();
        var statisticReport = statisticReportGenerator.generate(logFileDays);
        Files.writeString(Path.of("resources/regex", "statistic-report.txt"), statisticReport, CREATE, TRUNCATE_EXISTING);
    }
}