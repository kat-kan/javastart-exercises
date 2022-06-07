package Maps1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {
    public static final int ADD_NEW_EMPLOYEE = 0;
    public static final int FIND_EMPLOYEE = 1;
    public static final int EXIT = 2;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Company company = new Company();
        controlLoop(scanner, company);

    }

    private static void controlLoop(Scanner scanner, Company company) {
        int option;
        do {
            printOptions();
            option = getOptionFromUser(scanner);
            switch (option) {
                case (ADD_NEW_EMPLOYEE):
                    createEmployeeFromInput(scanner, company);
                    break;
                case (FIND_EMPLOYEE):
                    findEmployeeBasedOnInput(scanner, company);
                    break;
                case (EXIT):
                    break;
                default:
                    System.out.println("Wprowadzono niedozwoloną opcję, spróbuj ponownie");

            }

        } while (option != EXIT);
    }

    private static void findEmployeeBasedOnInput(Scanner scanner, Company company) {
        String searchedName = getNameFromUser(scanner);
        String searchedSurname = getSurnameFromUser(scanner);
        System.out.println(company.findEmployee(searchedName, searchedSurname));
    }

    private static void createEmployeeFromInput(Scanner scanner, Company company) {
        String name = getNameFromUser(scanner);
        String surname = getSurnameFromUser(scanner);
        double salary = getSalaryFromUser(scanner);
        company.addEmployee(new Employee(name, surname, salary));
    }

    private static void printOptions() {
        System.out.println("Wybierz opcję : ");
        System.out.println(ADD_NEW_EMPLOYEE + " - Dodanie nowego pracownika");
        System.out.println(FIND_EMPLOYEE + " - Wyszukanie pracownika na podstawie imienia i nazwiska");
        System.out.println(EXIT + " - Wyjście z programu");
    }

    private static int getOptionFromUser(Scanner scanner) {
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static String getNameFromUser(Scanner scanner) {
        System.out.println("Wprowadź imię pracownika");
        return scanner.nextLine();
    }

    private static String getSurnameFromUser(Scanner scanner) {
        System.out.println("Wprowadź nazwisko pracownika");
        return scanner.nextLine();
    }

    private static double getSalaryFromUser(Scanner scanner) {
        System.out.println("Wprowadź pensję pracownika");
        double salary = 0.0;
        try {
            salary = Double.parseDouble(scanner.nextLine());
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return salary;
    }

}
