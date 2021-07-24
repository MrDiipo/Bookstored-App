package bookstoread;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainsTwo {
    @Test
    public void bookshelfContainsTwoBooksWhenTwoBooksAdded() {
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        shelf.add("Effective Java");
        shelf.add("Code Complete");

        List<String> books2 = shelf.books();
        assertEquals(2, books2.size(), () -> "Bookshelf should have two books");
    }
}
