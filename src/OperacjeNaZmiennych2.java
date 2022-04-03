public class OperacjeNaZmiennych2 {

    public static void main(String[] args) {

        double price;
        double vat;
        double vatAmount;
        double brutto;

        price = 100.0;
        vat = 0.23;

        vatAmount = vat * price;
        brutto = vatAmount + price;

        System.out.println("Kwota netto " + price);
        System.out.println("Wysokość VAT " + vatAmount);
        System.out.println("Kwota brutto " + brutto);
    }
}
