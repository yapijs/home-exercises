package io.other.java_advanced_test.exercise4;

/*## Exercise #4
#### (File I/O)
Write a program that will read any file and save it in the same folder. The content and title of the new file should be reversed (from the back).
(you can freely choose folder and file to test functionality)*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIOApp {
    private static String PATH_TO_APP = "E:\\Dāvis\\Documents\\Code\\";
    private static String FILE_NAME = "myFile.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(PATH_TO_APP + FILE_NAME));
        String cleanFileName = FILE_NAME.substring(0, FILE_NAME.indexOf('.'));
        StringBuilder reversedName = new StringBuilder(cleanFileName).reverse().append(".txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH_TO_APP + reversedName));

        String line;
        List<StringBuilder> text = new ArrayList<>();
        while ((line = in.readLine()) != null) {
            text.add(new StringBuilder(line + "\n"));
        }
        for (int i = text.size()-1; i >= 0 ;i--) {
            out.write(text.get(i).reverse().toString());
        }
        in.close();
        out.close();
    }
}
