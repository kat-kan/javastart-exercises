package Algorytmika2;

import java.util.Scanner;

public class Algorytmika2 {

    public static void main(String[] args) {
        int multi = multiplyFiveNumbersFromUser();
        System.out.println(isNegativeOrPositive(multi));

    }

    static int multiplyFiveNumbersFromUser() {
        int multi = 1;
        int next = 0;

        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 5; index++) {
            next = scanner.nextInt();
            multi *= next;
        }

        scanner.close();
        return multi;
    }

    static String isNegativeOrPositive(int number) {
        String negOrPos;
        if (number >= 0) {
            negOrPos = "Nieujemna";
        } else {
            negOrPos = "Ujemna";
        }

        return negOrPos;
    }
}
