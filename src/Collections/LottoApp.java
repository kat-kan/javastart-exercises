package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoApp {

    public static void main(String[] args) {

        ArrayList<Integer> numbersFromUser = getNumbersFromUser();
        Lotto lotto = new Lotto();

        lotto.checkResult(numbersFromUser);
        printNumbersFromUser(numbersFromUser);
        lotto.printResult();
        lotto.printHitsNumber(numbersFromUser);

    }

    private static void printNumbersFromUser(ArrayList<Integer> numbers){
        System.out.println("Liczby skreślone przez użytkownika");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    private static ArrayList<Integer> getNumbersFromUser(){
        ArrayList<Integer> numbersFromUser = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Lotto.NUMBERS_GENERATED; i++) {
            System.out.println("Podaj liczbę nr " + (i + 1));
            numbersFromUser.add(scanner.nextInt());
        }
        return numbersFromUser;
    }
}
