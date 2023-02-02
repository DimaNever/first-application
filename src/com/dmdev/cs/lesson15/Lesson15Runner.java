package com.dmdev.cs.lesson15;

public class Lesson15Runner {
    public static void main(String[] args) {
        var month = 121;
        var result = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4,  5 -> "Spring";
            default -> "Month is invalid";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";

        };
        System.out.println(result);
    }
}
