package qphysics;

public class Simulation {

    // Method to simulate the ball throw and return the results
    public static void simulateBallThrow(double initialVelocity) {
        // Use the constants from your Constants class
        double gravity = Constants.ACCELERATION_DUE_TO_GRAVITY; // Use gravity constant from Constants class

        // Calculate the total time to reach the ground
        double totalTime = (2 * initialVelocity) / gravity;


        System.out.println("Time (s) | Distance (m)");

        // Simulate the motion every second
        for (int time = 0; time <= totalTime; time++) {
            // Calculate distance covered at each second
            double distance = initialVelocity * time - 0.5 * gravity * time * time;

            // Print the time and distance in table format
            System.out.printf("%9d | %12.2f\n", time, distance);
        }

        System.out.printf("\nTotal Time: %.2f seconds\n", totalTime);
    }
}
