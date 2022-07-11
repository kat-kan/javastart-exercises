package TextBlocks;

import java.util.Random;

public class Dice {
    static final String one = """
            _______________
            |             |
            |             |
            |      O      |
            |             |
            |             |
            _______________
            """;

    static final String two = """
            _______________
            |             |
            |        O    |
            |             |
            |   O         |
            |             |
            _______________
            """;

    static final String three = """
            _______________
            |             |
            |        O    |
            |      O      |
            |   O         |
            |             |
            _______________
            """;

    static final String four = """
            _______________
            |             |
            |   O     O   |
            |             |
            |   O     O   |
            |             |
            _______________
            """;

    static final String five = """
            _______________
            |             |
            |   O     O   |
            |      O      |
            |   O     O   |
            |             |
            _______________
            """;

    static final String six = """
            _______________
            |             |
            |   O    O    |
            |   O    O    |
            |   O    O    |
            |             |
            _______________
            """;

    Random random = new Random();

    void printDiceResult(String number) {
        System.out.println(number);
    }

    String rollDice() {
        int minNumber = 1;
        int maxNumber = 6;

        int number = random.nextInt(maxNumber) + minNumber;
        return switch (number) {
            case 1 -> one;
            case 2 -> two;
            case 3 -> three;
            case 4 -> four;
            case 5 -> five;
            case 6 -> six;
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }
}
