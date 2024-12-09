import java.util.Scanner;

public class Login {
    private Storage storage;

    public Login(Storage storage) {
        this.storage = storage;
    }
    // User registration
    public void registration(String username, String password) {
        if (storage.getUser(username) != null) {
            System.out.println("Username exists!");
        } else {
            storage.addUser(new User(username, password));
            System.out.println("User registered successfully.");
        }
    }
        // User login
    public void loginUser(String username, String password) {
        if (storage.validCredentials(username, password)) {
            System.out.println("Login successful!");
            User user = storage.getUser(username);
        } else {
            System.out.println("Invalid username or password.");
        }
    }
        // BMI calculator input
    public void runBmiCalculator(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in cm: ");
        double height = scanner.nextDouble();

        // BMI formula (weight in lbs, height in cm)
        double heightInMeters = height / 100;
        double bmi = (weight / (heightInMeters * heightInMeters)) * 703;

        user.setBmi(bmi);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
