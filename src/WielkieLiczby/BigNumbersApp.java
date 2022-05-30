package WielkieLiczby;

import java.io.*;
import java.math.BigInteger;

public class BigNumbersApp {
    public static final String FILE_NAME = "numbers.txt";
    public static final int ASSUMED_MAX_LENGTH_OF_SMALL_NUMBERS = 6;
    static BigInteger bigNumbersSum = BigInteger.ZERO;
    static int smallNumbersSum = 0;

    public static void main(String[] args) {

        File file = new File(FILE_NAME);
        readFileAndSumNumbers(file);
        printResult(smallNumbersSum);
        printResult(bigNumbersSum);

    }

    private static void readFileAndSumNumbers(File file) {
        try (
                FileReader reader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(reader)
        ) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() > ASSUMED_MAX_LENGTH_OF_SMALL_NUMBERS) {
                    BigInteger number = new BigInteger(line);
                    bigNumbersSum = bigNumbersSum.add(number);
                } else {
                    smallNumbersSum += Integer.parseInt(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku o danej nazwie");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Wystąpił błąd odczytu z pliku");
            e.printStackTrace();
        }
    }

    private static void printResult(BigInteger bigInteger) {
        System.out.println("Suma wielkich liczb to : " + bigInteger);
    }

    private static void printResult(int smallNumber) {
        System.out.println("Suma liczb typu integer to : " + smallNumber);
    }
}
