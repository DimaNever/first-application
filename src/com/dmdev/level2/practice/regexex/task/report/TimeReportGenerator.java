package com.dmdev.level2.practice.regexex.task.report;

import com.dmdev.level2.practice.regexex.task.dto.LogFileDay;
import com.dmdev.level2.practice.regexex.task.util.ActivityUtils;
import com.dmdev.level2.practice.regexex.task.util.StringUtils;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class TimeReportGenerator implements ReportGenerator {

    @Override
    public String generate(List<LogFileDay> logFileDays) {
        return logFileDays.stream()
                .map(this::convertDay)
                .collect(joining(System.lineSeparator()));
    }

    private String convertDay(LogFileDay logFileDay) {
        var result = new StringBuilder();
        ActivityUtils.consumeActivityDuration(logFileDay, (currentActivity, nextActivity) ->
                result.append(currentActivity.getTime().toString())
                        .append(StringUtils.DASH)
                        .append(nextActivity.getTime().toString())
                        .append(StringUtils.SPACE)
                        .append(currentActivity.getActivityName())
                        .append(System.lineSeparator()));

        return result.toString();
    }
}