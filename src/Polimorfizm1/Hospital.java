package Polimorfizm1;

public class Hospital {

    Person[] listOfHospitalEmployees = new Person[3];

    Person[] createListOfEmployees() {
        Nurse nurse1 = new Nurse("Ewa", "Jankowska", 1500, 20);
        Nurse nurse2 = new Nurse("Janina", "Bąkiewicz", 1600, 30);
        Doctor doctor = new Doctor("Bronisław", "Kociakiewicz", 7000, 1000);
        listOfHospitalEmployees[0] = nurse1;
        listOfHospitalEmployees[1] = nurse2;
        listOfHospitalEmployees[2] = doctor;
        return listOfHospitalEmployees;

    }


    String getInfo() {
        String info = "Pracownicy szpitala: " + "\n";
        for (Person employee : listOfHospitalEmployees) {
            info += employee.getInfo();
            info += "\n";
          }
        return info;
    }

}
