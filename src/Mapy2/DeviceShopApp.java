package Mapy2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeviceShopApp {
    static final File SHOP_DEVICES_LIST = new File("devices.txt");

    public static void main(String[] args) {
        DeviceShop shop = new DeviceShop();

        try (FileReader fileReader = new FileReader(SHOP_DEVICES_LIST);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            List<Device> devices = readDevices(shop,bufferedReader);
            addToShop(shop,devices);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String chosenCategory = getCategoryFromUser(shop);
        shop.showDevicesInCategory(chosenCategory);
        shop.showAveragePriceInCategory(chosenCategory);
        shop.showLowestPriceInCategory(chosenCategory);
        shop.showHighestPriceInCategory(chosenCategory);

    }

    private static List<Device> readDevices(DeviceShop shop, BufferedReader bufferedReader) throws IOException {
        List<Device> devices = new ArrayList<>();
        String line = bufferedReader.readLine(); //to read the header
        while ((line = bufferedReader.readLine()) != null) {
            String[] splitted = line.split(";");
            String category = splitted[0];
            String name = splitted[1];
            double price = Double.parseDouble(splitted[2]);
            Device device = new Device(category, name, price);
            devices.add(device);
        }
        return devices;
    }

    private static void addToShop(DeviceShop shop, List<Device> devices){
        for (Device device :
                devices) {
            shop.addDeviceToCategory(device.getCategory(),device);
        }
    }

    private static String getCategoryFromUser(DeviceShop shop) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz nazwę kategorii");
        System.out.println(shop.getDevicesByCategory().keySet());
        String chosenCategory = scanner.nextLine();
        return chosenCategory;
    }
}
