package MethodsReferences2;

public enum Employment {
    FULL_TIME, PART_TIME, CONTRACT;

    public boolean verifyEmployment(Employee employee){
        return this.equals(employee.getEmployment());
    }
}
