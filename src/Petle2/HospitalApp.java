package Petle2;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;
        Scanner input = new Scanner(System.in);
        Hospital hospital = new Hospital();
        System.out.println("Wprowadź 0  wyjście z programu, 1 - dopisanie pacjenta, 2 - wyświetlenie listy zapisanych pacjentów)");
        int chosenOption = -1;
        while (chosenOption !=  exit){
            System.out.println("Wprowadź 0  wyjście z programu, 1 - dopisanie pacjenta, 2 - wyświetlenie listy zapisanych pacjentów");
            chosenOption = input.nextInt();
            input.nextLine();
            switch (chosenOption){
                case addPatient:
                    Patient patient = new Patient();
                    System.out.println("Imię: ");
                    patient.setName(input.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setSurname(input.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(input.nextLine());
                    hospital.addPatient(patient);
                    break;
                case printPatients:
                    hospital.printPatients();
                    break;
                case exit:
                    System.out.println("Zamykam program");
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");
            }
        }
        input.close();
    }
}
