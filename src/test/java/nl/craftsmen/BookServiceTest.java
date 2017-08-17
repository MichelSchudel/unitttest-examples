package nl.craftsmen;

import nl.craftsmen.bookservice.Book;
import nl.craftsmen.bookservice.BookRepository;
import nl.craftsmen.bookservice.BookService;
import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    private Book lord_of_the_rings = new Book("Lord of the rings");

    @Test
    public void shouldGetAllBooks() {
        BookRepository bookRepository = mock(BookRepository.class);
        when(bookRepository.getAllBooks()).thenReturn(Collections.singletonList(lord_of_the_rings));
        BookService bookService = new BookService(bookRepository);
        assertThat(bookService.getAllBooks(), containsInAnyOrder(lord_of_the_rings));
    }

    @Test
    public void reallyInterestedInWhatThisServiceIsDoing() {
        BookRepository bookRepository = mock(BookRepository.class);
        when(bookRepository.getAllBooks()).thenReturn(Collections.singletonList(lord_of_the_rings));
        BookService bookService = new BookService(bookRepository);
        assertThat(bookService.getAllBooks(), containsInAnyOrder(lord_of_the_rings));
        verify(bookRepository, times(1)).getAllBooks();
    }

    @Test
    public void insertBook() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        Book the_dark_tower = new Book("The Dark Tower");
        bookService.createBook(the_dark_tower);
        verify(bookRepository, times(1)).createBook(the_dark_tower);
    }
}
