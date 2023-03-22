package com.dmdev.level2.practice.outputinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamEx {

    public static void main(String[] args) throws IOException {
        // File file = new File(String.join(File.separator,"resources", "test.txt"));
        File file = Path.of("resources", "test.txt").toFile();

        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }
            String strVal = new String(bytes);
            System.out.println(strVal);
        }
        System.out.println("--------------------------------------------------------------");

        File fileT = Path.of("resources", "ttt.txt").toFile();
        try (FileInputStream tttStream = new FileInputStream(fileT)) {
            byte[] bbb = new byte[(int) fileT.length()];
            for (int i = 0; i < fileT.length(); i++) {
                bbb[i] = (byte) tttStream.read();
            }
            String s = new String(bbb);
            System.out.println(s);
        }
    }
}
