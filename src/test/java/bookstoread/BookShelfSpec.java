package bookstoread;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("<= Bookshelf Specification =>")
public class BookShelfSpec {
    @Test
    public void shelfEmptyWhenNoBookAdded() throws Exception{
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), () -> "BookShelf should be empty");
    }

    @Test
    public void bookshelfContainsTwoBooksWhenTwoBooksAdded() {
        BookShelf shelf = new BookShelf();
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
        BookShelf shelf = new BookShelf();
        shelf.add();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), () -> "Please, the books ought to be empty");
    }
}

