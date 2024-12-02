import java.util.Scanner;

public class Exercise {

    // Method to display exercises based on the user's goal
    public static void displayExercises(String goal) {
        System.out.println("\n*** Exercise Plan for " + goal + " ***");

        if (goal.equalsIgnoreCase("Gain weight")) {
            System.out.println("\n*** Strength Training Exercises (For Muscle Gain) ***");
            displayStrengthTrainingExercises();
            System.out.println("\n*** Cardio Exercises (For Cardiovascular Health) ***");
            displayCardioExercises();
        } else if (goal.equalsIgnoreCase("Lose weight")) {
            System.out.println("\n*** Strength Training Exercises (For Fat Loss and Toning) ***");
            displayStrengthTrainingExercises();
            System.out.println("\n*** Cardio Exercises (For Fat Loss and Endurance) ***");
            displayCardioExercises();
        } else if (goal.equalsIgnoreCase("Build Strength")) {
            System.out.println("\n*** Strength Training Exercises (For Muscle Gain) ***");
            displayStrengthTrainingExercises();
            System.out.println("\n*** Core Workouts (For Muscle Definition) ***");
            displayCoreWorkouts();
        }

        // Offer specialized upper body workout options
        displayUpperBodyOptions();
    }

    // Strength training exercises
    public static void displayStrengthTrainingExercises() {
        System.out.println("1. Squats");
        System.out.println("2. Bench Press");
        System.out.println("3. Deadlifts");
        System.out.println("4. Pull-Ups");
    }

    // Cardio exercises
    public static void displayCardioExercises() {
        System.out.println("1. Running (Treadmill or Outdoor)");
        System.out.println("2. Jump Rope");
    }

    // Core workouts
    public static void displayCoreWorkouts() {
        System.out.println("1. Planks");
        System.out.println("2. Russian Twists");
    }

    // Upper body workout selection
    public static void displayUpperBodyOptions() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWould you like to target a specific upper body muscle group?");
        System.out.println("1. Chest\n2. Shoulders\n3. Back\n4. Biceps\n5. Triceps\n6. Skip");
        System.out.print("Enter your choice (1-6): ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> displayChestWorkouts();
            case 2 -> displayShoulderWorkouts();
            case 3 -> displayBackWorkouts();
            case 4 -> displayBicepWorkouts();
            case 5 -> displayTricepWorkouts();
            case 6 -> System.out.println("Skipping upper body workouts.");
            default -> System.out.println("Invalid choice. Returning to main plan.");
        }
    }

    // Specific workout categories
    public static void displayChestWorkouts() {
        System.out.println("Recommended Chest Exercises:");
        System.out.println("1. Bench Press 4x6");
        System.out.println("2. Push-ups 3 x failure");
        System.out.println("3. Chest Flies 4x12");
        System.out.println("4. Incline Bench Press 4x6");
    }

    public static void displayShoulderWorkouts() {
        System.out.println("Recommended Shoulder Exercises:");
        System.out.println("1. Shoulder Press 4x12");
        System.out.println("2. Lateral Raises 4x failure");
        System.out.println("3. Front Raises 4x failure");
        System.out.println("4. Arnold Press 4x failure");
    }

    public static void displayBackWorkouts() {
        System.out.println("Recommended Back Exercises:");
        System.out.println("1. Seated Cable Rows 4x8");
        System.out.println("2. Pull-ups 4 x failure");
        System.out.println("3. Bent-over Rows 4x8");
        System.out.println("4. Lat Pulldowns 4x8");
    }

    public static void displayBicepWorkouts() {
        System.out.println("Recommended Bicep Exercises:");
        System.out.println("1. Barbell Curls 4x failure");
        System.out.println("2. Dumbbell Curls 4x failure");
        System.out.println("3. Hammer Curls 4x failure");
        System.out.println("4. Preacher Curls 4x failure");
    }

    public static void displayTricepWorkouts() {
        System.out.println("Recommended Tricep Exercises:");
        System.out.println("1. Tricep Dips 4 x failure");
        System.out.println("2. Tricep Pushdowns 4x failure");
        System.out.println("3. Skull Crushers 4x failure");
        System.out.println("4. Dips 4 x failure");
    }
}
