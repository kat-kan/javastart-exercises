package Dziedziczenie2;

public class Bootcamp extends OnlineCourse {
    private String teacherFirstName;
    private String teacherSecondName;
    private int hoursWithTeacher;

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        this.teacherFirstName = teacherFirstName;
    }

    public String getTeacherSecondName() {
        return teacherSecondName;
    }

    public void setTeacherSecondName(String teacherSecondName) {
        this.teacherSecondName = teacherSecondName;
    }

    public int getHoursWithTeacher() {
        return hoursWithTeacher;
    }

    public void setHoursWithTeacher(int hoursWithTeacher) {
        this.hoursWithTeacher = hoursWithTeacher;
    }
}
