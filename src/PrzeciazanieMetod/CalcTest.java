package PrzeciazanieMetod;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.add(5,7));
        System.out.println(calculator1.add(6,7,9));
        System.out.println(calculator1.substract(10, 1));
        System.out.println(calculator1.substract(99, 5, 3));

    }
}
