package SpecyfikatoryDostepu2.pl.javastart.logic;

import SpecyfikatoryDostepu2.pl.javastart.model.Telephone;

public class Charger {

    public Charger(){

    }
    public void charge(Telephone telephone){
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
    }
}
