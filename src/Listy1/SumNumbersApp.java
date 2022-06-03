package Listy1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbersApp {
    public static final String STOP_TEXT = "exit";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list = readNumbersFromUserAndAddToListv2();
        printAndSumNumber(list);
    }

    private static void readNumbersFromUserAndAddToList(List<Integer> integerList) {
        //first version of recursion method
        String input = scanner.nextLine();
        boolean isExit = input.equals(STOP_TEXT);
        Integer numberFromUserConverted;
        if (isExit) {
            return;
        } else {
            try {
                numberFromUserConverted = Integer.parseInt(input);
                integerList.add(numberFromUserConverted);
                readNumbersFromUserAndAddToList(integerList);
            } catch (NumberFormatException e) {
                System.err.println("Wprowadzono ciąg znaków, który nie jest liczbą");
                e.printStackTrace();
            }
        }
    }

    private static List<Integer> readNumbersFromUserAndAddToListv2() {
        //second version of recursion method
        String input = scanner.nextLine();
        boolean isExit = input.equals(STOP_TEXT);
        Integer numberFromUserConverted;
        List<Integer> list = new ArrayList<>();
        if (!isExit) {
            try {
                numberFromUserConverted = Integer.parseInt(input);
                list.add(numberFromUserConverted);
                list.addAll(readNumbersFromUserAndAddToListv2());
            } catch (NumberFormatException e) {
                System.err.println("Wprowadzono ciąg znaków, który nie jest liczbą");
                e.printStackTrace();
            }
        }
        return list;
    }

    private static void printAndSumNumber(List<Integer> integerList) {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (i == integerList.size() - 1) {
                printText(integerList.get(i) + " = ");
            } else {
                printText(integerList.get(i) + " + ");
            }
            sum += integerList.get(i);
        }
        printText(sum);
    }

    private static void printText(Object text) {
        System.out.print(text);
    }
}
