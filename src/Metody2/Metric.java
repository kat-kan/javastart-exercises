package Metody2;

public class Metric {

    double metersToCentimeters(double meters) {
        return meters * 100;
    }

    double metersToMilimeters(double meters){
        return meters * 1000;
    }

    double centimetersToMeters(double centimeters){
        return centimeters/100.0;
    }

    double milimetersToMeters(double milimeters){
        return milimeters/1000.0;
    }
}
