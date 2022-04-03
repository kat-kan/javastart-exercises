package Polimorfizm1;

public class Nurse extends Person {
    private int overhours;

    public Nurse(String name, String surname, double salary, int overhours) {
        super(name, surname, salary);
        this.overhours = overhours;
    }

    public int getOverhours() {
        return overhours;
    }

    public void setOverhours(int overhours) {
        this.overhours = overhours;
    }

    @Override
    public String getInfo(){
        String info = super.getInfo() + ",nadgodziny: " + overhours;
        return info;
    }
}
