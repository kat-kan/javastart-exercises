package Statyczne1;

public class University {
    public static void main(String[] args) {
        Student student1 = new Student("Ala", "Jackowska", 123);
        Student student2 = new Student("Jacek", "Kowalewski", 5344);
        System.out.println(Student.getNumber_of_students());
    }

}
