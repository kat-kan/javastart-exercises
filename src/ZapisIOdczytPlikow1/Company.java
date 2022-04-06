package ZapisIOdczytPlikow1;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

public class Company implements Serializable {
    @Serial
    private static final long serialVersionUID = 2L;
    public static final int NUMBER_OF_EMPLOYEES = 3;
    private Employee[] employees = new Employee[NUMBER_OF_EMPLOYEES];
    private int empNumber;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        if (empNumber >= NUMBER_OF_EMPLOYEES){
            throw new ArrayIndexOutOfBoundsException("W tej firmie pracuje tylko 3 pracowników");
        }
        else {
            employees[empNumber] = employee;
            empNumber++;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Employee employee:
             employees) {
            builder.append(employee.toString());
            builder.append("/n");
        }
        return builder.toString();
    }
}
