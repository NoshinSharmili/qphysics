package qphysics;

public class Motion {
    /**
     * Calculates the distance covered.
     * @param velocity Velocity in meters per second (m/s)
     * @param time Time in seconds (s)
     * @return Distance in meters (m)
     */
    public static double distance(double velocity, double time) {
        return velocity * time;
    }

    /**
     * Calculates the final velocity.
     * @param initialVelocity Initial velocity in m/s
     * @param acceleration Acceleration in m/s^2
     * @param time Time in seconds
     * @return Final velocity in m/s
     */
    public static double finalVelocity(double initialVelocity, double acceleration, double time) {
        return initialVelocity + acceleration * time;
    }

}