package MetodyKonstruktory4;

public class Test {
    public static void main(String[] args) {
        House house1 = new House(1000.0, 1000.0);
        house1.takeShower();
        house1.printResources();
        house1.takeBath();
        house1.printResources();
        house1.makeDinner();
        house1.printResources();
        house1.boilWater();
        house1.printResources();
        house1.watchTv(10.0);
        house1.printResources();
    }
}
