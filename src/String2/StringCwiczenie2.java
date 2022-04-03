package String2;

import java.util.Locale;
import java.util.Scanner;

public class StringCwiczenie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textFromUser = scanner.nextLine();
        Character firstLetter = textFromUser.charAt(0);
        if (Character.isUpperCase(firstLetter)){
            System.out.println(textFromUser.toUpperCase(Locale.ROOT));
        } else if(Character.isLowerCase(firstLetter)){
            System.out.println(textFromUser.toLowerCase(Locale.ROOT));
        } else {
            System.out.println(textFromUser);
        }
    }
}
