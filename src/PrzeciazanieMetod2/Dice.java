package PrzeciazanieMetod2;
import java.util.Random;


public class Dice {

    int value;
    Random rand = new Random();
    int upperbound;
    int lowerbound;

    Dice(){
        upperbound= 7;
        lowerbound = 1;
        this.value = rand.nextInt(upperbound - lowerbound + 1) + lowerbound ;
    }

    Dice(int value){
        this.value = value;
    }

    void roll(){
        upperbound= 7;
        lowerbound = 1;
        this.value = rand.nextInt(upperbound - lowerbound + 1) + lowerbound ;
    }

    void printDice(){
        System.out.println("Liczba oczek: " + this.value);
    }
}
