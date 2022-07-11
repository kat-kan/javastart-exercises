package TextBlocks;

public class DiceApp {
    public static void main(String[] args) {
        Dice dice = new Dice();
        String result = dice.rollDice();
        dice.printDiceResult(result);
    }
}
