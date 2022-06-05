package Sets1;
import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class NamesReader{

    public static void main(String[] args) {
        File file = new File("namespl.txt");
        TreeSet<String> names = createNamesSetFromFile(file);
        printSizeAndFirstLastElements(names);
    }

    private static TreeSet<String> createNamesSetFromFile(File file){
        String line;
        TreeSet<String> names = new TreeSet<>(new NamesComparator());

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line=bufferedReader.readLine())!=null){
                names.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return names;
    }

    private static void printSizeAndFirstLastElements(TreeSet<String> treeSet){
        System.out.println("Liczba unikalnych imion: " + treeSet.size());
        System.out.println("Pierwsze imię w zbiorze: " + treeSet.first());
        System.out.println("Ostatnie imię w zbiorze: " + treeSet.last());
    }

    private static class NamesComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            
            return o2.compareTo(o1);
        }
    }

}
