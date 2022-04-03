public class TabliceJednowymiarowe {

    public static void main(String[] args) {
        int[] numbers1 = {7, 8, 1};
        int[] numbers2 = {2, 3, 9};

        int result = numbers1[0] + numbers1[1] + numbers1[2] + numbers2[0] + numbers2[1] + numbers2[2];
        System.out.println(result);
        System.out.println(addTablesOfTheSameLenght(numbers1,numbers2));

        }

    static int addTablesOfTheSameLenght(int[] table1, int[] table2){
        int result = 0;
        for (int i = 0; i < table1.length; i++) {
            result+= table1[i];
            result+=table2[i];
        }
        return result;
    }
}
