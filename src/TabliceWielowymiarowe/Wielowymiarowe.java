package TabliceWielowymiarowe;

public class Wielowymiarowe {

    public static void main(String[] args) {
        double[] first = {1.0, 1.5, 2.0};
        double[] second = {1.5, 2.0, 2.5};
        double[] third = {2.0, 2.5, 3.0};
        double[][] array = {first, second, third};

        double sumOfDiagonalsMultiplied = (array[0][0] * array[1][1] * array[2][2]) + (array[0][1] * array[1][1] * array[1][0]);
        System.out.println(sumOfDiagonalsMultiplied);
        double multipliedSums = (array[1][0] + array[1][1] + array[1][2]) * (array[0][1] + array[1][1] + array[2][1]);
        System.out.println(multipliedSums);
        double allExceptTheMiddleOne = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                allExceptTheMiddleOne += array[i][j];
            }
        }
        allExceptTheMiddleOne-=2.0;
        System.out.println(allExceptTheMiddleOne);
    }
}
