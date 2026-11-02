package org.example;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }

    public void old(Book[]arr){
        Book max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].year< max.year){
                max=arr[i];
            }
        }
        System.out.println("Самая старая книга "+max.title);
    }
    public void young(Book[]arr){
        Book y=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].year> y.year){
                y=arr[i];
            }
        }
        System.out.println("Самая новая книга "+ y.title);
    }

}
