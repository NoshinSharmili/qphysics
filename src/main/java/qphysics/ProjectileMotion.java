package qphysics;

public class ProjectileMotion {
    private static final double GRAVITY = 9.8; // Acceleration due to gravity (m/s²)

    /**
     * Calculates the time of flight of a projectile.
     * @param velocity Initial velocity in meters per second (m/s)
     * @param angle Launch angle in degrees
     * @return Time of flight in seconds (s)
     */
    public static double timeOfFlight(double velocity, double angle) {
        double angleRad = Math.toRadians(angle);
        return (2 * velocity * Math.sin(angleRad)) / GRAVITY;
    }

    /**
     * Calculates the maximum height reached by the projectile.
     * @param velocity Initial velocity in meters per second (m/s)
     * @param angle Launch angle in degrees
     * @return Maximum height in meters (m)
     */
    public static double maxHeight(double velocity, double angle) {
        double angleRad = Math.toRadians(angle);
        return (velocity * velocity * Math.pow(Math.sin(angleRad), 2)) / (2 * GRAVITY);
    }

    /**
     * Calculates the total range of the projectile.
     * @param velocity Initial velocity in meters per second (m/s)
     * @param angle Launch angle in degrees
     * @return Total range in meters (m)
     */
    public static double totalRange(double velocity, double angle) {
        double angleRad = Math.toRadians(angle);
        return (velocity * velocity * Math.sin(2 * angleRad)) / GRAVITY;
    }

    /**
     * Calculates the velocity of the projectile at a given time.
     * @param velocity Initial velocity in meters per second (m/s)
     * @param angle Launch angle in degrees
     * @param time Time elapsed in seconds (s)
     * @return Velocity in meters per second (m/s)
     */
    public static double velocityAtTime(double velocity, double angle, double time) {
        double angleRad = Math.toRadians(angle);
        double vx = velocity * Math.cos(angleRad);
        double vy = velocity * Math.sin(angleRad) - GRAVITY * time;
        return Math.sqrt(vx * vx + vy * vy);
    }

    /**
     * Calculates the position of the projectile at a given time.
     * @param velocity Initial velocity in meters per second (m/s)
     * @param angle Launch angle in degrees
     * @param time Time elapsed in seconds (s)
     * @return An array containing the x (horizontal) and y (vertical) positions in meters (m)
     */
    public static double[] positionAtTime(double velocity, double angle, double time) {
        double angleRad = Math.toRadians(angle);
        double x = velocity * Math.cos(angleRad) * time;
        double y = velocity * Math.sin(angleRad) * time - 0.5 * GRAVITY * time * time;
        return new double[]{x, Math.max(y, 0)}; // Ensure y is not negative
    }
}
