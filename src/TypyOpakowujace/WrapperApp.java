package TypyOpakowujace;

import java.util.Scanner;

public class WrapperApp {

    static int digitsNumber;
    static int lettersNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        Character[] characters = getCharacterArrayFromString(sentence);

        digitsNumber = countDigits(characters);
        lettersNumber = countLetters(characters);
        getMaxNumber(characters);

    }

    public static Character[] getCharacterArrayFromString(String sentence) {
        char[] splitSentence = sentence.toCharArray();
        Character[] characters = new Character[splitSentence.length];

        for (int i = 0; i < splitSentence.length; i++) {
            characters[i] = splitSentence[i];
        }
        return characters;
    }

    public static int countDigits(Character[] characters) {
        int counter = 0;
        for (Character character : characters) {
            if (Character.isDigit(character)) {
                counter++;

            }
        }
        if (counter == 0) {
            throw new DigitsNotFoundException("Brak cyfr we wprowadzonym tekście");
        } else {
            System.out.println("W zdaniu wystąpiła następująca liczba cyfr : " + counter);
        }

        return counter;
    }

    public static int countLetters(Character[] characters) {
        int counter = 0;
        for (Character character : characters) {
            if (Character.isLetter(character)) {
                counter++;

            }
        }
        System.out.println("W zdaniu wystąpiła następująca liczba liter : " + counter);
        return counter;
    }

    public static void getMaxNumber(Character[] characters) {
        if (digitsNumber == 0) {
            throw new DigitsNotFoundException("Brak cyfr we wprowadzonym tekście");
        } else {
            Integer[] numbers = new Integer[digitsNumber];
            int counter = 0;
            for (Character character : characters) {
                if (Character.isDigit(character)) {
                    numbers[counter] = Character.getNumericValue(character);
                    counter++;
                }
            }
            Integer biggestNumber = numbers[0];
            for (Integer number : numbers) {
                if (number > biggestNumber) {
                    biggestNumber = number;
                }
            }
            System.out.println("Największa cyfra występująca w zdaniu to : " + biggestNumber);
        }

    }

    private static class DigitsNotFoundException extends RuntimeException {
        public DigitsNotFoundException(String message) {
            super(message);
        }
    }
}
