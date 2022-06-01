package Komparatory2;

import java.io.*;
import java.util.Arrays;

public class PropertyReader implements AutoCloseable {
    private static final String FILE_NAME = "properties.txt";
    private static final int SIZE = 10;
    private Property[] properties = new Property[SIZE];
    private int arrayCounter = 0;

    public Property[] getProperties() {
        return properties;
    }

    public void readFromFileAndCreateProperties() {
        File file = new File(FILE_NAME);
        String line;
        try (
                FileReader reader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(reader)) {
            bufferedReader.readLine();//skip first line with header
            while ((line = bufferedReader.readLine()) != null) {
                properties[arrayCounter] = splitLineToProperty(line);
                arrayCounter++;
            }
            Arrays.sort(properties);
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Property splitLineToProperty(String line) {
        String[] splitted = line.split(";");
        String city = splitted[0];
        double price = Double.parseDouble(splitted[1]);
        double area = Double.parseDouble(splitted[2]);
        return new Property(city, price, area);
    }

    @Override
    public void close() throws Exception {

    }
}
