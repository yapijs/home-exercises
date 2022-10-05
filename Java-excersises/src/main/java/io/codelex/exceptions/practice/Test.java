package io.codelex.exceptions.practice;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Exercise3.cat(new File("somefile.txt"));

        System.out.println("====================");

        Exercise4.main(new String[]{"a-4"});
    }
}
