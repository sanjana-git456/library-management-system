
public class Librarian extends User {

    public Librarian(String name, int userId, String email) {
        super(name, userId, email);
    }

    @Override
    public void showMenu() {
        System.out.println("Librarian Menu");
        System.out.println("Name: " + getName() + " | ID: " + getId());
        System.out.println("1. Add Books  2. Remove Book  3. View Circulation Records  4. Exit");
    }
}
