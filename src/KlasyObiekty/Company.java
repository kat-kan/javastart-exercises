package KlasyObiekty;

public class Company {

    public static void main(String[] args) {
        Employee ceo = new Employee();
        Employee dev = new Employee();
        Employee accountant = new Employee();

        ceo.name = "Kevin";
        ceo.surname = "Johnson";
        ceo.yearOfBirth = 2000;
        ceo.yearsOfWorkingExp = 5;

        dev.name = "Betty";
        dev.surname = "Davis";
        dev.yearOfBirth = 1980;
        dev.yearsOfWorkingExp = 15;

        accountant.name = "John";
        accountant.surname = "Johnson";
        accountant.yearOfBirth = 1950;
        accountant.yearsOfWorkingExp = 50;

        String ceoInfo = ceo.name + " " + ceo.surname + " " + ceo.yearOfBirth + " " + ceo.yearsOfWorkingExp;
        String devInfo = dev.name + " " + dev.surname + " " + dev.yearOfBirth + " " + dev.yearsOfWorkingExp;
        String accountantInfo = accountant.name + " " + accountant.surname + " " + accountant.yearOfBirth + " " + accountant.yearsOfWorkingExp;
        System.out.println(ceoInfo);
        System.out.println(devInfo);
        System.out.println(accountantInfo);
    }


}
