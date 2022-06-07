package Maps1;

import java.util.HashMap;

public class Company {
    private HashMap<String, Employee> employeeHashMap = new HashMap<>();

    public HashMap<String, Employee> getEmployeeHashMap() {
        return employeeHashMap;
    }

    public void setEmployeeHashMap(HashMap<String, Employee> employeeHashMap) {
        this.employeeHashMap = employeeHashMap;
    }

    public void addEmployee(Employee employee) {
        String key = employee.getName() + " " + employee.getSurname();
        employeeHashMap.put(key, employee);
    }

    public Employee findEmployee(String name, String surname) {
        String key = name + " " + surname;
        return employeeHashMap.get(key);
    }
}
