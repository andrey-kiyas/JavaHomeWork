package com.pb.andrejkijas.hw5;

public class Book {
    private String BookName;     // - название книги
    private String BookAuthor;   // - автор книги
    private int YearRelease;     // - год издания

    public Book(String BookName, String BookAuthor, int YearRelease){
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.YearRelease = YearRelease;
    }

    //"Энциклопедия", "Гусев К. В.", 2010
    public Book(){
        BookName = "Энциклопедия";
        BookAuthor = "Гусев К. В.";
        YearRelease = 2000;
    }

    public String getBookName(){
        return BookName;
    }
    public void setBookName(String BookName){
        this.BookName = BookName;
    }


    public String getBookAuthor() {
        return BookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.BookAuthor = bookAuthor;
    }


    public int getYearRelease() {
        return YearRelease;
    }
    public void setYearRelease(int yearRelease) {
        this.YearRelease = yearRelease;
    }

    public void takeBook(String BookName){
        System.out.println("Петров взял книгу: " + BookName);
    }

    public void countBook(String... books){
        System.out.println(books.length);
//        int a = books.length;
//        System.out.println("Чел взял " + a + "книг");
//        System.out.println(books[0]);
    }

    public String getBookInfo() {
        return BookName + " (" + BookAuthor + " " + YearRelease + " г.)"; // Приключения (Иванов И. И. 2000 г.)
    }
}