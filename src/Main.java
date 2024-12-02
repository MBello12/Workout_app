import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("|              THE              |");
        System.out.println("|            WORKOUT            |");
        System.out.println("|              APP              |");
        System.out.println("=================================");
        System.out.println("Test");
        System.out.println("Test2");
        Storage storage = new Storage();
        Scanner scanner = new Scanner(System.in);
        Login login = new Login(storage);

        while (true) {
            System.out.println("1. Register\n2. Login\n3. Exit");
            System.out.println("Enter selection:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                // Register user
                login.registration(username, password);

            } else if (choice == 2) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                // Login user
                if (storage.validCredentials(username, password)) {
                    System.out.println("Login successful!");
                    User user = storage.getUser(username);

                    // Ask for user's age, weight, height, health issues, and dietary exceptions
                    System.out.print("Enter your age: ");
                    user.setAge(scanner.nextInt());
                    System.out.print("Enter your weight in pounds: ");
                    user.setWeight(scanner.nextDouble());
                    System.out.print("Enter your height in cm: ");
                    user.setHeight(scanner.nextDouble());
                    scanner.nextLine(); // Consume newline

                    System.out.print("Do you have any health issues (yes/no): ");
                    String healthAnswer = scanner.nextLine();
                    if (healthAnswer.equalsIgnoreCase("yes")) {
                        System.out.print("Please describe your health issues: ");
                        user.setHealthIssues(scanner.nextLine());
                    }

                    System.out.print("Do you have any dietary exceptions (yes/no): ");
                    String dietaryAnswer = scanner.nextLine();
                    if (dietaryAnswer.equalsIgnoreCase("yes")) {
                        System.out.print("Please describe your dietary exceptions: ");
                        user.setDietaryExceptions(scanner.nextLine());
                    }

                    // Ask for fitness goal
                    System.out.println("What is your fitness goal?");
                    System.out.println("1. Gain weight");
                    System.out.println("2. Lose weight");
                    System.out.println("3. Gain muscle");
                    int goalChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    String goal = "";
                    switch (goalChoice) {
                        case 1:
                            goal = "Gain weight";
                            break;
                        case 2:
                            goal = "Lose weight";
                            break;
                        case 3:
                            goal = "Gain muscle";
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    user.setGoal(goal);

                    // Show personalized diet plan and workouts
                    Diet.displayDietPlan(goal, user);
                    Diet.displaySupplements();
                    Diet.displayWorkoutSchedule();

                    // Display exercises based on user's fitness goal
                    Exercise.displayExercises(goal);

                    // Custom advice based on age, health issues, and dietary exceptions
                    provideCustomAdvice(user);
                } else {
                    System.out.println("Invalid username or password.");
                }

            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    // Custom advice based on user's health issues, age, and dietary exceptions
    public static void provideCustomAdvice(User user) {
        System.out.println("\n*** Custom Advice Based on Your Profile ***");
        if (user.getHealthIssues().isEmpty()) {
            System.out.println("No health issues reported.");
        } else {
            System.out.println("Health Issues: " + user.getHealthIssues());
            System.out.println("Consult a healthcare professional before starting your workout.");
        }

        if (user.getDietaryExceptions().isEmpty()) {
            System.out.println("No dietary exceptions reported.");
        } else {
            System.out.println("Dietary Exceptions: " + user.getDietaryExceptions());
            System.out.println("Consider adjusting your diet plan according to your exceptions.");
        }

        // Custom advice based on age
        if (user.getAge() < 18) {
            System.out.println("You are under 18 years old, please consult a doctor before starting intense workouts.");
        } else if (user.getAge() > 60) {
            System.out.println("You are over 60 years old, consider low-impact exercises and focus on flexibility and balance.");
        } else {
            System.out.println("You're in the optimal age range for most fitness routines. Stay consistent with your plan!");
        }
    }
}
