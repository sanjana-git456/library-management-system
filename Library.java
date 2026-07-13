
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
            System.out.println("Book with ISBN " + isbn + "is not there");
        } else {
            books.remove(book);
        }
    }

    public void checkOutBook(int isbn) {
        Book book = findbyIsbn(isbn);
        if (book == null) {
            System.out.println("Book with ISBN " + isbn + " is not there");
        } else if (book.getIsAvailable() == false) {
            System.out.println("Book with ISBN " + isbn + " is not available at the moment");
        } else {
            book.setIsAvailable(false);
            book.setDueDate("1 week from today");
            System.out.println("Book checked out successfully! Please return the book within " + book.getDueDate());
        }
    }

    public void returnBook(int isbn) {
        Book book = findbyIsbn(isbn);
        if (book == null) {
            System.out.println("Book with ISBN " + isbn + " is not there");
        } else if (book.getIsAvailable() == true) {
            System.out.println("Book with ISBN " + isbn + " was never checked out");
        } else {
            book.setIsAvailable(true);
            book.setDueDate(null);
            System.out.println("Book returned! Thank you!");
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Book ISBN: " + book.getIsbn());
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Book Author: " + book.getAuthor());
            System.out.println("Book Avaialability: " + book.getIsAvailable());
        }
    }
}
