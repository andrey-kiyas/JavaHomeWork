package com.pb.andrejkijas.hw5;

public class Book {

    public static int countBooks;

    private String BookName;     // - название книги
    private String BookAuthor;   // - автор книги
    private int YearRelease;     // - год издания

    public Book(String BookName, String BookAuthor, int YearRelease){
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.YearRelease = YearRelease;
        countBooks++;
    }

    //"Энциклопедия", "Гусев К. В.", 2010
    public Book(){
        BookName = "Энциклопедия";
        BookAuthor = "Гусев К. В.";
        YearRelease = 2000;
        countBooks++;
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

    //takeBook, который будет принимать количество взятых книг
    public int takeBook() {
        return countBooks;
    }



//    public int takeBook(String... books){
//        return books.length;
//    }

    //String str = String.join(",", arr);

    public String getBookInfo() {
        return BookName + " (" + BookAuthor + " " + YearRelease + " г.)"; // Приключения (Иванов И. И. 2000 г.)
    }
}