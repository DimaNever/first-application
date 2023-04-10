package com.dmdev.level2.practice.regexex.patternex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindEx {
    public static void main(String[] args) {
        String phoneNumber = "adasdadssd +375 (33) 898-33-13 sddsdd sadd +375 (44) 777-12-13 sdadasd " +
                "fghfh +375 (29) 657-13-29 dg f +375 (25) 111-11-11 dfsg f sdsd sd d f";
        String regex = "(?:\\+375)? ?\\((?<code>\\d{2})\\) ?(\\d{3})-(\\d{2})-(\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()){
           matcher.appendReplacement(stringBuilder, "$2 - $3 - $4");
        }
        matcher.appendTail(stringBuilder);

        System.out.println(stringBuilder);

        System.out.println(phoneNumber.replaceAll(regex, "|$2++$3++$4|"));

    }
}
