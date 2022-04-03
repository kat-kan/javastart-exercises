package StrukturySterujace2;

import java.util.Random;

public class Number {

    void isBiggerThanComparedNumber(int number, int compareTo){
        if (number == compareTo) {
            System.out.println(number + " jest równa " + compareTo);
        } else if (number < compareTo) {
            System.out.println(number + " jest mniejsza " + compareTo );
        } else if (number > compareTo) {
            System.out.println(number + " jest większa " + compareTo);
        }
    }

    void isEven(int number){
        if (number%2 == 0){
            System.out.println("Jest to liczba parzysta");
        }
        else {
            System.out.println("Jest to liczba nieparzysta");
        }
    }

    int changeNumber(int number){
        int result = 0; //jak 0 to zwracamy 0
        if (number >= 1000){
            result = number;
        }
        else {
            if (number > 0 && number < 10){
                result =  number * 1000;
            }
            else if (number >= 10 && number < 100){
                result =  number * 100;
            }
            else if (number >= 100 && number < 1000){
                result = number * 10;
            }
        }
        return result;
    }
}
