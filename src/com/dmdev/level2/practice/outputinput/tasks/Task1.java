package com.dmdev.level2.practice.outputinput.tasks;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task1 {

    public static final String VOWELS = "ёуеыаоэяию";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()){
                String word = scanner.next();
                char firstChar = word.charAt(0);
                if (VOWELS.indexOf(firstChar) != -1){
                    System.out.println(word);
                }
            }
        }
    }
}
