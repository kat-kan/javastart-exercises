package Lambdas1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> supplier = () -> random.nextInt();
        List<Integer> numbersList = supplyList(10, supplier);
        System.out.println("Wygenerowana lista");
        consumeList(numbersList, (number) -> System.out.print((String.valueOf(number) + " ")));
        filterList(numbersList, (number) -> number % 2 == 0);
        System.out.println("\n" + "Po przefiltrowaniu");
        consumeList(numbersList, (number) -> System.out.print(String.valueOf(number) + " "));

    }

    private static <T> List<T> supplyList(int listSize, Supplier<T> supplier) {
        List<T> numbersList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            numbersList.add(supplier.get());
        }
        return numbersList;
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    private static <T> void filterList(List<T> list, Predicate<T> predicate) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (predicate.test(t)) {
                iterator.remove();
            }
        }
    }
}
