public class User {
    private String username;
    private String password;
    private Double bmi;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.bmi = null; // Initial state indicating no BMI calculated yet
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Double getBmi() {
        return bmi;
    }

    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }
}
