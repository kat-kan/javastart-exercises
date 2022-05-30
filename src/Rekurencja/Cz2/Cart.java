package Rekurencja.Cz2;

public class Cart {
    private static final int SIZE = 10;
    Product[] products = new Product[SIZE];
    int counter = 0;

    public double totalCost(int maxIndex){
        double emptyCart = 0.0;
        if (products!=null){
            if (maxIndex > 0 ){
                return products[maxIndex].getPrice() + totalCost(maxIndex-1);
            } else{
                return products[maxIndex].getPrice();
            }
        }
        return emptyCart;
    }

    public void add(Product product){
        if (counter < SIZE){
            products[counter] = product;
            counter++;
        }
        else {
            System.out.println("Koszyk przepełniony");
        }
    }
}
