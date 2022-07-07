package Optional;

import java.util.Scanner;

public class ContactApp {
    static final String FILE_NAME = "resources/contacts.csv";

    public static void main(String[] args) {
        ContactReader.readFile(FILE_NAME)
                .ifPresentOrElse(ContactApp::readEmailFromUserAndShowContactInfo, ContactApp::fileNotFoundInfo);
    }

    private static void readEmailFromUserAndShowContactInfo(ContactManager contactManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        contactManager.findByEmail(email)
                .ifPresentOrElse(ContactApp::printContantInfo, ContactApp::contactNotFoundInfo);
    }

    private static void printContantInfo(Contact contact) {
        System.out.println("Kontakt o wskazanym adresie email:");
        System.out.println(contact.getShortInfo());
    }

    private static void fileNotFoundInfo() {
        System.out.println("nie znaleziono pliku");
    }

    private static void contactNotFoundInfo() {
        System.out.println("nie znaleziono kontaktu");
    }
}
