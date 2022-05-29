package Arrays1;

import java.util.Arrays;

public class PersonDatabase {
    private Person[] personList = new Person[INITIAL_SIZE];
    private static final int INITIAL_SIZE = 1;
    private int listCounter = 0;

    public Person[] getPersonList() {
        return personList;
    }

    public void add(Person person) {
        int numberOfTimesToEnlargeList = 2;
        if (person == null) {
            throw new NullPointerException("Przekazano pustą referencję, obiekt który próbujesz dodać nie istnieje");
        }
        if (listCounter == personList.length) {
            personList = Arrays.copyOf(personList, numberOfTimesToEnlargeList * personList.length);
        }
        personList[listCounter] = person;
        listCounter++;
    }

    public void remove(Person person){
        if (person == null) {
            throw new NullPointerException("Przekazano pustą referencję, obiekt który próbujesz usunąć nie istnieje");
        }
        int indexOfElementToBeRemoved = -1;
        for (Person p:
             personList) {
            indexOfElementToBeRemoved++;
            if (p.equals(person)){
                break;
            }
        }
        System.out.println(indexOfElementToBeRemoved);
        Person[] tempList = new Person[personList.length];
        System.arraycopy(personList, 0, tempList, 0, indexOfElementToBeRemoved);
        System.arraycopy(personList, indexOfElementToBeRemoved+1, tempList, indexOfElementToBeRemoved, personList.length -indexOfElementToBeRemoved-1);
        personList = tempList;
        listCounter--;
    }

    public Person get(int index){
        if (index < 0 | index > personList.length){
            throw new ArrayIndexOutOfBoundsException("Podano indeks spoza zakresu listy");
        }
        return personList[index];
    }

    public int size(){
        int size = 0;
        for (Person p:
             personList) {
            if (p!= null){
                size++;
            }
        }
        return size;
    }

    @Override
    public String toString() {
        return "Baza danych osób: " + '\n' + Arrays.toString(personList);
    }
}
