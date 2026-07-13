
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        System.out.println("Welcome to the Library System");
        System.out.println("1. Login as Customer");
        System.out.println("2. Login as Librarian");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Enter your userId: ");
            int userId = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter your email: ");
            String email = scanner.nextLine();
            Customer c = new Customer(name, userId, email);
            c.showMenu();
        } else if (choice == 2) {
            System.out.println("Enter your userId: ");
            int userId = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter your email: ");
            String email = scanner.nextLine();
            Librarian l = new Librarian(name, userId, email);
            l.showMenu();
        }
    }
}
