import java.util.HashMap;

public class Storage {
    private HashMap<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    public User getUser(String username) {
        return users.get(username);
    }

    public boolean validCredentials(String username, String password) {
        User user = getUser(username);
        return user != null && user.getPassword().equals(password);
    }
}
