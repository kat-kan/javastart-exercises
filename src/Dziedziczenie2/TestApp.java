package Dziedziczenie2;

public class TestApp {
    public static void main(String[] args) {
        OnlineCourse learnJava = new OnlineCourse();
        learnJava.setCourseTimeInMinutes(90);
        learnJava.setTimeToLearnCourseInMinutes(180);
        learnJava.setName("Learn Java");
        learnJava.setDescription("Uczzymy Javy");
        learnJava.setIdentifier("JAV-ON-2022");
        learnJava.setPrice(900.0);
        learnJava.printInfo();

    }
}
