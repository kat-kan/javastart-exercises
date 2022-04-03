package Metody2;

public class App {

    public static void main(String[] args) {
        Metric metric = new Metric();
        Time time = new Time();

        int hours = 14;
        int minutes = time.hoursToMinutes(hours);
        int seconds = time.MinutesToSeconds(minutes);
        int miliseconds = time.secondsToMiliseconds(seconds);

        System.out.println(miliseconds);

    }
}
