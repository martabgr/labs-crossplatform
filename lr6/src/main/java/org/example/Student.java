package org.example;

public class Student {
    private String name;
    private int course;
    private int group;
    private static int totalStudents = 0;
    private static int totalCourses = 0;

    public Student(String name, int course, int group) {
        this.name = name;
        this.course = course;
        this.group = group;
        totalCourses += course;
        totalStudents++;

    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public static double getAverageCourse() {
        if (totalStudents == 0) {
            System.out.println("Нет студентов");
            return 0;
        }
        return (double) totalCourses / totalStudents;
    }
}
