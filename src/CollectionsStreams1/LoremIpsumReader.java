package CollectionsStreams1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoremIpsumReader {
    static String fileName = "resources/loremipsum-129.txt";

    public static void main(String[] args) {
        List<String> loremIpsum = readWordsListFromFile();
        List<String> withoutDotsAndCommas = loremIpsum.stream()
                .map(c -> c.replace(",", ""))
                .map(c -> c.replace(".", ""))
                .filter(c -> !c.isEmpty())
                .toList();

        long sWords = withoutDotsAndCommas.stream()
                .filter(c -> c.charAt(0) == 's')
                .count();

        System.out.println("Wyrazy z s na początku  " + sWords);

        long _5_letterWords = withoutDotsAndCommas.stream()
                .filter(c -> c.length() == 5)
                .count();

        System.out.println("Wyrazy 5 literowe " + _5_letterWords);
    }

    private static List<String> readWordsListFromFile() {
        List<String> loremIpsum = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            loremIpsum = bufferedReader.lines()
                    .map(c -> c.split(" "))
                    .flatMap(Stream::of)
                    .collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Nie znaleziono pliku");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Błąd odczytu pliku");
        }
        return loremIpsum;
    }
}
