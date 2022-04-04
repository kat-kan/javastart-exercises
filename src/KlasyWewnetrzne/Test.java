package KlasyWewnetrzne;

public class Test {
    public static void main(String[] args) {
        int[] tableToSort = {2,1,7, 13, 0, 3,5,4};
        //klasa anonimowa
        Sortable sortable = new Sortable() {
            @Override
            public int[] sort(int[] table) {
                int len = table.length;
                for (int i = 0; i < len - 1; i++) {
                    for (int j = 0; j < len-i-1; j++) {
                        if (table[j+1] < table[j]){
                            int swapping = table[j];
                            table[j] = table[j+1];
                            table[j+1] = swapping;
                        }
                    }

                }
                return table;
            }
        };

        int[] sorted = sortable.sort(tableToSort);
        for (int number:
             sorted) {
            System.out.println(number);
        }
    }
}
