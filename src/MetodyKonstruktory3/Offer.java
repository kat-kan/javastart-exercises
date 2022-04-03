package MetodyKonstruktory3;

public class Offer {
    Product product;
    double price;
    boolean special;

    Offer(Product prod, double offerPrice, boolean offerSpecial){
        product = prod;
        price = offerPrice;
        special = offerSpecial;
    }

    void printOfferInfo(){
        System.out.println(product.name + " " + product.producer + " " + price + " czy oferta specjalna? " + special);
    }
}
