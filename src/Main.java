import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Scanner scanner = new Scanner(System.in);

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
                if (storage.getUser(username) == null) {
                    User newUser = new User(username, password);
                    storage.addUser(newUser);
                    System.out.println("User registered successfully.");
                } else {
                    System.out.println("Username already exists!");
                }

            } else if (choice == 2) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                // Login user
                if (storage.validCredentials(username, password)) {
                    System.out.println("Login successful!");
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
