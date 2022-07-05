package Optional;

import java.util.Optional;
import java.util.Scanner;

public class ContactApp {
    public static void main(String[] args) {
        Optional<ContactManager> contactManager = ContactReader.readFile("resources/contacts.csv");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        contactManager.ifPresent(c->c.findByEmail(email));
        Optional<Contact> contactByEmail = contactManager.flatMap(manager -> manager.findByEmail(email));
        System.out.println("Kontakt o wskazanym adresie email:");
        contactByEmail.ifPresent(c-> System.out.println(c.getShortInfo()));
    }
}
