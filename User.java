public abstract class User {
    private String name;
    private int userId;
    private String email;
    public User(String name, int userId, String email) {
        this.name = name;
        this.userId = userId;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public abstract void showMenu();
}