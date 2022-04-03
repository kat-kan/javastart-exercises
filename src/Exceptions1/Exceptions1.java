package Exceptions1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) throws UnknownOperatorException {
        Scanner scanner = new Scanner(System.in);
        double a = getInputDouble();
        double b = getInputDouble();
        String operator = scanner.nextLine();
        scanner.close();
        System.out.println(calculate(a, b, operator));

    }

    public static double getInputDouble(){
        Scanner scanner = new Scanner(System.in);
        boolean error = true;
        double a = 0.0;
        do {
            try {
                a = scanner.nextDouble();
                error = false;
            } catch (InputMismatchException e){
                System.out.println("Podałeś liczbę w nieprawidłowym formacie, spróbuj ponownie");
               // e.printStackTrace();
                scanner.nextLine();
            }
        } while (error);
            return a;
        }

    public static double calculate(double a, double b, String operator) throws UnknownOperatorException {
        final String PLUS = "+";
        final String MINUS = "-";
        final String MULTIPLY = "*";
        final String DIVIDE = "/";
        double result = switch (operator) {
            case (PLUS) -> add(a, b);
            case (MINUS) -> substract(a, b);
            case (MULTIPLY) -> multiply(a, b);
            case (DIVIDE) -> divide(a, b);
            default -> throw new UnknownOperatorException("Nie rozpoznano operatora");
        };
        return result;
    }

    static double add(double a, double b){
        return a+b;
    }

    static double substract(double a, double b){
        return a-b;
    }

    static double multiply(double a, double b) {
        return a*b;
    }

    static double divide(double a, double b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("nie dziel przez zero, cholero!");
        }
        else {
            return a/b;
        }
    }
}
