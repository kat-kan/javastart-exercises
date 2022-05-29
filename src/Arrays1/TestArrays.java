package Arrays1;

public class TestArrays {
    public static void main(String[] args) {
        Person person = new Person("Bob", "Kovalsky", "323232232");
        Person person2 = new Person("Eddie", "Kovalsky", "323662232");
        Person person3 = new Person("A", "Kovalsky", "323662232");
        Person person4 = new Person("B", "Kovalsky", "323662232");
        Person person5 = new Person("C", "Kovalsky", "323662232");
        PersonDatabase database = new PersonDatabase();
        //dodanie 5 wartości do bazy danych
        database.add(person);
        database.add(person2);
        database.add(person3);
        database.add(person4);
        database.add(person5);
        //wyświetlenie liczby faktycznych osób w bazie
        System.out.println(database.size());
        //wyświetlenie osoby o indeksie 4
        System.out.println(database.get(4));
        //usunięcie osoby 5
        database.remove(person5);
        //wyświetlenie zawartości bazy danych
        System.out.println(database.toString());
        Person person6 = new Person("D", "Kovalsky", "32366227732");
        database.add(person6);
        System.out.println(database.toString());
    }
}
