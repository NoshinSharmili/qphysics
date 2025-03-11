package qphysics;

public class Force {

    /**
     * Calculates force using Newton's second law of motion.
     * @param mass Mass in kilograms (kg)
     * @param acceleration Acceleration in meters per second squared (m/s^2)
     * @return Force in newtons (N)
     */
    public static double force(double mass, double acceleration) {
        return mass * acceleration;
    }

    /**
     * Calculates gravitational force between two masses.
     * @param mass1 Mass of the first object in kilograms (kg)
     * @param mass2 Mass of the second object in kilograms (kg)
     * @param distance Distance between the objects in meters (m)
     * @return Gravitational force in newtons (N)
     */
    public static double gravitationalForce(double mass1, double mass2, double distance) {
        final double G = 6.67430e-11; // Gravitational constant in m^3 kg^-1 s^-2
        return G * mass1 * mass2 / Math.pow(distance, 2);
    }

    /**
     * Calculates frictional force.
     * @param coefficientOfFriction Coefficient of friction (dimensionless)
     * @param normalForce Normal force in newtons (N)
     * @return Frictional force in newtons (N)
     */
    public static double friction(double coefficientOfFriction, double normalForce) {
        return coefficientOfFriction * normalForce;
    }

    /**
     * Calculates spring force using Hooke's law.
     * @param springConstant Spring constant in newtons per meter (N/m)
     * @param displacement Displacement from equilibrium in meters (m)
     * @return Spring force in newtons (N)
     */
    public static double springForce(double springConstant, double displacement) {
        return -springConstant * displacement;
    }

    /**
     * Calculates centripetal force.
     * @param mass Mass in kilograms (kg)
     * @param velocity Velocity in meters per second (m/s)
     * @param radius Radius of the circular path in meters (m)
     * @return Centripetal force in newtons (N)
     */
    public static double centripetalForce(double mass, double velocity, double radius) {
        return mass * Math.pow(velocity, 2) / radius;
    }

    /**
     * Calculates electrostatic force between two charges.
     * @param charge1 Charge of the first object in coulombs (C)
     * @param charge2 Charge of the second object in coulombs (C)
     * @param distance Distance between the charges in meters (m)
     * @return Electrostatic force in newtons (N)
     */
    public static double electrostaticForce(double charge1, double charge2, double distance) {
        final double k = 8.987551787e9; // Coulomb's constant in N m^2 C^-2
        return k * charge1 * charge2 / Math.pow(distance, 2);
    }

    /**
     * Calculates drag force.
     * @param dragCoefficient Drag coefficient (dimensionless)
     * @param fluidDensity Density of the fluid in kilograms per cubic meter (kg/m^3)
     * @param velocity Velocity of the object in meters per second (m/s)
     * @param crossSectionalArea Cross-sectional area in square meters (m^2)
     * @return Drag force in newtons (N)
     */
    public static double dragForce(double dragCoefficient, double fluidDensity, double velocity, double crossSectionalArea) {
        return 0.5 * dragCoefficient * fluidDensity * Math.pow(velocity, 2) * crossSectionalArea;
    }

    /**
     * Calculates torque.
     * @param force Force applied in newtons (N)
     * @param distance Distance from pivot point in meters (m)
     * @return Torque in newton-meters (Nm)
     */
    public static double torque(double force, double distance) {
        return force * distance;
    }

    /**
     * Calculates net force as the vector sum of multiple forces.
     * @param forces Array of individual forces in newtons (N)
     * @return Net force in Newtons (N)
     */
    public static double netForce(double[] forces) {
        double sum = 0;
        for (double force : forces) {
            sum += force;
        }
        return sum;
    }
}
