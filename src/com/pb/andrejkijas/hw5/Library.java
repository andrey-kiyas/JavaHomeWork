package com.pb.andrejkijas.hw5;

public class Library {
    public static void main(String[] args) {
        // Определяем кники
        Book book1 = new Book("Приключения", "Иванов И. И.", 2000);
        Book book2 = new Book("Словарь", "Сидоров А. В.", 1980);
        //Book book3 = new Book("Энциклопедия", "Гусев К. В.", 2010);
        Book book3 = new Book();

        //Определяем читателя
        Reader reader1 = new Reader();






        //int colBooks = book1.takeBook(book1.getBookName(), book2.getBookName(), book3.getBookName());
        //System.out.println(reader1.getReaderFIO() + " взял " + colBooks + " книги");
        System.out.println(reader1.getReaderFIO() + " взял " + book2.takeBook() + " книги");









        //System.out.println(Book.countBooks);

        //System.out.println();
        //reader1.getReaderFIO();

//        String[] array = new String[3];
//        array[0] = book1.getBookInfo();
//        array[1] = book2.getBookInfo();
//        array[2] = book3.getBookInfo();
//        System.out.println(Arrays.toString(array));

//        book1.setBookName("Приключения");
//        book1.setBookAuthor("Иванов И. И.");
//        book1.setYearRelease(2000);
//        book1.bookName = "Приключения";
//        book1.bookAuthor = "Иванов И. И.";
//        book1.yearRelease = 2000;

//        book2.bookName = "Словарь";
//        book3.bookName = "Энциклопедия";

//        //System.out.println(book1.bookName);
//        System.out.println(book1.getBookInfo());
//        //System.out.println(book2.bookName);
//        System.out.println(book2.getBookInfo());
//        //System.out.println(book3.bookName);
//        System.out.println(book3.getBookInfo());


//        System.out.println(reader1.readerFIO);
//        System.out.println(reader1.readerDatBirth + " " + reader1.readerFIO);

        //book1.takeBook("Приключения");
//takeBook(), returnBook()
    }
}
