package Mapy2;

import java.util.Objects;

public class Device implements Comparable<Device> {
    private String category;
    private String name;
    private double price;

    public Device(String category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Double.compare(device.price, price) == 0 && Objects.equals(name, device.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public int compareTo(Device o) {
        return Double.compare(this.getPrice(), o.getPrice());
    }

    @Override
    public String toString() {
        return name + " " + price + " zł";
    }
}
