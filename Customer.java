import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    private List<Book> borrowedBooks;

    public Customer(String name, int userId, String email) {
        super(name, userId, email);
        this.borrowedBooks = new ArrayList<>();
    }
    @Override
    public void showMenu() {
        System.out.println("Customer Menu");
        System.out.println("Name: " + getName() + " | ID: " + getId());
        System.out.println("1. Browse Books  2. Checkout Book  3. Return Book");
    }
}
