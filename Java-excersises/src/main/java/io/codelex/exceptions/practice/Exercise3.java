package io.codelex.exceptions.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Exercise3 {
    public static void cat(File file) throws IOException {

        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
