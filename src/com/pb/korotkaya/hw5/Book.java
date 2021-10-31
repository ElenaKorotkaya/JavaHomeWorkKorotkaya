package com.pb.korotkaya.hw5;

public class Book {

    //поля класса
    private String nameBook;
    private String authorBook;
    private int yearPublishing;

    //конструктор
    public Book(String nameBook, String authorBook, int yearPublishing) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.yearPublishing = yearPublishing;
    }

    //Геттеры и Сеттеры
    public String getNameBook(){ return nameBook;
    }
    public void setNameBook(String nameBook){
        this.nameBook = nameBook;
    }
    public String getAuthorBook(){
        return authorBook;
    }
    public  void setAuthorBook(String authorBook){
        this.authorBook = authorBook;
    }
    public Integer getYearPublishing(){
        return yearPublishing;
    }
    public void setYearPublishing(Integer yearPublishing){
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return "The book: " + nameBook + "; " + "author: " + authorBook + "; " + "year: " + yearPublishing + ".";
    }

    public static void main(String[] args) {
    }
}
