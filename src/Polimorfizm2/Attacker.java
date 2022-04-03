package Polimorfizm2;

public class Attacker extends Character {

    private double percentageOfAttackBonus;

    public Attacker(String name, int powerOfAttack, int powerOfDefense, int energyLevel, double percentageOfAttackBonus) {
        super(name, powerOfAttack, powerOfDefense, energyLevel);
        this.percentageOfAttackBonus = percentageOfAttackBonus;
    }

    public double getPercentageOfAttackBonus() {
        return percentageOfAttackBonus;
    }

    public void setPercentageOfAttackBonus(double percentageOfAttackBonus) {
        this.percentageOfAttackBonus = percentageOfAttackBonus;
    }

    @Override
    public double getTotalAttackPower(){
        return super.getTotalAttackPower() + (percentageOfAttackBonus * super.getTotalAttackPower());
    }
}
