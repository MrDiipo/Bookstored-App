package bookstoread;

import java.time.LocalDate;

public class Book implements Comparable<Book> {
    // class properties
    private final String title;
    private final String author;
    private final LocalDate publishedOn;
    // constructor
    public Book(String title, String author, LocalDate publishedOn){
        this.author = author;
        this.title = title;
        this.publishedOn = publishedOn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishedOn() {
        return publishedOn;
    }

    @Override
    public int compareTo(Book that){
        return this.title.compareTo(that.title);
    }

    @Override
    public String toString(){
        return "Book{" + "title='" + title + '\'' +", author='" + author + '\'' + ", publishedOn=" + publishedOn + '}';
    }
}
