package Iterators1;

import java.util.Iterator;

public class PersonDatabaseApp {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        database.fillDatabase();
        Iterator<Person> personIterator = database.getPersonTreeMap().values().iterator();
        while (personIterator.hasNext()){
            Person person = personIterator.next();
            System.out.println(person);
        }

    }
}
