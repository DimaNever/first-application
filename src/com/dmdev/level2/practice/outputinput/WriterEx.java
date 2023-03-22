package com.dmdev.level2.practice.outputinput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class WriterEx {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "writer.poem").toFile();
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
            fileWriter.append("Hello WWW!");
            fileWriter.newLine();
            fileWriter.append("Java");
        }
    }
}
