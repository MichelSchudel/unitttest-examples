package nl.craftsmen.bookservice;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public void createBook(Book book) {
        bookRepository.createBook(book);
    }
}
