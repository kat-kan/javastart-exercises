package Optional;

import java.util.Optional;
import java.util.Scanner;

public class ContactApp {
    public static void main(String[] args) {
        ContactManager contactManager = ContactReader.readFile("contacts.csv");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        Optional<Contact> contactByEmail = contactManager.findByEmail(email);
        System.out.println("Kontakt o wskazanym adresie email:");
        //System.out.println(contactByEmail.getShortInfo());
    }
}
