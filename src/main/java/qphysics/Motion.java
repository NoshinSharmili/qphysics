package qphysics;

public class Motion {

    /**
     * Calculates the final velocity.
     * @param initialVelocity Initial velocity in meters per second (m/s)
     * @param time Time in seconds (s)
     * @param acceleration Acceleration in meters per second squared (m/s^2)
     * @return Final velocity in meters per second (m/s)
     */
    public static double finalVelocity(double initialVelocity, double time, double acceleration) {
        return initialVelocity + acceleration * time;
    }

    /**
     * Calculates the final velocity.
     * @param initialVelocity Initial velocity in meters per second (m/s)
     * @param displacement Displacement in meters (m)
     * @param acceleration Acceleration in meters per second squared (m/s^2)
     * @return Final velocity in meters per second (m/s)
     */
    public static double finalVelocityUsingDisplacement(double initialVelocity, double displacement, double acceleration) {
        return Math.sqrt(Math.pow(initialVelocity, 2) + 2 * acceleration * displacement);
    }

    /**
     * Calculates the displacement.
     * @param initialVelocity Initial velocity in meters per second (m/s)
     * @param time Time in seconds (s)
     * @param acceleration Acceleration in meters per second squared (m/s^2)
     * @return Displacement in meters (m)
     */
    public static double displacement(double initialVelocity, double time, double acceleration) {
        return initialVelocity * time + 0.5 * acceleration * Math.pow(time, 2);
    }

    /**
     * Calculates the displacement.
     * @param initialVelocity Initial velocity in meters per second (m/s)
     * @param finalVelocity Final velocity in meters per second (m/s)
     * @param acceleration Acceleration in meters per second squared (m/s^2)
     * @return Displacement in meters (m)
     */
    public static double displacementUsingFinalVelocity(double initialVelocity, double finalVelocity, double acceleration) {
        return (Math.pow(finalVelocity, 2) - Math.pow(initialVelocity, 2)) / (2 * acceleration);
    }

    /**
     * Calculates the acceleration.
     * @param finalVelocity Final velocity in meters per second (m/s)
     * @param initialVelocity Initial velocity in meters per second (m/s)
     * @param time Time in seconds (s)
     * @return Acceleration in meters per second squared (m/s^2)
     */
    public static double acceleration(double finalVelocity, double initialVelocity, double time) {
        return (finalVelocity - initialVelocity) / time;
    }

    /**
     * Calculates the acceleration.
     * @param displacement Displacement in meters (m)
     * @param initialVelocity Initial velocity in meters per second (m/s)
     * @param time Time in seconds (s)
     * @return Acceleration in meters per second squared (m/s^2)
     */
    public static double accelerationUsingDisplacement(double displacement, double initialVelocity, double time) {
        return (2 * (displacement - initialVelocity * time)) / Math.pow(time, 2);
    }

    /**
     * Calculates the time taken.
     * @param initialVelocity Initial velocity in meters per second (m/s)
     * @param finalVelocity Final velocity in meters per second (m/s)
     * @param acceleration Acceleration in meters per second squared (m/s^2)
     * @return Time taken in seconds (s)
     */
    public static double time(double initialVelocity, double finalVelocity, double acceleration) {
        return (finalVelocity - initialVelocity) / acceleration;
    }

    /**
     * Calculates the average velocity.
     * @param initialVelocity Initial velocity in meters per second (m/s)
     * @param finalVelocity Final velocity in meters per second (m/s)
     * @return Average velocity in meters per second (m/s)
     */
    public static double averageVelocity(double initialVelocity, double finalVelocity) {
        return (initialVelocity + finalVelocity) / 2;
    }

    /**
     * Calculates the rotational velocity.
     * @param angularVelocity Angular velocity in radians per second (rad/s)
     * @param time Time in seconds (s)
     * @param angularAcceleration Angular acceleration in radians per second squared (rad/s^2)
     * @return Rotational velocity in radians per second (rad/s)
     */
    public static double rotationalVelocity(double angularVelocity, double time, double angularAcceleration) {
        return angularVelocity + angularAcceleration * time;
    }
}
