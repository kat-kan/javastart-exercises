package Petle2;

public class Hospital {
    private int maxNumberOfPatients = 10;
    private int patientsCount = 0;
    private Patient[] queque = new Patient[maxNumberOfPatients];

    public void addPatient(Patient patient){
        if (verifyIfQuequeNoTTooLong()) {
            int freeQuequeIndex = patientsCount;
            queque[freeQuequeIndex] = patient;
            patientsCount++;
        }
        else {
            System.out.println("Nie ma więcej miejsc");
        }
    }

    private boolean verifyIfQuequeNoTTooLong(){
        if (patientsCount <= maxNumberOfPatients){
            return true;
        }
        else {
            return false;
        }
    }

    public void printPatients(){
        for (int i = 0; i < patientsCount ; i++) {
            System.out.println("Dane pacjenta który jest " + i + "w kolejce");
            System.out.println(queque[i].getName() + " " + queque[i].getSurname() + " " + queque[i].getPesel());
        }
    }

}
