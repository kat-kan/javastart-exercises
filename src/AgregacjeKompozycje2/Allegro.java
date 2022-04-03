package AgregacjeKompozycje2;

public class Allegro {
    public static void main(String[] args) {
        Auction auction = new Auction();
        auction.title = "XBox One";
        auction.desc = "Konsola";
        auction.price = 999.99;

        Seller seller1 = new Seller();
        seller1.name = "Jan";
        seller1.lastName = "Kowalski";
        auction.seller = seller1;

        Address address1 = new Address();
        address1.city = "Warszawa";
        seller1.address = address1;

        System.out.println("Aukcja1, info o niej : " + auction.title + " " + auction.desc + " " + auction.price + "wystawca" + auction.seller.name);
    }
}
