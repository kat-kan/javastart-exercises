package ZapisIOdczytPlikow2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CustomerApp {
    private static final String fileName = "clients.csv";
    private static final Scanner consoleScanner = new Scanner(System.in);
    private static final List<Customer> customers = new ArrayList<>();
    private static double orderValue;
    private static int indexOfMaxOrder = 0;
    private static double maxOrder = 0;

    public static void main(String[] args) {

        readCsvFileAndSaveCustomers();
        printMostValueableCustomer();
        printCustomersByChosenCountry();
    }

    public static void readCsvFileAndSaveCustomers() {
        try (
                FileReader reader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(reader)) {
            bufferedReader.readLine(); //odczytuje nagłówek
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] customerData = line.split(",");
                Customer customer = createCustomerFromCsvLine(customerData);
                customers.add(customer);
                checkMaxOrder(orderValue, customer);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas odczytu");
            e.printStackTrace();
        }
    }

    private static Customer createCustomerFromCsvLine(String[] data) {
        Customer customer = new Customer();
        customer.setId(Integer.parseInt(data[0]));
        customer.setFirstName(data[1]);
        customer.setLastName(data[2]);
        customer.setCountry(data[3]);
        orderValue = Double.parseDouble(data[4]);
        customer.setValueOfOrders(orderValue);
        return customer;
    }

    private static void checkMaxOrder(double orderValue, Customer customer) {
        if (orderValue > maxOrder) {
            maxOrder = orderValue;
            indexOfMaxOrder = customers.indexOf(customer);
        }

    }

    private static void printMostValueableCustomer(){
        System.out.println("Najbardziej wartościowy klient : ");
        System.out.println(customers.get(indexOfMaxOrder));
    }

    private static void printCustomersByChosenCountry() {
        System.out.println("Aby wyświetlić listę klientów z danego kraju, wpisz jego nazwę :");
        int countByCountry = 0;
        double totalValueOfOrders  = 0;
        double averageValueOfOrders;
        String countryNameFromUser = consoleScanner.nextLine();
        //obsługa błędów przy wpisaniu np poland zamiast Poland
        countryNameFromUser = countryNameFromUser.substring(0, 1).toUpperCase(Locale.ROOT) + (Locale.ROOT) + countryNameFromUser.substring(1).toLowerCase(Locale.ROOT);
        for (Customer customer :
                customers) {
            if (customer.getCountry().equals(countryNameFromUser)) {
                System.out.println(customer);
                totalValueOfOrders += customer.getValueOfOrders();
                countByCountry++;
            }
        }
        if (countByCountry == 0) {
            System.out.println("Brak klientów");
        } else {
            averageValueOfOrders = totalValueOfOrders/countByCountry;
            System.out.println("Przeciętna wartość zamówień z kraju " + countryNameFromUser + " : " + String.format("%.2f",averageValueOfOrders) + " zł");

        }
        consoleScanner.close();
    }


}
