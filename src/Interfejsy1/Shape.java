package Interfejsy1;

public interface Shape {
    public static final double PI = 3.14;
    //public static final int TRIANGLE = ShapeType.TRIANGLE.getOptionNumber();

    public static enum Type {CIRCLE(1), RECTANGLE(2), TRIANGLE(3);

        private int optionNumber;

        Type (int optionNumber) {
            this.optionNumber = optionNumber;
        }

        public Type getFromInt(int a){
            Type[] values = values();
            for (Type value: values
            ) {
                if (value.optionNumber == a) {
                    return value;
                }
            }
            return null;
        }}

    // metody są domyślnie publiczne i abstrakcyjne
    double calculateArea();

    public double calculatePerimeter();
}