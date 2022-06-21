package Algorytmika1;

import java.util.Scanner;

public class Algorytmika1 {
/*    Napisz program, który będzie wczytywał od użytkownika kolejne liczby całkowite. Wczytywanie liczb powinno zakończyć się w momencie,
gdy użytkownik poda liczbę większą od 100.  Jeżeli suma wszystkich wprowadzonych liczb mniejszych bądź równych 100 jest liczbą parzystą,
to wyświetl komunikat "parzysta", a jeżeli nie to "nieparzysta".
1/ utworzenie licznika sumy
2. wczytywanie liczb i walidacja czy nie wieksza od 100
3. komunikat odpowiedni so sytuacji*/

    public static void main(String[] args) {
        int sum = getSum();
        System.out.println(isEven(sum));
    }

    static int getSum(){
        int sum = 0;
        int number;
        while ((isLessOrEqualParam(number = getIntFromUser(), 100))){
            sum +=number;
        }
        return sum;
    }

    static int getIntFromUser(){
        Scanner scanner = new Scanner(System.in);
        int numberFromUser = scanner.nextInt();
        return numberFromUser;
    }

    static boolean isLessOrEqualParam(int number, int param){
        return number <= param;
    }

    static String isEven(int number){
        if ((number%2 == 0)){
            return "Parzysta";
        }
        else {
            return "Nieparzysta";
        }
    }

}


