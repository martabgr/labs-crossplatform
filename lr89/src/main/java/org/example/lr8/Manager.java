package org.example.lr8;

public class Manager extends Employee {
    private int teamSize;

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public Manager(String name, int salary, int experience, int teamSize) {
        super(name, salary, experience);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {

        System.out.printf("управляет командой из %d человек", this.getTeamSize());
    }

    public void holdMeeting() {
        System.out.println();
        System.out.println(this.getName() + " провел совещание");
    }

    @Override
    public void displayInfo(){

        super.displayInfo();
        System.out.println(" Размер команды: " + this.getTeamSize());

    }
}
