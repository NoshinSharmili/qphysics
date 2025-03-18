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



     /**
     * Simulates projectile motion of an object launched at an angle
     *
     * @param initialVelocity Initial velocity magnitude in meters per second (m/s)
     * @param angleDegrees    Launch angle in degrees (°) from the horizontal
     */
    public static void simulateProjectileMotion(double initialVelocity, double angleDegrees) {
        double gravity = Constants.ACCELERATION_DUE_TO_GRAVITY; // Acceleration due to gravity in m/s²
        double angleRadians = Math.toRadians(angleDegrees); // Convert angle from degrees to radians

        // Calculate initial velocity components using trigonometry
        double vx = initialVelocity * Math.cos(angleRadians); // Horizontal velocity component in m/s (constant)
        double vy = initialVelocity * Math.sin(angleRadians); // Initial vertical velocity component in m/s

        // Calculate total flight time using kinematic equation for vertical motion
        // When projectile hits ground: 0 = vy*t - (1/2)gt²
        // For projectile starting at ground level, this simplifies to t = 2*vy/g
        double totalTime = (2 * vy) / gravity; // Total flight time in seconds (s)

        // Calculate maximum height using kinematic equation: h_max = vy²/(2g)
        double maxHeight = (vy * vy) / (2 * gravity); // Maximum height in meters (m)

        // Calculate range using horizontal distance formula: R = vx * total_time
        double range = vx * totalTime; // Range in meters (m)

        System.out.println("│ Projectile Motion Simulation │");
        System.out.println("├─────────┬─────────┬─────────┬─────────┤");
        System.out.println("│ Time(s) │   X(m)  │   Y(m)  │ Speed(m/s) │");
        System.out.println("├─────────┼─────────┼─────────┼─────────┤");

        // Simulate at regular intervals
        int steps = 20; // Number of simulation steps
        double timeStep = totalTime / steps; // Time interval between steps in seconds (s)

        for (int i = 0; i <= steps; i++) {
            double time = i * timeStep; // Current time in seconds (s)

            // Horizontal position: x = vx * t
            double x = vx * time; // Horizontal position in meters (m)

            // Vertical position: y = vy*t - (1/2)gt²
            double y = vy * time - 0.5 * gravity * time * time; // Vertical position in meters (m)

            // Current vertical velocity: vy_current = vy - g*t
            double vyCurrent = vy - gravity * time; // Current vertical velocity in m/s

            // Calculate instantaneous speed using Pythagorean theorem: v = √(vx² + vy²)
            double speed = Math.sqrt(vx * vx + vyCurrent * vyCurrent); // Speed in m/s

            if (y < 0) y = 0;  // Don't show negative heights (after hitting ground)

            System.out.printf("│ %7.2f │ %7.2f │ %7.2f │ %7.2f │\n", time, x, y, speed);
        }

        System.out.println("└─────────┴─────────┴─────────┴─────────┘");
        System.out.printf("Maximum Height: %.2f meters\n", maxHeight);
        System.out.printf("Range: %.2f meters\n", range);
        System.out.printf("Total Flight Time: %.2f seconds\n\n", totalTime);
    }





    
    /**
     * Simulates the effect of a constant force applied to an object
     *
     * @param mass  Mass of the object in kilograms (kg)
     * @param force Constant force applied to the object in Newtons (N)
     */
    public static void simulateForceAndAcceleration(double mass, double force) {
        // Calculate acceleration using Newton's Second Law: F = ma → a = F/m
        double acceleration = force / mass; // Acceleration in meters per second squared (m/s²)

        System.out.println("│ Force and Acceleration Simulation │");
        System.out.println("├─────────┬─────────┬─────────┬─────────┤");
        System.out.println("│ Time(s) │ Vel(m/s)│ Dist(m) │ KE(J)   │");
        System.out.println("├─────────┼─────────┼─────────┼─────────┤");

        // Simulate for 10 seconds
        for (int time = 0; time <= 10; time++) {
            // Calculate velocity using v = a*t (constant acceleration)
            double velocity = acceleration * time; // Velocity in meters per second (m/s)

            // Calculate distance using d = (1/2)at² (starting from rest)
            double distance = 0.5 * acceleration * time * time; // Distance in meters (m)

            // Calculate kinetic energy using KE = (1/2)mv²
            double kineticEnergy = 0.5 * mass * velocity * velocity; // Kinetic energy in Joules (J)

            System.out.printf("│ %7d │ %7.2f │ %7.2f │ %7.2f │\n", time, velocity, distance, kineticEnergy);
        }

        System.out.println("└─────────┴─────────┴─────────┴─────────┘");
        System.out.printf("Mass: %.2f kg\n", mass);
        System.out.printf("Force: %.2f N\n", force);
        System.out.printf("Acceleration: %.2f m/s²\n\n", acceleration);
    }







}
