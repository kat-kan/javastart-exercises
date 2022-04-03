package Statyczne2;

public class App {
    public static void main(String[] args) {
        double milkCups = 1.5;
        double oilTeaSpoons = 2;
        double powderTableSpoons = 1.5;

        System.out.println(Unit.cupsToMl(milkCups));
        System.out.println(Unit.teaSpoonsToMl(oilTeaSpoons));
        System.out.println(Unit.tableSpoonsToMl(powderTableSpoons));
    }
}
