public class Login {
    private Storage storage;

    public Login(Storage storage) {
        this.storage = storage;
    }

    public void registration(String username, String password) {
        if (storage.getUser(username) != null) {
            System.out.println("Username exists!");
        } else {
            storage.addUser(new User(username, password));
            System.out.println("User registered");
        }
    }

    public void loginUser(String username, String password) {
        if (storage.validCredentials(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
