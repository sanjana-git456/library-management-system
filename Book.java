
public class Book {

    private String title;
    private String author;
    private int isbn;
    private boolean isAvailable = true;
    private String dueDate = null;

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setIsAvailable(boolean status) {
        this.isAvailable = status;
    }

    public void setDueDate(String status) {
        this.dueDate = status;
    }
}
