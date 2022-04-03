package Enum1;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("dostępne pizze");
        for (Pizza pizza: Pizza.values()
             ) {
            System.out.println(pizza.name() + " " + pizza + " numer do wyboru " + pizza.ordinal());
        }
        System.out.println("wybierz numer pizzy");
        Scanner scanner = new Scanner(System.in);
        int numberOfPizza = scanner.nextInt();
        Pizza chosenPizza = Pizza.fromOrdinal(numberOfPizza);
        System.out.println("wybrana pizza to " + chosenPizza.name() + " " + chosenPizza);
    }
}
