import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********************************");
        System.out.println("*        THE WORKOUT APP        *");
        System.out.println("*********************************");

        Storage storage = new Storage();
        Scanner scanner = new Scanner(System.in);
        Login login = new Login(storage);

        while (true) {
            System.out.println("1. Register\n2. Login\n3. Exit");
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

                    // Run BMI calculator for the user after login
                    login.runBmiCalculator(user);

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
}
