package SpecyfikatoryDostepu2.pl.javastart.application;

import SpecyfikatoryDostepu2.pl.javastart.logic.Charger;
import SpecyfikatoryDostepu2.pl.javastart.model.Telephone;

class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        telephone.printTelephone(telephone);
        Charger charger = new Charger();
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        telephone.printTelephone(telephone);
    }
}
