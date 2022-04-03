package PrzeciazanieMetod2;

public class Test {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        dice1.printDice();
        dice1.roll();
        dice1.printDice();
        dice1.roll();
        dice1.printDice();
        dice1.roll();
        dice1.printDice();
        dice1.roll();
        dice1.printDice();

        Dice dice2 = new Dice(10);
        dice2.printDice();
        dice2.roll();
        dice2.printDice();
        dice2.roll();
        dice2.printDice();
        dice2.roll();
        dice2.printDice();
        dice2.roll();
        dice2.printDice();
        dice2.roll();
        dice2.printDice();
    }
}
