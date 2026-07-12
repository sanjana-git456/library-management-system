import java.util.*;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public Book findbyIsbn(int isbn) {
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        return null;
    }
    public void removeBook(int isbn) {
        Book book = findbyIsbn(isbn);
        if (book == null) {
            System.out.println("Book with isbn " + isbn + "is not there");
        }
        else {
            books.remove(book);
        }
    }
    public void checkOutBook(int isbn) {
        Book book = findbyIsbn(isbn);
        if (book == null) {
            System.out.println("Book with isbn " + isbn + "is not there");
        }
        else if (book.getIsAvailable() == false) {
            System.out.println("Book with isbn " + isbn + "is not available at the moment");
        }
        else {
            book.setIsAvailable(false);
            book.setDueDate("1 week from today");
        }
    }
}