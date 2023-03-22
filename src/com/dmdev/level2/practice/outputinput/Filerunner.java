package com.dmdev.level2.practice.outputinput;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Filerunner {

    public static void main(String[] args) throws IOException {
        File file = new File("resources/test.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println("-------------------------------");
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println("-------------------------------");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        System.out.println("-------------------------------");

        File dir = new File("resources/test/dir");
        dir.mkdirs();
        System.out.println(Arrays.toString(dir.list()));


    }
}
