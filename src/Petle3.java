import java.util.Scanner;

public class Petle3 {
    public static void main(String[] args) {
        double stepOfRegulation = 0.5;
        double actual = getActualTemperature();
        double expected = getExpectedTemperature();
        regulateTemperature(actual, expected,stepOfRegulation);
    }

    static double getActualTemperature(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj aktualną temperaturę");
        double actual = scanner.nextInt();
        //scanner.close();
        return actual;
    }

    static double getExpectedTemperature(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj docelową temperaturę");
        double expected = scanner.nextInt();
        scanner.close();
        return expected;
    }

    static void regulateTemperature(double actualTemperature, double expectedTemperature, double stepOfRegulation){
        while (actualTemperature!=expectedTemperature){
            if (actualTemperature < expectedTemperature){
                actualTemperature += stepOfRegulation;
                printState(actualTemperature, expectedTemperature);
            }
            else if (actualTemperature > expectedTemperature){
                actualTemperature -= stepOfRegulation;
                printState(actualTemperature, expectedTemperature);
            }
        }

    }

    static void printState(double actualTemperature, double expectedTemperature){
        if (actualTemperature == expectedTemperature){
            System.out.println("Osiągnięto optymalną temperaturę " + actualTemperature);
        }
        else {
            System.out.println("Aktualna temperatura " + actualTemperature);
        }
    }
}
