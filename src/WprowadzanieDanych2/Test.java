package WprowadzanieDanych2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź 1 dla orła i 0 dla reszki");
        int chosenNumber = scanner.nextInt();
        Generator generator = new Generator();
        generator.generate(chosenNumber);
    }
}
