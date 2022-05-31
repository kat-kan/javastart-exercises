package Komparatory1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class IntegersSorter {
    public static final int SIZE = 20;

    public static void main(String[] args) {
        Integer[] numbersArray = new Integer[SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            numbersArray[i] = random.nextInt();
        }
        printArray(numbersArray);

        Arrays.sort(numbersArray, new Comparator<Integer>() {
            //ascending
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        printArray(numbersArray);

        Arrays.sort(numbersArray, new Comparator<Integer>() {
            //descending
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        printArray(numbersArray);
    }

    public static void printArray(Number[] numbers){
        System.out.println("Liczby w tablicy: ");
        for (Number number:
             numbers) {
            System.out.println(number);
        }
    }
}
