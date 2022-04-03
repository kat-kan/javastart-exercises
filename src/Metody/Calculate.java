package Metody;

public class Calculate {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double firstNumber = 8.0;
        double secondNumber = 4.0;

        System.out.println(calculator.add(firstNumber, secondNumber));
        System.out.println(calculator.substract(firstNumber, secondNumber));
        System.out.println(calculator.multiply(firstNumber, secondNumber));
        System.out.println(calculator.divide(firstNumber, secondNumber));
    }
}
