import java.util.Scanner;

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
            User user = storage.getUser(username);

            runBmiCalculator(user); // Run BMI calculator after login
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void runBmiCalculator(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.println(weight);

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.println(height);

        double bmi = weight / (height * height);
        user.setBmi(bmi); // Save BMI to user

        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Display BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        System.out.println("BMI has been recorded.");

        // Prompt user for fitness goal
        System.out.println("What is your fitness goal?");
        System.out.println("1. Gain weight");
        System.out.println("2. Lose weight");
        System.out.println("3. Gain muscle");
        int goalChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (goalChoice) {
            case 1:
                user.setGoal("Gain weight");
                break;
            case 2:
                user.setGoal("Lose weight");
                break;
            case 3:
                user.setGoal("Gain muscle");
                break;
            default:
                System.out.println("Invalid choice, no goal set.");
        }
        System.out.println("Your goal is: " + user.getGoal());
        System.out.println("Goal has been recorded.");
    }
}