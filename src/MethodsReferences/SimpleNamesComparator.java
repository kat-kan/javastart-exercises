package MethodsReferences;

import java.util.Arrays;
import java.util.List;

public class SimpleNamesComparator {

    public static void main(String[] args) {
        List<String>  names = Arrays.asList("Zyta", "Bogusław", "Aldona", "Bogdan", "Jadwiga");
        System.out.println("Przed sortowaniem");
        names.forEach(System.out::println);
        names.sort(String::compareToIgnoreCase);
        System.out.println("Po sortowaniu");
        names.forEach(System.out::println);
    }



}
