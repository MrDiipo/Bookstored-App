package bookstoread;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsTwo {
    @Test
    public void bookshelfContainsTwoBooksWhenTwoBooksAdded() {
        BookShelf shelf = new BookShelf();
        shelf.add("Effective Java", "Code Complete");

        List<String> books2 = shelf.books();
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
