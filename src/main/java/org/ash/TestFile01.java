package org.ash;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestFile01 {
    public static void main(String[] args) {
        File stud = new File("D:\\IDEAProj\\spring-batch-intro\\students.csv");
        System.out.println(stud.getAbsolutePath());
        System.out.println("File with students: " + stud.exists());

    }
}
