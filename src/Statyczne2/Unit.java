package Statyczne2;

public class Unit {
    private double cups;
    private double tableSpoons;
    private double teaSpoons;

    private final static int CUP_ML = 250;
    private final static int TABLE_SPOON_ML = 15;
    private final static int TEA_SPOON_ML = 5;

    public static double cupsToMl(double cups){
        return cups * CUP_ML;
    }

    public static double tableSpoonsToMl (double tableSpoons){
        return tableSpoons * TABLE_SPOON_ML;
    }

    public static double teaSpoonsToMl(double teaSpoons){
        return teaSpoons * TEA_SPOON_ML;
    }

    public double getCups() {
        return cups;
    }

    public void setCups(double cups) {
        this.cups = cups;
    }

    public double getTableSpoons() {
        return tableSpoons;
    }

    public void setTableSpoons(double tableSpoons) {
        this.tableSpoons = tableSpoons;
    }

    public double getTeaSpoons() {
        return teaSpoons;
    }

    public void setTeaSpoons(double teaSpoons) {
        this.teaSpoons = teaSpoons;
    }
}
