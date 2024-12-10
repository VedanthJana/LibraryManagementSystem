import java.util.*;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private String publisher;
    private int numberOfPages;

    public Book(String title, String author, int yearOfPublication, String publisher, int numberOfPages) {
        if (yearOfPublication < 0 || yearOfPublication > 2024) {
            throw new IllegalArgumentException("Year of Publication must be valid.");
        }
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("Number of Pages must be positive.");
        }
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setYearOfPublication(int newYear) {
        if (newYear < 0 || newYear > 2024) {
            throw new IllegalArgumentException("Year of Publication must be valid.");
        }
        this.yearOfPublication = newYear;
    }

    public void setPublisher(String newPublisher) {
        this.publisher = newPublisher;
    }

    public void setNumberOfPages(int newNumberOfPages) {
        if (newNumberOfPages <= 0) {
            throw new IllegalArgumentException("Number of Pages must be positive.");
        }
        this.numberOfPages = newNumberOfPages;
    }
}

