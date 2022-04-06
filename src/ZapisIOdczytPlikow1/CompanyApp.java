package ZapisIOdczytPlikow1;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

import static ZapisIOdczytPlikow1.Company.NUMBER_OF_EMPLOYEES;

public class CompanyApp {
    private static final int GET_FROM_USER = 1;
    private static final int GET_FROM_FILE = 2;
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private static final String filename = "pracownicy.info";

    public static void main(String[] args) {

        System.out.println("Wybierz opcję: " + GET_FROM_USER + " - wpiszesz dane samodzielnie " + GET_FROM_FILE + "- wczytasz dane z pliku");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case GET_FROM_USER -> {
                Company company = createCompany();
                writeToFile(company);
            }
            case GET_FROM_FILE -> {
                Company company = readFromFile();
                System.out.println(company.getEmployees()[0].getName());
            }
        }
        scanner.close();


    }

    private static Company createCompany() {
        Company company = new Company();
        for (int i = 0; i < NUMBER_OF_EMPLOYEES; i++) {
            System.out.println("Podaj imię, nazwisko i pensję pracownika");
            String name = scanner.nextLine();
            String surname = scanner.nextLine();
            double salary = scanner.nextDouble();
            scanner.nextLine();
            Employee employee = new Employee(name, surname, salary);
            company.addEmployee(employee);
        }
        return company;
    }

    private static void writeToFile(Company company) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filename);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(company);
            System.out.println("Zapisano obiekt do pliku");
        } catch (IOException e) {
            System.err.println("Zapis obiektu się nie powiódł");
            e.printStackTrace();
        }
    }

    private static Company readFromFile() {
        Company company = null;
        try (
                FileInputStream fileInputStream = new FileInputStream(filename);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            company = (Company) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Odczyt obiektu się nie powiódł");
            e.printStackTrace();
        }
        return company;
    }

}
