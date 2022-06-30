package DateTime2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DatesAnalyzer {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LocalDate first = getDateFromUser();
        LocalDate second = getDateFromUser();
        compareDates(first, second);
        datesDifference(first, second);
    }

    private static LocalDate getDateFromUser(){
        System.out.println("Podaj dzień miesiąca");
        int day = scanner.nextInt();
        System.out.println("Podaj miesiąc : ");
        int month = scanner.nextInt();
        System.out.println("Podaj rok");
        int year = scanner.nextInt();
        return LocalDate.of(year, month, day);
    }

    private static void compareDates(LocalDate first, LocalDate second){
        LocalDate laterDate = first.isAfter(second)? first: second;
        System.out.println("Późniejsza data " + laterDate);
    }

    private static void datesDifference(LocalDate first, LocalDate second){
        Period period = Period.between(first, second);
        System.out.println("Podane daty dzieli " + Math.abs(period.getYears()) + " lat, " + Math.abs(period.getMonths()) + " miesięcy i " + Math.abs(period.getDays()) + " dni");
    }
}
