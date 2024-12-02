
public class User {
    private String username;
    private String password;
    private Double bmi;
    private String goal;
    private int age;
    private double weight; // in lbs
    private double height; // in cm
    private String healthIssues;
    private String dietaryExceptions;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.bmi = null; // Initial state indicating no BMI calculated yet
        this.goal = null;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.healthIssues = "";
        this.dietaryExceptions = "";
    }

    // Getters and setters for new fields
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHealthIssues() {
        return healthIssues;
    }

    public void setHealthIssues(String healthIssues) {
        this.healthIssues = healthIssues;
    }

    public String getDietaryExceptions() {
        return dietaryExceptions;
    }

    public void setDietaryExceptions(String dietaryExceptions) {
        this.dietaryExceptions = dietaryExceptions;
    }

    // Existing methods for username, password, BMI, goal
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

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}
