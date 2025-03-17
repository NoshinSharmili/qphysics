package qphysics;

public class ProjectileMotion {
    private static final double GRAVITY = 9.8;

    // Calculate Time of Flight
    public static double timeOfFlight(double velocity, double angle) {
        double angleRad = Math.toRadians(angle);
        return (2 * velocity * Math.sin(angleRad)) / GRAVITY;
    }

    // Calculate Maximum Height
    public static double maxHeight(double velocity, double angle) {
        double angleRad = Math.toRadians(angle);
        return (velocity * velocity * Math.pow(Math.sin(angleRad), 2)) / (2 * GRAVITY);
    }

    // Calculate Total Range
    public static double totalRange(double velocity, double angle) {
        double angleRad = Math.toRadians(angle);
        return (velocity * velocity * Math.sin(2 * angleRad)) / GRAVITY;
    }

    // Calculate Velocity at any time t
    public static double velocityAtTime(double velocity, double angle, double time) {
        double angleRad = Math.toRadians(angle);
        double vx = velocity * Math.cos(angleRad);
        double vy = velocity * Math.sin(angleRad) - GRAVITY * time;
        return Math.sqrt(vx * vx + vy * vy);
    }

    // Calculate Position at any time t
    public static double[] positionAtTime(double velocity, double angle, double time) {
        double angleRad = Math.toRadians(angle);
        double x = velocity * Math.cos(angleRad) * time;
        double y = velocity * Math.sin(angleRad) * time - 0.5 * GRAVITY * time * time;
        return new double[]{x, Math.max(y, 0)}; // Ensure y is not negative
    }
}