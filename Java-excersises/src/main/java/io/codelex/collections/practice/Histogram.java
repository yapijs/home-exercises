package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        System.out.println(scores);
        String[] scoresArray = scores.split(" ");
        String[] histogram = new String[11];
        Arrays.fill(histogram, "");
        for (int i = 0; i < scoresArray.length; i++) {
            int intValue = Integer.parseInt(scoresArray[i]);
            int groupId = intValue / 10;
            histogram[groupId] += "*";
        }
        printResults(histogram);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static void printResults(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(generateGroupName(i) + array[i]);
        }
    }


    private static String generateGroupName(int i) {
        if (i == 10 ) {
            return "  " + i + "0: ";
        } else {
            return i + "0-" + i + "9: ";
        }
    }
}
