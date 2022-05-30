package Arrays2;

import java.util.Scanner;

public class TestStringsChecker {

    /**
     Zdefiniuj metodę, która przyjmuje dwa napisy i zwraca true, jeżeli oba napisy składają się dokładnie z takich samych liter lub false, jeżeli chociaż jedna litera się różni. Wielkość liter nie ma znaczenia, tzn. literę 'a', traktujemy tak samo jak 'A'.

     Przykładowo dla napisów "abcDEF" i "aDbECF" otrzymamy true, a dla "abcDEF" i "ABCxyz" otrzymamy false.

     Przy porównywaniu zadbaj o odpowiednią obsługę wartości null. Porównanie ze sobą dwóch wartości null powinno zwrócić wartość true, porównanie dowolnego napisu, np. "abc" i wartości null powinno zwrócić false.

     Dodaj logikę pozwalającą użytkownikowi wprowadzić dwa napisy z klawiatury i przetestuj działanie dla kilku różnych napisów.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        StringsChecker stringsChecker = new StringsChecker();
        boolean result = stringsChecker.compareStrings(firstInput, secondInput);
        printResult(result);
    }

    public static void printResult(boolean resultOfComparingStrings){
        if (resultOfComparingStrings) {
            System.out.println("Podane napisy są takie same");
        }
        else {
            System.out.println("Podane napisy różnią się");
        }
    }

}
