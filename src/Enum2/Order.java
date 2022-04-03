package Enum2;

import java.util.Objects;

public class Order {
    private String name;
    private double price;
    private Status status;

    public Order(String name, double price, Status status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public static Order[] getAllOrdersWithGivenStatus(Order[] orders, Status status){
        Order[] ordersWithStatus;
        int numberOfOrdersWithStatus = 0;
        for (Order order: orders
             ) {
            if (order.status.equals(status)){
                numberOfOrdersWithStatus++;
            }
        }
        ordersWithStatus = new Order[numberOfOrdersWithStatus];
        int index = 0;
        for (Order order: orders
        ) {
            if (order.status.equals(status)){
                ordersWithStatus[index] = order;
                index++;
            }
        }

        return ordersWithStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 && Objects.equals(name, order.name) && status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, status);
    }

    @Override
    public String toString() {
        return name +
                "(" + price + ") - " +
                status;
    }

    public static void printListOfOrdersWithGivenStatus(Order[] orders, Status status){
        System.out.println("Lista zamówień: ");
        for (Order order: Order.getAllOrdersWithGivenStatus(orders, status)
        ) {
            System.out.println(order);
        }
    }
}
