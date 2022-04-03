package Polimorfizm2;

public class Defender extends Character {
    private double percentageOfDefenseBonus;

    public Defender(String name, int powerOfAttack, int powerOfDefense, int energyLevel, double percentageOfDefenseBonus) {
        super(name, powerOfAttack, powerOfDefense, energyLevel);
        this.percentageOfDefenseBonus = percentageOfDefenseBonus;
    }

    public double getPercentageOfDefenseBonus() {
        return percentageOfDefenseBonus;
    }

    public void setPercentageOfDefenseBonus(double percentageOfDefenseBonus) {
        this.percentageOfDefenseBonus = percentageOfDefenseBonus;
    }

    @Override
    public double getTotalDefensePower(){
        return super.getTotalDefensePower() + (percentageOfDefenseBonus * super.getTotalDefensePower());
    }
}
