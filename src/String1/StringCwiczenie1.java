package String1;

import java.util.Scanner;

public class StringCwiczenie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = scanner.nextInt();
        scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        while (numberOfNumbers>0){
            String enteredValue = scanner.nextLine();
            builder.append(enteredValue.charAt(enteredValue.length()-1));
            numberOfNumbers--;
        }
        System.out.println(builder);
    }
}
