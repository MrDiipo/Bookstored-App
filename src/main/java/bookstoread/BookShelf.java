package bookstoread;

import java.util.*;
import java.util.stream.Collectors;

public class BookShelf {
    // Field declarations
    private final List<String> books = new ArrayList<>();
    // Method Declarations
    public List<String> books() {
        return Collections.unmodifiableList(books);
    }
    public void add(String... bookToAdd){
        books.addAll(Arrays.asList(bookToAdd));
    }

    public List<String> arrange() {
       return books.stream().sorted().collect(Collectors.toList());
    }
}
