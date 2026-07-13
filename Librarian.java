
public class Librarian extends User {

    public Librarian(String name, int userId, String email) {
        super(name, userId, email);
    }

    @Override
    public void showMenu() {
        System.out.println("Librarian Menu");
        System.out.println("----------------------------------");
        System.out.println("Name: " + getName() + " | ID: " + getId());
        System.out.println("1. Add Books");
        System.out.println("2. Remove Book");
        System.out.println("3. Display books");
        System.out.println("4. Exit");
        System.out.println("----------------------------------");
    }
}
