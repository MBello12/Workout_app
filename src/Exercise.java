
public class Exercise {

    // Method to display exercises based on the user's goal
    public static void displayExercises(String goal) {
        System.out.println("\n*** Exercise Plan for " + goal + " ***");

        if (goal.equals("Gain weight")) {
            System.out.println("\n*** Strength Training Exercises (For Muscle Gain) ***");
            displayStrengthTrainingExercises();
            System.out.println("\n*** Cardio Exercises (For Cardiovascular Health) ***");
            displayCardioExercises();
        } else if (goal.equals("Lose weight")) {
            System.out.println("\n*** Strength Training Exercises (For Fat Loss and Toning) ***");
            displayStrengthTrainingExercises();
            System.out.println("\n*** Cardio Exercises (For Fat Loss and Endurance) ***");
            displayCardioExercises();
        } else if (goal.equals("Gain muscle")) {
            System.out.println("\n*** Strength Training Exercises (For Muscle Gain) ***");
            displayStrengthTrainingExercises();
            System.out.println("\n*** Core Workouts (For Muscle Definition) ***");
            displayCoreWorkouts();
        }
    }

    // Strength training exercises
    public static void displayStrengthTrainingExercises() {
        System.out.println("1. Squats");
        System.out.println("   - Stand with feet shoulder-width apart, squat down keeping knees behind toes.");
        System.out.println("   - Benefits: Builds lower body strength, increases muscle mass.");

        System.out.println("2. Bench Press");
        System.out.println("   - Lie on a bench and push the barbell up and down.");
        System.out.println("   - Benefits: Builds upper body strength, particularly chest and arms.");

        System.out.println("3. Deadlifts");
        System.out.println("   - Stand with feet hip-width apart, bend at the hips to lift the barbell.");
        System.out.println("   - Benefits: Strengthens the lower back, glutes, and hamstrings.");

        System.out.println("4. Pull-Ups");
        System.out.println("   - Hang from a bar and pull your body up until your chin is above the bar.");
        System.out.println("   - Benefits: Builds upper body strength and targets back muscles.");
    }

    // Cardio exercises
    public static void displayCardioExercises() {
        System.out.println("1. Running (Treadmill or Outdoor)");
        System.out.println("   - 20-30 minutes at moderate intensity.");
        System.out.println("   - Benefits: Improves cardiovascular health, burns calories.");

        System.out.println("2. Jump Rope");
        System.out.println("   - 5-10 minutes at high intensity.");
        System.out.println("   - Benefits: Improves agility, burns fat, increases stamina.");
    }

    // Core workouts
    public static void displayCoreWorkouts() {
        System.out.println("1. Planks");
        System.out.println("   - Hold the plank position for 30-60 seconds.");
        System.out.println("   - Benefits: Strengthens core muscles, improves stability.");

        System.out.println("2. Russian Twists");
        System.out.println("   - Sit with feet off the ground and twist your torso left and right.");
        System.out.println("   - Benefits: Targets obliques and improves core strength.");
    }
}
