package Polimorfizm2;

public class Character {

    private String name;
    private int powerOfAttack;
    private int powerOfDefense;
    private int energyLevel;

    public Character(String name, int powerOfAttack, int powerOfDefense, int energyLevel) {
        this.name = name;
        this.powerOfAttack = powerOfAttack;
        this.powerOfDefense = powerOfDefense;
        this.energyLevel = energyLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfAttack() {
        return powerOfAttack;
    }

    public void setPowerOfAttack(int powerOfAttack) {
        this.powerOfAttack = powerOfAttack;
    }

    public int getPowerOfDefense() {
        return powerOfDefense;
    }

    public void setPowerOfDefense(int powerOfDefense) {
        this.powerOfDefense = powerOfDefense;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public double getTotalAttackPower(){
        return powerOfAttack;
    }

    public double getTotalDefensePower(){
        return powerOfDefense;
    }
}
