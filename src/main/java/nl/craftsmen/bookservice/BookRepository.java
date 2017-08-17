package nl.craftsmen.bookservice;

import java.util.Arrays;
import java.util.List;

public class BookRepository {

    public List<Book> getAllBooks() {
        return Arrays.asList(new Book("Lord of the rings"), new Book("The Dark Tower"));
    }

    public void createBook(Book book) {
        //insert some stuff
    }
}
