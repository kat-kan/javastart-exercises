package Interfejsy2;

public class FulltimeEmployee implements Employee {

    public static final double BONUS_RATE = 0.05;
    public double monthlySalary;
    public String name;
    public String surname;

    public FulltimeEmployee(double monthlySalary, String name, String surname) {
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public double getMonthlySalary() {
        return monthlySalary;
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

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getYearlySalary() {

        return MONTHS * getMonthlySalary() + BONUS_RATE * (MONTHS * getMonthlySalary());
    }
}
