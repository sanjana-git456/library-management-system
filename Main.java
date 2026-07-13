
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        library.addBook(new Book("The Alchemist", "Paulo Coelho", 101));
        library.addBook(new Book("1984", "George Orwell", 102));
        boolean appRunning = true;
        while (appRunning) {
            System.out.println("Welcome to the Library System");
            System.out.println("1. Login as Customer");
            System.out.println("2. Login as Librarian");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter your userId: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter your email: ");
                    String email = scanner.nextLine();
                    Customer c = new Customer(name, userId, email);
                    boolean running = true;
                    while (running) {
                        c.showMenu();
                        System.out.println("Enter your choice: ");
                        int ch = scanner.nextInt();
                        switch (ch) {
                            case 1:
                                library.displayBooks();
                                break;
                            case 2: {
                                System.out.println("Enter ISBN of book you want to checkout: ");
                                int is = scanner.nextInt();
                                library.checkOutBook(is);
                                break;
                            }
                            case 3: {
                                System.out.println("Enter ISBN of book you want to return: ");
                                int is = scanner.nextInt();
                                library.returnBook(is);
                                break;
                            }
                            case 4: {
                                running = false;
                                break;
                            }
                            default:
                                System.out.println("Enter valid choice!");
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter your userId: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter your email: ");
                    String email = scanner.nextLine();
                    Librarian l = new Librarian(name, userId, email);
                    boolean running = true;
                    while (running) {
                        l.showMenu();
                        System.out.println("Enter your choice: ");
                        int ch = scanner.nextInt();
                        scanner.nextLine();
                        switch (ch) {
                            case 1: {
                                System.out.println("Enter title of new book: ");
                                String title = scanner.nextLine();
                                System.out.println("Enter author of new book: ");
                                String author = scanner.nextLine();
                                System.out.println("Enter ISBN of new book: ");
                                int isbn = scanner.nextInt();
                                Book book = new Book(title, author, isbn);
                                library.addBook(book);
                                break;
                            }

                            case 2: {
                                System.out.println("Enter ISBN of book you want to remove: ");
                                int isbn = scanner.nextInt();
                                scanner.nextLine();
                                library.removeBook(isbn);
                                break;
                            }

                            case 3: {
                                library.displayBooks();
                                break;
                            }

                            case 4: {
                                running = false;
                                break;
                            }
                            default:
                                System.out.println("Enter valid choice!");
                        }
                    }
                    break;
                }
                case 3:
                    appRunning = false;
                    break;
                default:
                    System.out.println("Enter valid choice!");
            }
        }
        scanner.close();
    }
}
