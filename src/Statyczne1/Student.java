package Statyczne1;

public class Student {
    private String name;
    private String surname;
    private int index;

    private static int number_of_students;


    public Student(String name, String surname, int index) {
        this.name = name;
        this.surname = surname;
        this.index = index;
        number_of_students++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static int getNumber_of_students() {
        return number_of_students;
    }

/*    public static void setNumber_of_students(int number_of_students) {
        Student.number_of_students = number_of_students;
    }
    Pole studentsNumber oznaczyliśmy jako prywatne i dodaliśmy do niego tylko getter.
    Wynika to z tego, że nie chcemy, aby ktoś modyfikował pole z liczbą studentów ręcznie, bo mogłoby to wprowadzić przekłamania.

    Przykładowo jeśli w naszym programie ktoś utworzy 10 obiektów typu Student, to chcemy, aby pole studentsNumber miało wartość 10.
    Gdyby pole nie było prywatne lub był dla niego dostępny setter, to ktoś mógłby je zmienić np. na 5, co nie jest oczekiwane.*/
}
