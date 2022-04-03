package Interfejsy1;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    private double altitude;

    public Triangle(double a, double b, double c, double altitude) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.altitude = altitude;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }


    @Override
    public double calculateArea() {
        return 0.5 * a * altitude;
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }
}
