package Optional;

import java.util.Optional;
import java.util.Scanner;

public class ContactApp {
    static final String FILE_NAME = "resources/contacts.csv";

    public static void main(String[] args) {
//        Optional<ContactManager> contactManager = ContactReader.readFile(FILE_NAME);
        ContactReader.readFile(FILE_NAME).ifPresentOrElse(ContactApp::readEmailFromUserAndShowContactInfo, ContactApp::fileNotFoundInfo);
    }

    private static void readEmailFromUserAndShowContactInfo(ContactManager contactManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        /*contactManager.ifPresent(c->c.findByEmail(email));
        Optional<Contact> contactByEmail = contactManager.flatMap(manager -> manager.findByEmail(email));*/
        /*System.out.println("Kontakt o wskazanym adresie email:");
        contactByEmail.ifPresent(c-> System.out.println(c.getShortInfo()));*/
    }

    private static void fileNotFoundInfo(){
        System.out.println("nie znaleziono pliku");
    }
}
