package ZapisIOdczytPlikow2;

import java.io.Serial;
import java.io.Serializable;

public class Customer implements Serializable {
    @Serial
    private static final long serialVersionUID = 3L;

    private int id;
    private String firstName;
    private String lastName;
    private String country;
    private double valueOfOrders;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getValueOfOrders() {
        return valueOfOrders;
    }

    public void setValueOfOrders(double valueOfOrders) {
        this.valueOfOrders = valueOfOrders;
    }

    @Override
    public String toString() {
        return "id:" + id +
                ", " + firstName +
                " " + lastName +
                ", " + country +
                ", " + valueOfOrders +
                " zł";
    }
}
