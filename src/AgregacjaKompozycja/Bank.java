package AgregacjaKompozycja;

public class Bank {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pesel = "533444";

        Person person2 = new Person();
        person2.firstName = "Marta";
        person2.lastName = "Kowalski";
        person2.pesel = "53346644";

        Address address1 = new Address();
        address1.city = "Warszawa";
        person.addressOfResidence = address1;

        Address address2 = new Address();
        address2.city = "Warszawa";
        person2.addressOfResidence = address2;

        Address address3 = new Address();
        address3.city = "Warszawa";
        person.registeredAddress = address3;

        Address address4 = new Address();
        address4.city = "Warszawa";
        person2.registeredAddress = address4;

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.balance = 5000.0;
        bankAccount1.owner = person;

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.balance = 2000.0;
        bankAccount2.owner = person2;

        System.out.println("Osoba 1 " + person.firstName + " " + person.lastName + " mieszka w miejscowości " + person.addressOfResidence.city + " posiada konto bankowe z kwotą " + bankAccount1.balance);
        System.out.println("Osoba 2 " + person2.firstName + " " + person2.lastName + " mieszka w miejscowości " + person2.addressOfResidence.city + " posiada konto bankowe z kwotą " + bankAccount2.balance);



    }
}
