package Statyczne3;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car (20, true, false, true, true);
        System.out.println(car.status());

        car.setAreDoorsClosed(false);
        System.out.println(car.status());

        car.setFuelLevel(0);
        System.out.println(car.status());
    }
}
