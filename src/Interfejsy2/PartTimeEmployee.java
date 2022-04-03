package Interfejsy2;

public class PartTimeEmployee implements Employee {

    public double ratePerHour;
    public int hours;
    public String name;
    public String surname;

    public PartTimeEmployee(double ratePerHour, int hours, String name, String surname) {
        this.ratePerHour = ratePerHour;
        this.hours = hours;
        this.name = name;
        this.surname = surname;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

   @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public double getMonthlySalary() {
        return hours * ratePerHour;
    }

    @Override
    public double getYearlySalary() {
        return MONTHS * getMonthlySalary();
    }
}
