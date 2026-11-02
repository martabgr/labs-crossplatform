package org.example.lr8;

public class Employee {
    private String name;
    private int salary;
    private int experince;

    public void setName(String name) {
        if (name != null)
            this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setExperince(int experince) {
        if (experince >= 0)
            this.experince = experince;
    }

    public int getExperince() {
        return experince;
    }

    public Employee(String name, int salary, int experince) {
        this.name = name;
        this.salary = salary;
        this.experince = experince;
    }

    public void work() {
        System.out.println("выполяет работу");
    }

    public void displayInfo() {
        System.out.println("Имя: " + this.getName() + ", Зарплата: " + this.getSalary() + ", Опыт: " + this.getExperince());
    }
}
