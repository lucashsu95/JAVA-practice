import java.util.*;
interface Manage {
    List<Book> addBook();
    void borrowBook(int book);
    void returnBook(int book);
    void runBook(String choose);
    int checkBook(String book);
    void addBook(int book);
    int inputBook();
}
