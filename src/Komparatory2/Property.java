package Komparatory2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Property implements Comparable<Property> {
    private String city;
    private double price;
    private double area;
    private Double pricePerMeter;

    public Property(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
        this.pricePerMeter = calculatePricePerMeter();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.pricePerMeter = calculatePricePerMeter();
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
        this.pricePerMeter = calculatePricePerMeter();
    }

    public double getPricePerMeter() {
        return pricePerMeter;
    }

    private Double calculatePricePerMeter() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##", new DecimalFormatSymbols(Locale.US));
        return Double.valueOf(decimalFormat.format(price / area));
    }

    @Override
    public int compareTo(Property o) {
        return Double.compare(this.getPricePerMeter(), o.getPricePerMeter());
    }

    @Override
    public String toString() {
        return city + ", " +
                price + " zł, " +
                area + " mkw, " +
                pricePerMeter + " zł/mkw";
    }
}
