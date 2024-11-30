public class User {
    private String username;
    private String password;
    private Double bmi;
    private String goal;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.bmi = null; // Initial state indicating no BMI calculated yet
        this.goal = null;
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
    public String getGoal(){
        return goal;
    }
    public void setGoal(String goal){
        this.goal = goal;
    }
}
