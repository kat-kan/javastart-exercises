package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    public static final int NUMBERS_GENERATED = 6;
    private ArrayList<Integer> lottoNumbers = new ArrayList<>();

    public ArrayList<Integer> getNumbers() {
        return lottoNumbers;
    }

    Lotto(){
        generate();
        randomize();
    }

    public void generate(){
        for (int i = 0; i < 50; i++) {
            lottoNumbers.add(i);
        }
    }

    public void randomize(){
        Collections.shuffle(lottoNumbers);
    }

    public int checkResult(List<Integer> numbers){
        int result = 0;
        for (int i = 0; i < NUMBERS_GENERATED; i++) {
            if(numbers.contains(lottoNumbers.get(i))){
                result++;
            }
        }
        return result;
    }

    public void printResult(){
        System.out.println("Wylosowane liczby");
        for (int i = 0; i < NUMBERS_GENERATED; i++) {
            System.out.println(lottoNumbers.get(i));
        }
    }

    public void printHitsNumber(List<Integer> numbers){
        int hitsNumber = checkResult(numbers);
        System.out.println("Liczba trafień " + hitsNumber);
    }
}
