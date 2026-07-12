public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean isAvailable;
    private String dueDate;
    Book(String title, String author, int isbn, boolean isAvailable, String dueDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
        this.dueDate = dueDate;
        default isAvailable = True;
    }
}