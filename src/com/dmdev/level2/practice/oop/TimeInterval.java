package com.dmdev.level2.practice.oop;

public class TimeInterval {

    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int totalS) {
        this.hours = totalS / 3600;
        this.minutes = totalS % 3600 / 60;
        this.seconds = totalS % 3600 % 60;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int totalSeconds() {
        return seconds + minutes * 60 + hours * 3600;
    }

    public int totalSec(int seconds, int minutes, int hours) {
        return seconds + minutes * 60 + hours * 3600;
    }

    public TimeInterval sum(TimeInterval second){
        return new TimeInterval(this.totalSeconds() + second.totalSeconds());
    }
    public void print() {
        System.out.println("seconds=" + seconds + ", minutes=" + minutes + ", hours=" + hours);

    }
}
