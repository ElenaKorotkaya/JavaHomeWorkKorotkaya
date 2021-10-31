package com.pb.korotkaya.hw5;

public class Reader {

    //поля класса
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String dateBirth;
    private String phoneNumber;

    //конструктор
    public Reader(String fullName, int libraryCardNumber, String faculty, String dateBirth, String phoneNumber){
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
        //System.out.println("Reader: " + fullName + ", libraryCardNumber: " + libraryCardNumber + ", faculty: " + faculty + ", dateBirth: " + dateBirth + ", phoneNumber: " + phoneNumber + ".");
    }
    //Геттеры и сеттеры
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){ this.fullName = fullName;}
    public Integer getLibraryCardNumber(){
        return libraryCardNumber;
    }
    public void setLibraryCardNumber(Integer libraryCardNumber){
        this.libraryCardNumber = libraryCardNumber;
    }
    public String getFaculty(){
        return faculty;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public String getDateBirth(){
        return dateBirth;
    }
    public void setDateBirth(String dateBirth){
        this.dateBirth = dateBirth;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "The reader: " + fullName + ", the libraryCardNumber: " + libraryCardNumber + ", the faculty: " + faculty + ", dateBirth: " + dateBirth + ", the phoneNumber: " + phoneNumber + ".";
    }

    public static void main(String[] args) {

    }

    //МЕТОДЫ takeBook

    public void takeBook(int x){                                            //количество по каждому
        System.out.println(fullName + " took " + x + " books.");
    }

    public void returnBook(int y) {                                        //ФИО ВЕРНУЛ 3 КНИГИ
        System.out.println(fullName + " returned " + y + " books.");
    }

    public void takeBook(String... nameBooks){                                    //названия книг и вывод
            System.out.println(fullName + " took book(s): ");
            for(String nameBook : nameBooks){
                System.out.println(nameBook);
            }
    }
    public void returnBook(String... nameBooks){
            System.out.println(fullName + " returned book(s): ");
            for(String nameBook : nameBooks){
                System.out.println(nameBook);
            }
    }
    public void takeBook(Book... books){                                             //обьекты Book и вывод
        System.out.println(fullName + " took book(s): ");
        for (Book book : books) {
            System.out.println(book.getNameBook() + " (" + book.getAuthorBook() + " " + book.getYearPublishing() + "),");
        }
    }

    /*
    public void takeBook(Book... books){                                             //обьекты Book и вывод
            System.out.println(fullName + " took book(s): ");
            for (Book book : books) {
                System.out.println(book);
        }
    }
    public void returnBook(Book... books){                                       //ФИО ВЕРНУЛ ОБЬЕКТЫ ВООК ПЕЧАТАЮТСЯ ВСЕ ПАРАМЕТРЫ КНИГ
            System.out.println(fullName + " returned book(s): ");
                for(Book book : books){
                    System.out.println(book);
                }
    }
     */


    public void returnBook(Book... books) {                                       //ФИО ВЕРНУЛ ОБЬЕКТЫ ВООК ПЕЧАТАЮТСЯ ВСЕ ПАРАМЕТРЫ КНИГ
        System.out.println(fullName + " returned book(s): ");
        for(Book book : books){
            if(book == null){
                System.out.println("null");
                continue;
            }
            System.out.println(book.getNameBook() + " (" + book.getAuthorBook() + " " + book.getYearPublishing() + "),");
        }
    }

}
