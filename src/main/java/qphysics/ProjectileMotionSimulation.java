package qphysics;

public class ProjectileMotionSimulation {

    /**
     * Runs a projectile motion simulation and prints the results.
     * @param velocity Initial velocity (m/s)
     * @param angle Launch angle (degrees)
     * @param timeStep Time step for simulation (seconds)
     */
    public static void simulate(double velocity, double angle, double timeStep) {
        double timeOfFlight = ProjectileMotion.timeOfFlight(velocity, angle);

        System.out.println("\nTime (s) | Height (m) | Distance (m)");
        System.out.println("-------------------------------------");

        for (double t = 0; t <= timeOfFlight; t += timeStep) {
            double[] position = ProjectileMotion.positionAtTime(velocity, angle, t);
            System.out.printf("%7.2f   |   %7.2f   |   %7.2f\n", t, position[1], position[0]);
        }
    }
}
