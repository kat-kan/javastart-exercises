package DateTime1;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
    public static void main(String[] args) {
        System.out.println("Witaj w aplikacji stoper");
        System.out.println("Aby rozpocząć odliczanie, wciśnij klawisz Enter:");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        Instant start = Instant.now();
        System.out.println("Rozpoczęto odliczanie. Aby zatrzymać, wciśnij klawisz Enter:");
        scanner.nextLine();
        Instant stop = Instant.now();
        Duration duration = Duration.between(start, stop);
        System.out.println("Czas, który upłynął (w sekundach): " + duration.getSeconds());
    }
}
