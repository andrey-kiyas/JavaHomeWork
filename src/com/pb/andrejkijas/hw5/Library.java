package com.pb.andrejkijas.hw5;

/**
 * Класс Library используется как демонстрация работы классов Book и Reader.
 * Имеет метод main() в котором создается массивы объектов Book и Reader, по 3 или более элементов в каждом.
 * Выполняются такие действия:
 * - печатаются все книги.
 * - печатаются все читатели.
 * - демонстрируется работа всех вариантов методов takeBook() и returnBook().
 */
public class Library {
    // "Массив книг"
    private static Book[] books = new Book[10];

    // "indexBook" - счетчик внесенных в массив книг
    private static int indexBook = 0;

    // "Массив читателей"
    private static Reader[] readers = new Reader[10];

    // "indexReader" - счетчик внесенных в массив читателей
    private static int indexReader = 0;

    public static void main(String[] args) {
        // Создаем книги
        Book book1 = new Book("Приключения", "Иванов И. И.", 2000);
        Book book2 = new Book("Словарь", "Сидоров А. В.", 1980);
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", 2010);

        // Создаем читателей
        Reader reader1 = new Reader("Петров В. В.", 1, "Отличный", "08.03.1939", "38(063)1234567");
        Reader reader2 = new Reader("Скворцов С. С.", 2, "Хороший", "28.06.1949", "38(050)1234567");
        Reader reader3 = new Reader("Пяточкин А. А.", 3, "Лучший", "07.11.1959", "38(067)1234567");

        // Заносим книги в "массив книг"
        addBook(book1); addBook(book2); addBook(book3);

        // Заносим читателей в "массив читателей"
        addReader(reader1); addReader(reader2); addReader(reader3);

        // Выводим на экран "массив книг"
        System.out.println("\n ------------------------- Печатаются все книги ------------------------- \n");
        printAllBooks();

        System.out.println("\n ----------------------- Печатаются все читатели ------------------------ \n");
        // Выводим на экран "массив читателей"
        printAllReaders();

        System.out.println("\n ---------------- Печатаются все варианты метода \"takeBook\" ------------- \n");
        reader1.takeBook(4);
        reader2.takeBook(book1.getTitle(), book3.getTitle(), book2.getTitle());
        reader3.takeBook(book2, book1, book3);

        System.out.println("\n --------------- Печатаются все варианты метода \"returnBook\" ------------ \n");
        reader2.returnBook(5);
        reader3.returnBook(book3.getTitle(), book2.getTitle(), book1.getTitle());
        reader1.returnBook(book1, book2, book3);
    }

    // Метод наполнения "массива книг" книгами
    private static void addBook(Book book) {
        books[indexBook++] = book;
    }

    // Метод наполнения "массива читателей" читателями
    private static void addReader(Reader reader) {
        readers[indexReader++] = reader;
    }

    // Метод вывода на экран "массива книг"
    public static void printAllBooks() {
        System.out.println("Перечень книг:");
        for (int i = 0; i < indexBook; i++) {
            System.out.println(" - " + books[i]);
        }
    }

    // Метод вывода на экран "массива читателей"
    public static void printAllReaders() {
        System.out.println("Перечень читателей:");
        for (int i = 0; i < indexReader; i++) {
            System.out.println(" - " + readers[i]);
        }
    }
}
