package com.pb.andrejkijas.hw5;

/**
 * Класс Reader хранит такую информацию о пользователе библиотеки:
 * - ФИО
 * - номер читательского билета
 * - факультет
 * - дата рождения
 * - телефон
 *
 * Имеет перегруженные методы takeBook(), returnBook((sad)
 *
 * - takeBook, который будет принимать количество взятых книг.
 * Выводит на консоль сообщение
 * "Петров В. В. взял 3 книги".
 *
 * - takeBook, который будет принимать переменное количество названий книг.
 * Выводит на консоль сообщение
 * "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 *
 * - takeBook, который будет принимать переменное количество объектов класса Book.
 * Выводит на консоль сообщение
 * "Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
 *
 * Аналогичным образом перегрузить метод returnBook().
 * Должно быть 3 метода returnBook() которые выводит на консоль сообщения:
 * - "Петров В. В. вернул 3 книги"
 * - "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
 * - "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
 */
public class Reader {
    private final String readerFIO;      //- ФИО
    private final int readerNumTick;     //- номер читательского билета
    private final String readerFacult;   //- факультет
    private final String readerDatBirth; //- дата рождения
    private final String readerNumPhone; //- телефон

    public Reader(String readerFIO, int readerNumTick, String readerFacult, String readerDatBirth, String readerNumPhone) {
        this.readerFIO = readerFIO;
        this.readerNumTick = readerNumTick;
        this.readerFacult = readerFacult;
        this.readerDatBirth = readerDatBirth;
        this.readerNumPhone = readerNumPhone;
    }

    public String getReaderFIO() {
        return readerFIO;
    }

    // Приводим к формату схожему с книжным
    public String toString() {
        final StringBuilder SB = new StringBuilder();
        SB.append(readerFIO);
        SB.append("(номер читательского билета: ").append(readerNumTick);
        SB.append(", факультет: ").append(readerFacult);
        SB.append(", дата рождения: ").append(readerDatBirth);
        SB.append(", телефон: ").append(readerNumPhone);
        SB.append(")");
        return SB.toString();
    }

    public void takeBook(int countBook) {
        System.out.printf("%s взял(а) %d книг(и)\n", getReaderFIO(), countBook);
    }

    public void takeBook(String ... titles) {
        String listTitles = "";
        int len = titles.length;
        for (int i = 0; i < len; i++) {
            listTitles += titles[i];
            if (i + 1 != len) {
                listTitles += ", ";
            }
        }
        System.out.printf("%s взял(а) книг(и): %s\n", getReaderFIO(), listTitles);
    }

    public void takeBook(Book ... books) {
        String listBooks = "";
        int len = books.length;
        for (int i = 0; i < len; i++) {
            listBooks += books[i];
            if (i + 1 != len) {
                listBooks += ", ";
            }
        }
        System.out.printf("%s взял(а) книг(и): %s\n", getReaderFIO(), listBooks);
    }

    public void returnBook(int countBook) {
        System.out.printf("%s вернул(а) %d книг(и)\n", getReaderFIO(), countBook);
    }

    public void returnBook(String... titles) {
        String listTitles = "";
        int len = titles.length;
        for (int i = 0; i < len; i++) {
            listTitles += titles[i];
            if (i + 1 != len) {
                listTitles += ", ";
            }
        }
        System.out.printf("%s вернул(а) книг(и): %s\n", getReaderFIO(), listTitles);
    }

    public void returnBook (Book ... books) {
        String listBooks = "";
        int len = books.length;
        for (int i = 0; i < len; i++) {
            listBooks += books[i];
            if (i + 1 != len) {
                listBooks += ", ";
            }
        }
        System.out.printf("%s вернул(а) книг(и): %s\n", getReaderFIO(), listBooks);
    }
}


