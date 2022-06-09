package Mapy2;

import java.util.HashMap;
import java.util.TreeSet;

public class DeviceShop {
    private HashMap<String, TreeSet<Device>> devicesByCategory = new HashMap<>();

    public HashMap<String, TreeSet<Device>> getDevicesByCategory() {
        return devicesByCategory;
    }

    public void addDeviceToCategory(String category, Device device) {
        if (devicesByCategory.containsKey(category)) {
            devicesByCategory.get(category).add(device);
        } else {
            TreeSet<Device> devices = new TreeSet<>();
            devices.add(device);
            devicesByCategory.put(category, devices);
        }
    }

    public void showDevicesInCategory(String chosenCategory) {
        System.out.println("Wszystkie urządzenia w kategorii " + chosenCategory);
        for (Device device :
                getDevicesByCategory().get(chosenCategory)) {
            System.out.println(device);
        }
    }

    public void showAveragePriceInCategory(String chosenCategory) {
        System.out.println("średnia cena w kategorii " + chosenCategory);
        double sum = 0;
        for (Device device :
                getDevicesByCategory().get(chosenCategory)) {
            sum += device.getPrice();
        }

        double avgPrice = sum / getDevicesByCategory().get(chosenCategory).size();
        System.out.printf("%.2f", avgPrice);
        System.out.print(" zł " + "\n");
    }

    public void showLowestPriceInCategory(String chosenCategory) {
        System.out.println("Urządzenie o najniższej cenie w kategorii " + chosenCategory);
        System.out.println(getDevicesByCategory().get(chosenCategory).first());
    }

    public void showHighestPriceInCategory(String chosenCategory) {
        System.out.println("Urządzenie o najwyższej cenie w kategorii " + chosenCategory);
        System.out.println(getDevicesByCategory().get(chosenCategory).last());
    }
}
