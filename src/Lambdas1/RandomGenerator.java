package Lambdas1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        //create 10 random numbers
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbersList.add(random.nextInt());
        }
        //print all
        for (int number:
             numbersList) {
            System.out.println(number + " ");
        }
        //remove all that can be divided by 2
        Iterator<Integer> numbersIterator = numbersList.iterator();
        while (numbersIterator.hasNext()){
            if (numbersIterator.next()%2 == 0){
                numbersIterator.remove();
            }
        }
        System.out.println("po usunięciu");
        for (int number:
                numbersList) {
            System.out.println(number + " ");
        }

    }
}
