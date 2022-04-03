package WprowadzanieDanych;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę:");
        double first = scanner.nextDouble();
        System.out.println("Wprowadź drugą liczbę:");
        double second = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Wprowadź operator");
        String operator = scanner.nextLine();


        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(first, second, operator));
        scanner.close();


    }
}
