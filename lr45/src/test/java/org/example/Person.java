package org.example;

public class Person {
    private Gender gender;
    private String name;
    public Person(Gender gender,String name){
        this.gender=gender;
        this.name=name;
    }
    public void setGender(Gender gender){
        this.gender=gender;
    }
    public Gender getGender(){
        return gender;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void output(){
        System.out.println("Пол: "+ this.getGender() + " Имя: "+this.getName());
    }
}
