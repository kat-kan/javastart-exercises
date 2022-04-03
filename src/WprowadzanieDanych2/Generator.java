package WprowadzanieDanych2;

import java.util.Random;

public class Generator {
    public void generate(int number){
        Random random = new Random();
        int result = random.nextInt(2);
        System.out.println(result);
        if (number == result){
            System.out.println("Brawo, wygrałeś");

        }
        else{
            System.out.println("Niestety przegrałeś");
        }
    }
}
