package Generyczne;

public class GenericTest {

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(5, "Jabłko");
        Pair<String, Integer> pair2 = new Pair<>("Kasia", 7);
        Pair<String, Double> pair3 = new Pair<>("Double", 3.35);

        printPair(pair1);
        printPair(pair2);
        printPair(pair3);

    }

    public static <T, V> void printPair(Pair <T, V> pair){
        System.out.println(pair.getT() + " " + pair.getV());
    }
}
