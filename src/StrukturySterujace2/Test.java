package StrukturySterujace2;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        Random random = new Random();
        int upperbound = 10000;
        int randomInt = random.nextInt(upperbound);
        Number number = new Number();
        number.isBiggerThanComparedNumber(randomInt, 5000);
        number.isEven(randomInt);
        System.out.println(number.changeNumber(randomInt));
    }
}
