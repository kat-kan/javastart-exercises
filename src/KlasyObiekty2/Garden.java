package KlasyObiekty2;

public class Garden {

    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.name = "Rose";
        plant1.description = "tbd";
        plant1.waterDaily = 0.5;

        Plant plant2 = new Plant();
        plant2.name = "Rose2";
        plant2.description = "tbd";
        plant2.waterDaily = 1.0;

        Plant plant3 = new Plant();
        plant3.name = "Rose3";
        plant3.description = "tbd";
        plant3.waterDaily = 1.5;

        double waterDailyAll = plant1.waterDaily + plant2.waterDaily + plant3.waterDaily;
        double waterWeeklyAll = waterDailyAll * 7;
        double waterYearlyAll = waterDailyAll * 365;

        System.out.println(waterDailyAll + " " + waterWeeklyAll + " " + waterYearlyAll);


    }
}
