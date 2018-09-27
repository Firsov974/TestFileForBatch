package org.ash;

import java.io.*;

public class CopyFileSample {
    public static void copy(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            int b;
            while((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        File source = new File("D:\\IDEAProj\\spring-batch-intro\\students.csv");
        File destination = new File("D:\\IDEAProj\\spring-batch-intro\\studCopy.csv");
        copy(source,destination);
    }
}