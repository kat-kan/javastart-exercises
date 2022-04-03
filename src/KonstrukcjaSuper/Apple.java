package KonstrukcjaSuper;

public class Apple extends Fruit {
    private String brand;
    public static final String TYPE = "jabłkowate";

    public Apple(int weight, String brand) {
        super(weight, TYPE);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getInfo(){
        String additionalInfo = ",odmiana: " + brand;
        return super.getInfo() + additionalInfo;
    }
}
