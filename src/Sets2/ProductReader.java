package Sets2;

import java.util.HashSet;
import java.util.Scanner;

public class ProductReader {
    static final int ENTER_PRODUCT = 0;
    static final int EXIT = 1;
    static final int OVERWRITE = 0;
    static final int IGNORE = 1;
    static HashSet<Product> products;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        products = new HashSet<>();
        int option;
        do {
            System.out.println("Wybierz 0 - dodanie produktu lub 1 - wyjście z programu");
            option = scanner.nextInt();
            switch (option) {
                case (ENTER_PRODUCT):
                    scanner.nextLine();
                    Product product = createProductFromUserInput(scanner);
                    if (products.contains(product)) {
                        overwriteOrIgnore(product);
                    } else {
                        products.add(product);
                    }
                    break;
                case (EXIT):
                    break;
            }
        }
        while (option != EXIT);

        for (Product product :
                products) {
            System.out.println(product);
        }
    }

    private static void overwriteOrIgnore(Product product) {
        System.out.println("Produkt o podanej nazwie już istnieje, wybierz 0 - nadpisanie produktu, 1 - zignorowanie nowego produktu");
        int option = scanner.nextInt();
        switch (option) {
            case (OVERWRITE):
                products.remove(product);
                products.add(product);
                break;
            case (IGNORE):
                break;
        }
    }

    static Product createProductFromUserInput(Scanner scanner) {
        System.out.println("Podaj nazwe");
        String name = scanner.nextLine();
        System.out.println("Podaj cenę");
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(name, price);
    }
}
