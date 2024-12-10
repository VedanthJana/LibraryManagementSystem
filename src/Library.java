import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public int getTotalBooks() {
        return books.size();
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public void addBook(Book book) {
        int index = 0;
        while (index < books.size() && books.get(index).getYearOfPublication() < book.getYearOfPublication()) {
            index++;
        }
        books.add(index, book);
    }

    public boolean removeBookByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public boolean updateBookTitle(String oldTitle, String newTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(oldTitle)) {
                book.setTitle(newTitle);
                return true;
            }
        }
        return false;
    }

    public boolean updateBookAuthor(String title, String newAuthor) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setAuthor(newAuthor);
                return true;
            }
        }
        return false;
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}