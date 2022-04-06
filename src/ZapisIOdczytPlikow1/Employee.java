package ZapisIOdczytPlikow1;

public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    @Override
    public String toString() {

        return super.toString() +
                "wypłata" + salary +
                '}';
    }
}
