package Arrays2;

import java.util.Arrays;
import java.util.Locale;

public class StringsChecker {

    public char[] convertStringToLowercaseArray(String input){
        String lowerCaseString = input.toLowerCase(Locale.ROOT);
        return lowerCaseString.toCharArray();
    }

    public boolean compareStrings(String first, String second){
        if (first == null & second == null) {
            return true;
        }
        else if (first == null & second != null || second == null){
            return false;
        }
        char[] firstStringChars = convertStringToLowercaseArray(first);
        char[] secondStringChars = convertStringToLowercaseArray(second);
        return compareCharArrays(firstStringChars, secondStringChars);
    }

    private boolean compareCharArrays(char[] firstStringChars, char[] secondStringChars) {
        int firstArrayLength = firstStringChars.length;
        int secondArrayLength = secondStringChars.length;
        if (firstArrayLength!=secondArrayLength) {
            return false;
        }
        Arrays.sort(firstStringChars);
        Arrays.sort(secondStringChars);
        for (int i = 0; i < firstArrayLength; i++) {
            if (firstStringChars[i] != secondStringChars[i]){
                return false;
            }
        }
        return true;
    }

}
