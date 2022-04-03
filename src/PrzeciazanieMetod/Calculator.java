package PrzeciazanieMetod;

public class Calculator {
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return this.add(a, b) + c;
    }

    int substract(int a, int b){
        return a - b;
    }

    int substract(int a, int b,int c){
        return this.substract(a, b) - c;
    }
}
