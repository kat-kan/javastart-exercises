package Interfejsy2;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new FulltimeEmployee(5000.0, "Jan", "Kowalski");
        Employee employee2 = new PartTimeEmployee(50.0,20,"Anna", "Borowska");
        Employee employee3 = new FulltimeEmployee(9000.0, "Barbara", "Miochałek");
        Employee[] employees = new Employee[3];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        printEmployees(employees);
        getSumOfMontlySalaries(employees);
        getSumOfYearlySalaries(employees);
    }

    private static void printEmployees(Employee[] employees){
        for (Employee e:
             employees) {
            double monthlySalary = e.getMonthlySalary();
            double yearlySalary = e.getYearlySalary();
            System.out.println(e.getName() + " " + e.getSurname() + ", wypłata miesięczna: " + e.getMonthlySalary() + ",wypłata roczna: " + e.getYearlySalary());
        }
    }

    private static double getSumOfMontlySalaries(Employee[] employees){
        double sum = 0.0;
        for (Employee e:
             employees) {
            sum += e.getMonthlySalary();
        }
        System.out.println("Suma miesięcznych wynagrodzeń: " + sum);
        return sum;
    }

    private static double getSumOfYearlySalaries(Employee[] employees){
        double sum = 0.0;
        for (Employee e:
                employees) {
            sum += e.getYearlySalary();
        }
        System.out.println("Suma rocznych wynagrodzeń: " + sum);
        return sum;
    }

}
