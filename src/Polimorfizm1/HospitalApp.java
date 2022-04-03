package Polimorfizm1;

public class HospitalApp {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.createListOfEmployees();
        System.out.println(hospital.getInfo());
    }
}
