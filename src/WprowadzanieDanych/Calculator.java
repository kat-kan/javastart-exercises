package WprowadzanieDanych;

public class Calculator {

    public double calculate(double a, double b, String operator){
        final String plus = "+";
        final String minus = "-";
        final String multiply = "*";
        final String divide = "/";
        switch (operator){
            case (plus):
                return a + b;
            case (minus):
                return a - b;
            case (multiply):
                return a * b;
            case (divide):
                return a/b;
                default:
                    System.out.println("Nie rozpoznano operatora");
                    return 0.0;
        }
    }


}
