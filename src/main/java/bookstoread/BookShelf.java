package bookstoread;

import java.util.*;
import java.util.stream.Collectors;

public class BookShelf {

    // Field declarations
    private final List<Book> books = new ArrayList<>();

    // Method Declarations
    public List<Book> books() {
        return Collections.unmodifiableList(books);
    }

    public void add(Book... bookToAdd){
        Arrays.stream(bookToAdd).forEach(books::add);
    }

    public List<Book> arrange() {
       return  books.stream().sorted().collect(Collectors.toList());
    }
}
