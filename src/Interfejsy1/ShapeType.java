package Interfejsy1;

public enum ShapeType implements Shape {
    CIRCLE(1), RECTANGLE(2), TRIANGLE(3);

    private int optionNumber;

    ShapeType(int optionNumber) {
        this.optionNumber = optionNumber;
    }

    public ShapeType getFromInt(int a){
        ShapeType[] values = values();
        for (ShapeType value: values
             ) {
            if (value.optionNumber == a) {
                return value;
            }
        }
        return null;
    }

    public int getOptionNumber() {
        return optionNumber;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
