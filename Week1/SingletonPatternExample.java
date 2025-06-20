
class User {

    private static User instance;
    private String username;

    private User(String username) {
        this.username = username;
        System.out.println("User created: " + username);
    }

    public static User getInstance(String username) {
        if (instance == null) {
            instance = new User(username);
        } else {
            System.out.println("User already exists: " + instance.username);
        }
        return instance;
    }

    public void greet() {
        System.out.println("Welcome, " + username);
    }
}

public class SingletonPattern {

    public static void main(String[] args) {
        User u1 = User.getInstance("alice");
        u1.greet();

        User u2 = User.getInstance("bob");
        u2.greet();

        System.out.println("Same user? " + (u1 == u2));
    }
}
