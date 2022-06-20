package MethodsReferences2;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Company {
    public static void main(String[] args) {
        List<Employee> employees = createEmployees();
        //10% podwyżki dla pracowników zatrudnionych na pełen etat
        addBonusToFullTimeEmployees(employees);
        //liczba pracowników etatowych
        double fullTimeEmployeesNumber = countEmployeesByEmployment(employees, Employment.FULL_TIME);

        System.out.println("Liczba pracowników zatrudnionych na pełen etat: " + fullTimeEmployeesNumber);
        System.out.println("Oto oni:");
        employees.stream().filter(Company::isFullTimeEmployee)
                .forEach(System.out::println);

        employeeWithLongestName(employees)
                .ifPresent(Company::printLongestName);
    }

    private static Optional<String> employeeWithLongestName(List<Employee> employees) {
        return employees.stream()
                .map(Company::getEmployeeName)
                .max(Company::compareEmployeeNames);
    }

    private static String getEmployeeName(Employee employee) {
        return employee.getFirstName() + " " + employee.getLastName();
    }

    private static long countEmployeesByEmployment(List<Employee> employees, Employment employment) {
        return employees.stream()
                .filter(employment::verifyEmployment)
                .count();
    }

    private static void addBonusToFullTimeEmployees(List<Employee> employees) {
        employees.stream()
                .filter(Company::isFullTimeEmployee)
                .forEach(Company::addBonus);
    }

    private static List<Employee> createEmployees() {
        return List.of(
                new Employee("Jan", "Kowalski", 4000, Employment.FULL_TIME),
                new Employee("Marta", "Baczewska", 3900, Employment.FULL_TIME),
                new Employee("Karol", "Piotrowicz", 5800, Employment.CONTRACT),
                new Employee("Anna", "Lubicz", 6000, Employment.PART_TIME),
                new Employee("Wojciech", "Kozłowski", 3500, Employment.PART_TIME),
                new Employee("Paweł", "Kowalski", 8000, Employment.FULL_TIME),
                new Employee("Adam", "Marchwicki", 300, Employment.CONTRACT)
        );
    }

    private static void printLongestName(String emp) {
        System.out.println("Pracownik o najdłuższym imieniu i nazwisku to " + emp);
    }

    private static boolean isFullTimeEmployee(Employee employee) {
        return employee.getEmployment() == Employment.FULL_TIME;
    }

    private static int compareEmployeeNames(String e1, String e2) {
        return Integer.compare(e1.length(), e2.length());
    }

    private static void addBonus(Employee employee) {
        employee.setSalary(employee.getSalary() * 1.1);
    }
}
