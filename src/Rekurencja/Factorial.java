package Rekurencja;

public class Factorial {
    public static void main(String[] args) {
        int number = 9;
        System.out.println(countFactorial(number));
    }

    static int countFactorial(int n){
        return n>=1? n * countFactorial(n-1): 1;
    }
}
