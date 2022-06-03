package Listy2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAndAverageNumbersApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list = readNumbersFromUserAndAddToListv2();
        printSize(list);
        calculateSumAndAvg(list);

    }

    private static List<Integer> readNumbersFromUserAndAddToListv2() {
        int numberFromUser = -1;
        try {
            numberFromUser = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Wprowadzono ciąg znaków, który nie jest liczbą");
            e.printStackTrace();
        }
        List<Integer> list = new ArrayList<>();
        if (numberFromUser >= 0 && (numberFromUser % 5 == 0)) {
            list.add(numberFromUser);
            list.addAll(readNumbersFromUserAndAddToListv2());
        }
        return list;
    }

    private static void printSize(List<Integer> list){
        printText(list.size());
    }

    private static void calculateSumAndAvg(List<Integer> list){
        double sum = 0.0;
        double avg;
        for (int number:
             list) {
            sum += number;
        }
        avg = sum/ list.size();
        printText("Suma liczb z listy wynosi : " + sum);
        printText("średnia liczb z listy wynosi : " + avg);
    }

    private static void printText(Object text){
        System.out.println(text);
    }
}
