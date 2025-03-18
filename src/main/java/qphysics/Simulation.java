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

       //    * @param length Length of the pendulum (m)
//     * @param initialAngleDegrees Initial angle of displacement (degrees)
//     * @param simulationTime Total time to simulate (s)
//     */
    public static void simulatePendulum(double length, double initialAngleDegrees, double simulationTime) {
        // Acceleration due to gravity (m/s²)
        double gravity = Constants.ACCELERATION_DUE_TO_GRAVITY;

        // Convert initial angle from degrees to radians
        double initialAngleRadians = Math.toRadians(initialAngleDegrees);

        // Calculate period of oscillation: T = 2π√(L/g) (s)
        double period = 2 * Math.PI * Math.sqrt(length / gravity);

        // Print simulation header with parameters
        System.out.println("Simple Pendulum Simulation");
        System.out.println("=========================");
        System.out.printf("Length: %.2f m\n", length);
        System.out.printf("Initial angle: %.2f degrees\n", initialAngleDegrees);
        System.out.printf("Period: %.2f seconds\n\n", period);

        // Print table header
        System.out.println("Time (s) | Angle (deg) | Angular Velocity (rad/s)");

        // Simulate pendulum motion at regular time intervals
        for (double time = 0; time <= simulationTime; time += 0.25) {
            // Calculate angle at time t using small-angle approximation:
            // θ(t) = θ₀cos(ωt) where ω = √(g/L) (rad)
            double angle = initialAngleRadians * Math.cos(Math.sqrt(gravity / length) * time);

            // Calculate angular velocity: θ'(t) = -θ₀ω*sin(ωt) (rad/s)
            double angularVelocity = -initialAngleRadians * Math.sqrt(gravity / length) *
                    Math.sin(Math.sqrt(gravity / length) * time);

            // Print time, angle (in degrees), and angular velocity
            System.out.printf("%7.2f | %10.2f | %20.2f\n",
                    time,
                    Math.toDegrees(angle),
                    angularVelocity);
        }
    }

}
