package Komparatory2;

public class PropertyApp {
    public static void main(String[] args) {
        PropertyReader propertyReader = new PropertyReader();
        propertyReader.readFromFileAndCreateProperties();
        Property[] properties = propertyReader.getProperties();
        printProperties(properties);
    }

    private static void printProperties(Property[] properties) {
        System.out.println("Lista dostępnych nieruchomości: ");
        for (Property property :
                properties) {
            System.out.println(property);
        }
    }
}
