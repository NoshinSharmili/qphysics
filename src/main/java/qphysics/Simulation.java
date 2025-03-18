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


     /**
     * Simulates collision between two objects.
     *
     * @param mass1     Mass of first object (kg)
     * @param velocity1 Initial velocity of first object (m/s)
     * @param mass2     Mass of second object (kg)
     * @param velocity2 Initial velocity of second object (m/s)
     * @param elastic   True for elastic collision, false for inelastic
     */
    public static void simulateCollision(double mass1, double velocity1, double mass2, double velocity2, boolean elastic) {
        // Print simulation header with initial conditions
        System.out.println("Collision Simulation");
        System.out.println("===================");
        System.out.println("Before collision:");
        System.out.printf("Object 1: mass = %.2f kg, velocity = %.2f m/s\n", mass1, velocity1);
        System.out.printf("Object 2: mass = %.2f kg, velocity = %.2f m/s\n", mass2, velocity2);

        // Calculate initial momentum: p = mv (kg·m/s)
        double momentumBefore = mass1 * velocity1 + mass2 * velocity2;

        // Calculate initial kinetic energy: KE = ½mv² (J)
        double keBefore = 0.5 * mass1 * velocity1 * velocity1 + 0.5 * mass2 * velocity2 * velocity2;

        // Print initial momentum and energy
        System.out.printf("Total momentum before: %.2f kg·m/s\n", momentumBefore);
        System.out.printf("Total kinetic energy before: %.2f J\n", keBefore);

        // Calculate final velocities
        double v1Final, v2Final;

        if (elastic) {
            // Elastic collision formulas (derived from conservation of momentum and energy)
            // v1' = ((m1-m2)v1 + 2m2v2)/(m1+m2)
            v1Final = ((mass1 - mass2) * velocity1 + 2 * mass2 * velocity2) / (mass1 + mass2);

            // v2' = ((m2-m1)v2 + 2m1v1)/(m1+m2)
            v2Final = ((mass2 - mass1) * velocity2 + 2 * mass1 * velocity1) / (mass1 + mass2);
        } else {
            // Inelastic collision (objects stick together)
            // v' = (m1v1 + m2v2)/(m1+m2)
            v1Final = v2Final = (mass1 * velocity1 + mass2 * velocity2) / (mass1 + mass2);
        }

        // Print final velocities
        System.out.println("\nAfter collision:");
        System.out.printf("Object 1: velocity = %.2f m/s\n", v1Final);
        System.out.printf("Object 2: velocity = %.2f m/s\n", v2Final);

        // Calculate final momentum (kg·m/s)
        double momentumAfter = mass1 * v1Final + mass2 * v2Final;

        // Calculate final kinetic energy (J)
        double keAfter = 0.5 * mass1 * v1Final * v1Final + 0.5 * mass2 * v2Final * v2Final;

        // Print final momentum and energy
        System.out.printf("Total momentum after: %.2f kg·m/s\n", momentumAfter);
        System.out.printf("Total kinetic energy after: %.2f J\n", keAfter);

        // Report on energy conservation
        System.out.printf("Kinetic energy %s\n",
                elastic ? "conserved" : "lost: " + (keBefore - keAfter) + " J");
    }


}
