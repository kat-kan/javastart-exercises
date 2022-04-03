package Dziedziczenie2;

public class OnlineCourse extends Course {
    private int courseTimeInMinutes;
    private int timeToLearnCourseInMinutes;

    public int getCourseTimeInMinutes() {
        return courseTimeInMinutes;
    }

    public void setCourseTimeInMinutes(int courseTimeInMinutes) {
        this.courseTimeInMinutes = courseTimeInMinutes;
    }

    public int getTimeToLearnCourseInMinutes() {
        return timeToLearnCourseInMinutes;
    }

    public void setTimeToLearnCourseInMinutes(int timeToLearnCourseInMinutes) {
        this.timeToLearnCourseInMinutes = timeToLearnCourseInMinutes;
    }

    public void printInfo(){
        System.out.println("Informacje o kursie online: ");
        System.out.println("Nazwa " + this.getName());
        System.out.println("Id : " + this.getIdentifier());
        System.out.println("Opis " + this.getDescription());
        System.out.println("Cena" + this.getPrice());
        System.out.println("Czas nauki" + this.timeToLearnCourseInMinutes);
        System.out.println("Czas kursu" + this.courseTimeInMinutes);
    }
}
