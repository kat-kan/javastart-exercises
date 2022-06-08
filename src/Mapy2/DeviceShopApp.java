package Mapy2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class DeviceShopApp {

    public static void main(String[] args) {
        DeviceShop shop = new DeviceShop();
        HashMap<String, TreeSet> devicesByCategory = new HashMap<>();

        File file = new File("devices.txt");

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine(); //to read the header
            while ((line = bufferedReader.readLine())!=null){
                String[] splitted = line.split(";");
                String category = splitted[0];
                String name = splitted[1];
                double price = Double.parseDouble(splitted[2]);
                Device device = new Device(category, name, price);
                if (devicesByCategory.containsKey(category)){
                    devicesByCategory.get(category).add(device);
                } else {
                    TreeSet<Device> devices = new TreeSet<>();
                    devices.add(device);
                    devicesByCategory.put(category, devices);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz nazwę kategorii");
        System.out.println(devicesByCategory.keySet());
        String chosenCategory = scanner.nextLine();
        System.out.println(devicesByCategory.get(chosenCategory).getClass());
        for (Object device:
             devicesByCategory.get(chosenCategory)) {
            System.out.println(device);
        }

    }
}
