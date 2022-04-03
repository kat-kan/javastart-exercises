package MetodyKonstruktory4;

public class House {
    double waterAmount;
    double oilAmount;

    House(double water, double oil){
        this.waterAmount = water;
        this.oilAmount = oil;
    }

    void takeShower(){
        this.waterAmount -= 48.0;
    }

    void takeBath(){
        this.waterAmount -= 86.0;
    }

    void makeDinner(){
        this.oilAmount -= 0.1;
        this.waterAmount -= 4.0;
    }

    void boilWater(){
        this.oilAmount -= 0.05;
        this.waterAmount -= 0.5;
    }

    void watchTv(double hoursOfWatching){
        double spentOil = hoursOfWatching * 0.06;
        this.oilAmount -= spentOil;
    }

    void printResources(){
        System.out.println("Ilość wody : " + this.waterAmount + " ilość ropy : " + this.oilAmount);
    }
}
