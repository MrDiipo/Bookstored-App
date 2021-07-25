package bookstoread;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("<= Bookshelf Specification =>")
public class BookShelfSpec {

    private BookShelf shelf;
    private Book effectiveJava;
    private Book codeComplete;
    private Book DesignPatterns;


    @BeforeEach
    void init() throws Exception{
        shelf = new BookShelf();
        effectiveJava = new Book("Effective Java", "Joshua Bloch", LocalDate.of(2008, Month.MAY, 8));
        codeComplete = new Book("Code Complete", "Steve McConnel", LocalDate.of(2004, Month.JUNE, 9));
        DesignPatterns = new Book("Design Patterns in Java", "Dipo Elegbede", LocalDate.of(1998, Month.APRIL, 2));
    }
    @Test
    public void shelfEmptyWhenNoBookAdded() throws Exception{
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), () -> "BookShelf should be empty");
    }

    @Test
    public void bookshelfContainsTwoBooksWhenTwoBooksAdded() {
        shelf.add("Effective Java", "Code Complete");
        List<String> books2 = shelf.books();
        try {
            books2.add("Spring framework reference.");
            fail(()-> "Should not be able to add book to books");
        }catch (Exception e){
            assertTrue( e instanceof UnsupportedOperationException,()-> "Should throw UnsupportedOperationException.");
        }
        assertEquals(2, books2.size(), () -> "Bookshelf should have two books");
    }

    @Test
    public void emptyBookShelfWhenAddIsCalledWithoutBooks(){
        shelf.add();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), () -> "Please, the books ought to be empty");
    }

    @Test
    public void booShelfArrangedByTitle(){
        shelf.add("Effective Java","Code Complete", "Design Patterns in Java");
        shelf.arrange();
        List<String> arrangedBookShelf = shelf.books();
        assertEquals(Arrays.asList("Effective Java","Code Complete", "Design Patterns in Java"), arrangedBookShelf,
                ()-> "The books should be arranged this way");
    }
}

