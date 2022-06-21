package Petle1;

import java.util.Scanner;

public class Petle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ile liczb chcesz zsumować: ");
        int numbers = sc.nextInt();

        int sum = 0;
        while (numbers-- > 0) {
            System.out.println("Podaj kolejną liczbę: ");
            sum = sum + sc.nextInt();
        }

        System.out.println("Suma wszystkich podanych liczb to: " + sum);
        sc.close();
    }
}
