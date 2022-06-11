package Iterators1;

import java.util.TreeMap;

public class PersonDatabase {
    private TreeMap<String, Person> personTreeMap = new TreeMap<>();

    public TreeMap<String, Person> getPersonTreeMap() {
        return personTreeMap;
    }

    public void addPerson(Person person){
        personTreeMap.put(person.getSurname(), person);
    }

    public void fillDatabase(){
        Person person = new Person("Agata", "Bacicka", 35);
        Person person1 = new Person("Jadwiga", "Złota", 23);
        Person person2 = new Person("Jacek", "Kowalski", 14);
        Person person3 = new Person("Ola", "Apteczna", 10);
        Person person4 = new Person("Kazio", "Lolucki", 5);
        Person person5 = new Person("Jola", "Ciepła", 16);
        Person person6 = new Person("Zyta", "Wójtowicz", 7);
        Person person7 = new Person("Marta", "Hub", 30);
        Person person8 = new Person("Daria", "Purgał", 28);
        Person person9 = new Person("Ala", "Maczek", 9);
        Person person10 = new Person("Janusz", "Policki", 4);
        addPerson(person);
        addPerson(person1);
        addPerson(person2);
        addPerson(person3);
        addPerson(person4);
        addPerson(person5);
        addPerson(person6);
        addPerson(person7);
        addPerson(person8);
        addPerson(person9);
        addPerson(person10);
    }
}
