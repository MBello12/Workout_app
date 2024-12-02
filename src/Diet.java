
public class Diet {

    // Method to display the diet plan based on the user's goal and their profile
    public static void displayDietPlan(String goal, User user) {
        System.out.println("\n*** Custom Diet Plan for " + goal + " ***");

        // Customizing the diet based on the goal
        if (goal.equals("Lose weight")) {
            System.out.println("Breakfast: Oatmeal with protein powder, berries, and green tea.");
            System.out.println("Lunch: Grilled chicken with a large salad and avocado.");
            System.out.println("Dinner: Grilled fish with vegetables, quinoa.");
        } else if (goal.equals("Gain weight")) {
            System.out.println("Breakfast: Eggs, avocado toast with some fruit.");
            System.out.println("Lunch: Grilled steak with mashed potatoes and greens.");
            System.out.println("Dinner: Salmon with sweet potatoes.");
        } else if (goal.equals("Gain muscle")) {
            System.out.println("Breakfast: Scrambled eggs with spinach and whole wheat toast.");
            System.out.println("Lunch: Chicken with brown rice and broccoli.");
            System.out.println("Dinner: Lean beef with quinoa and mixed veggies.");
        }

        // Customizing the meal plans based on dietary exceptions (e.g., vegetarian)
        if (!user.getDietaryExceptions().isEmpty()) {
            System.out.println("\nNote: Adjust meal plans based on your dietary exceptions: " + user.getDietaryExceptions());
        }
    }

    // Displaying recommended supplements for the user
    public static void displaySupplements() {
        System.out.println("\n*** Recommended Supplements ***");
        System.out.println("1. Protein Powder (Whey or Plant-Based)");
        System.out.println("2. Creatine");
        System.out.println("3. Multivitamins");
        System.out.println("4. Fish Oil");
    }

    // Displaying a daily workout schedule
    public static void displayWorkoutSchedule() {
        System.out.println("\n*** Daily Workout Schedule ***");
        System.out.println("7:00 AM - Morning Routine: Warm-Up (Jumping Jacks, Dynamic Stretches)");
        System.out.println("7:30 AM - Strength Training (Squats, Bench Press, Deadlifts, Pull-Ups)");
        System.out.println("12:00 PM - Cardio (Running on Treadmill or Outdoor Jogging)");
        System.out.println("12:45 PM - Core Workouts (Planks, Russian Twists, Leg Raises)");
        System.out.println("6:00 PM - Evening Routine: Mobility and Stretching (Foam Rolling, Full-Body Stretching)");
        System.out.println("6:30 PM - Bodyweight Circuit (Push-ups, Squats, Lunges, Tricep Dips)");
    }
}
