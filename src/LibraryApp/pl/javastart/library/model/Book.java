package LibraryApp.pl.javastart.library.model;

import java.util.Objects;

public class Book extends Publication{

    public static final String TYPE = "Książka";

    private String author;
    private int pages;
    private String isbn;

    public Book(String title, String author, int releaseDate,
         int pages, String publisher){
        super(title, releaseDate, publisher);
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author, int releaseDate,
         int pages, String publisher, String isbn){
        this(title, author, releaseDate, pages, publisher);
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, pages, isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pages=" + pages +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public String toCsv() {
        return (TYPE + ";") +
                getTitle() + ";" +
                getPublisher() + ";" +
                getReleaseDate() + ";" +
                author + ";" +
                pages + ";" +
                isbn + "";
    }
}
