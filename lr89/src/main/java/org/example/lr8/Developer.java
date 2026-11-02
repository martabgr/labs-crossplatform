package org.example.lr8;

public class Developer extends Employee {
    private String language;

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public Developer(String name, int salary, int experience, String language) {
        super(name, salary, experience);
        this.language = language;
    }

    @Override
    public void work() {
        System.out.printf("пишет код на %s ", this.getLanguage());
    }

    public void debugCode() {
        System.out.println();
        System.out.println("выполнил работу");
    }
}
