package com.dmdev.level2.practice.oop;

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        TimeInterval timeInterval2 = new TimeInterval(160, 2, 0);
        System.out.println(timeInterval.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());
        System.out.println(timeInterval.totalSec(60, 2, 0));
        System.out.println();

        TimeInterval timeInterval20 = new TimeInterval(timeInterval.totalSeconds());
        timeInterval20.print();

        System.out.println(timeInterval20.totalSeconds());

        TimeInterval sumIntervals = timeInterval.sum(timeInterval20);
        sumIntervals.print();

    }


}
