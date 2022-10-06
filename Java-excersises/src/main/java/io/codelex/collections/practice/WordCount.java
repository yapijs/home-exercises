package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> text = Files.readAllLines(path, charset);
        int totalChars = 0;
        int totalWords = 0;
        int totalLines = text.size();
        for (String line: text) {
            totalWords += line.split("\\s+").length;
            totalChars += line.length();
        }

        System.out.println("Lines = " + totalLines);
        System.out.println("Words = " + totalWords);
        System.out.println("Chars = " + totalChars);


    }
}
