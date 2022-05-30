package Rekurencja.Cz2;

public class Test {
    public static void main(String[] args) {
        Product product = new Product("a", 10.0);
        Product product2 = new Product("a", 10.0);
        Product product3 = new Product("a", 10.0);
        Product product4 = new Product("a", 10.0);
        Product product5 = new Product("a", 10.0);
        Product product6 = new Product("a", 10.0);
        Product product7 = new Product("a", 10.0);
        Product product8 = new Product("a", 10.0);
        Product product9 = new Product("a", 10.0);
        Product product10 = new Product("a", 10.0);

        Cart cart = new Cart();
        cart.add(product);
        cart.add(product2);
        cart.add(product3);
        cart.add(product4);
        cart.add(product5);
        cart.add(product6);
        cart.add(product7);
        cart.add(product8);
        cart.add(product9);
        cart.add(product10);

        double total = cart.totalCost(9);
        System.out.println(total);
    }
}
