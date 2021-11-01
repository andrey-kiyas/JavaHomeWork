package com.pb.andrejkijas.hw5;

/**
 * Класс Book хранит такую информацию о книге:
 * - название
 * - автор книги
 * - год издания
 */
public class Book {
    private final String BookName;     // - название книги
    private final String BookAuthor;   // - автор книги
    private final int YearRelease;     // - год издания

    public Book(String BookName, String BookAuthor, int YearRelease) {
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.YearRelease = YearRelease;
    }

    public String getTitle() {
        return BookName;
    }


    // Приводим к формату "Название книги (Автор, год издания)"
    public String toString() {
        final StringBuilder SB = new StringBuilder();
        SB.append(BookName);
        SB.append(" (").append(BookAuthor);
        SB.append(", ").append(YearRelease);
        SB.append(" г.)");
        return SB.toString();
    }
}