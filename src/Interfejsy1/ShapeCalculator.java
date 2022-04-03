package Interfejsy1;

import Interfejsy1.io.ConsolePrinter;
import Interfejsy1.io.DataReader;

import java.util.Scanner;

class ShapeCalculator {
    public static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();
        DataReader reader = new DataReader();
        Scanner scanner = new Scanner(System.in);
        printer.printText("Wybierz figurę. 1 - koło, 2 - prostokąt, 3 - trójkąt");
        int chosenOption = scanner.nextInt();


        Shape circle = new Circle(5);
        Shape rect = new Rectangle(5, 10);
        Shape tri = new Triangle(5, 10, 5, 6);

        printer.printText("Pole koła: " + circle.calculateArea());
        printer.printText("Obwód prostokąta: " + rect.calculatePerimeter());
        printer.printText("Pole trójkąta " + tri.calculateArea());
    }
}
