package OperacjeNaZmiennych1;

import java.util.Random;

public class OperacjeNaZmiennych {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt();
        int y = random.nextInt();
        System.out.println(x + " " + y);
        boolean result;

        result = x > y;
        System.out.println(result);

        result = x * 2 > y;
        System.out.println(result);

        result = y < x + 3 && y > x - 2;
        System.out.println(result);

        result = x * y % 2 == 0;
        System.out.println(result);

    }
}
