package Enum2;

import java.util.Scanner;

import static Enum2.Order.printListOfOrdersWithGivenStatus;

public class Shop {

    public static void main(String[] args) {
        Order order1 = new Order("X", 450.99, Status.PAID);
        Order order2 = new Order("Y", 760.99, Status.PAID);
        Order order3 = new Order("X", 450.99, Status.NEW);

        Order[] orders = new Order[]{order1, order2, order3};

        Status status = getStatusFromUser();

        Order.printListOfOrdersWithGivenStatus(orders, status);
    }

    public static Status getStatusFromUser(){
        System.out.println("podaj status spośród dostępnych NEW PAID SHIPPED DELIVERED CANCELLED");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Status status = Status.fromName(name);
        return status;
    }


}
