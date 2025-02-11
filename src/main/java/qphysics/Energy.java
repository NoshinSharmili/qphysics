package qphysics;

public class Energy {

    /**
     * Calculates kinetic energy.
     * @param mass Mass in kilograms (kg)
     * @param velocity Velocity in meters per second (m/s)
     * @return Kinetic energy in joules (J)
     */
    public static double kineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    /**
     * Calculates potential energy.
     * @param mass Mass in kilograms (kg)
     * @param height Height in meters (m)
     * @param gravity Acceleration due to gravity in meters per second squared (m/s^2), default is Earth's gravity (9.81 m/s^2)
     * @return Potential energy in joules (J)
     */
    public static double potentialEnergy(double mass, double height, double gravity) {
        return mass * gravity * height;
    }

    /**
     * Calculates gravitational potential energy using universal gravitation formula.
     * @param mass1 Mass of the first object in kilograms (kg)
     * @param mass2 Mass of the second object in kilograms (kg)
     * @param distance Distance between the objects in meters (m)
     * @return Gravitational potential energy in joules (J)
     */
    public static double gravitationalPotentialEnergy(double mass1, double mass2, double distance) {
        final double G = 6.67430e-11; // Gravitational constant in m^3 kg^-1 s^-2
        return - (G * mass1 * mass2) / distance;
    }

    /**
     * Calculates elastic potential energy using Hooke's law.
     * @param springConstant Spring constant in newtons per meter (N/m)
     * @param displacement Displacement from equilibrium in meters (m)
     * @return Elastic potential energy in joules (J)
     */
    public static double elasticPotentialEnergy(double springConstant, double displacement) {
        return 0.5 * springConstant * Math.pow(displacement, 2);
    }

    /**
     * Calculates work done.
     * @param force Applied force in newtons (N)
     * @param displacement Displacement in meters (m)
     * @param angle Angle between force and displacement in degrees
     * @return Work done in joules (J)
     */
    public static double workDone(double force, double displacement, double angle) {
        return force * displacement * Math.cos(Math.toRadians(angle));
    }

    /**
     * Calculates power.
     * @param workDone Work done in joules (J)
     * @param time Time taken in seconds (s)
     * @return Power in watts (W)
     */
    public static double power(double workDone, double time) {
        return workDone / time;
    }

    /**
     * Calculates power using force and velocity.
     * @param force Applied force in newtons (N)
     * @param velocity Velocity in meters per second (m/s)
     * @return Power in watts (W)
     */
    public static double powerUsingForce(double force, double velocity) {
        return force * velocity;
    }

    /**
     * Calculates mechanical energy as the sum of kinetic and potential energy.
     * @param kineticEnergy Kinetic energy in joules (J)
     * @param potentialEnergy Potential energy in joules (J)
     * @return Mechanical energy in joules (J)
     */
    public static double mechanicalEnergy(double kineticEnergy, double potentialEnergy) {
        return kineticEnergy + potentialEnergy;
    }
}
