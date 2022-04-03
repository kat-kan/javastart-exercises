package Interfejsy1.io;

import Interfejsy1.Circle;
import Interfejsy1.Triangle;
import Interfejsy1.Rectangle;

import java.awt.*;
import java.util.Scanner;

public class DataReader {
    Scanner scanner = new Scanner(System.in);

    private Rectangle readRectangleData() {
        System.out.println("Podaj informacje o prostokącie.");
        System.out.println("Podaj długość boku A:");
        double a = scanner.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = scanner.nextDouble();

        return new Rectangle(a, b);
    }

    private Circle readCircleData() {
        System.out.println("Podaj informacje o kole.");
        System.out.println("Podaj długość promienia:");
        double r = scanner.nextDouble();

        return new Circle(r);
    }

    private Triangle readTriangleData() {
        System.out.println("Podaj informacje o trójkat.");
        System.out.println("Podaj długość boku A:");
        double a = scanner.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = scanner.nextDouble();
        System.out.println("Podaj długość boku C:");
        double c = scanner.nextDouble();
        System.out.println("Podaj wysokość:");
        double h = scanner.nextDouble();

        return new Triangle(a, b, c, h);
    }
//nie działa...nie czaję tego z enumem, no nie czaje
/*    public Shape createShape() {
        int shapeType = sc.nextInt();
        switch (shapeType) {
            case Shape.Type.CIRCLE.:
                return readRectangleData();
            case Shape.CIRCLE:
                return readCircleData();
            case Shape.TRIANGLE:
                return readTriangleData();
            default:
                throw new NoSuchElementException();
        }
    }*/

    private void printOptions(){
        ConsolePrinter printer = new ConsolePrinter();
        printer.printText("Wybierz opcję do obliczeń pola i\'lub obwodu:");
        printer.printText("1 - koło, 2 - prostokąt, 3 - trójkąt");
    }


}
