package Enkapsulacja;

public class Greeting {
    void greetClientFull(Client client, double beforeDiscount, double afterDiscount){
        greet(client);
        printInfoBeforeDiscount(beforeDiscount);
        printInfoAfterDiscount(afterDiscount);
    }

    private void greet(Client client){
        if (client.getFirstName() == null){
            if (client.getLastName()== null) {
                System.out.println("Witaj nieznajomy");
            }
            else{
                System.out.println("Dzień dobry panie/pani " + client.getLastName());
            }
        }
        else {
            if (client.getLastName()== null){
                System.out.println("Witaj " + client.getFirstName());
            }
            else {
                System.out.println("Witaj" + client.getFirstName() + client.getLastName());
            }
        }
    }

    private void printInfoBeforeDiscount(double beforeDiscount){
        System.out.println("Kwota przed rabatem: " + beforeDiscount);
    }

    private void printInfoAfterDiscount(double afterDiscount){
        System.out.println("Do zapłaty (po rabacie): " + afterDiscount);
    }
}
