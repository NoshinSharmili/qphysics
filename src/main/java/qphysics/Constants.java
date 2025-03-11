package qphysics;

/**
 * The Constants class provides commonly used physical constants
 * for physics calculations in the qphysics library.
 */
public final class Constants {

    // Universal Constants
    public static final double GRAVITATIONAL_CONSTANT = 6.67430e-11; // N⋅m²/kg²
    public static final double SPEED_OF_LIGHT = 2.99792458e8; // m/s
    public static final double PLANCK_CONSTANT = 6.62607015e-34; // J⋅s
    public static final double ELEMENTARY_CHARGE = 1.602176634e-19; // C
    public static final double AVOGADRO_CONSTANT = 6.02214076e23; // mol⁻¹
    public static final double BOLTZMANN_CONSTANT = 1.380649e-23; // J/K
    public static final double GAS_CONSTANT = 8.314; // J/(mol⋅K)

    // Earth-Specific Constants
    public static final double ACCELERATION_DUE_TO_GRAVITY = 9.80665; // m/s²
    public static final double EARTH_MASS = 5.972e24; // kg
    public static final double EARTH_RADIUS = 6.371e6; // m

    // Electromagnetic Constants
    public static final double PERMITTIVITY_OF_FREE_SPACE = 8.854187817e-12; // F/m
    public static final double PERMEABILITY_OF_FREE_SPACE = 1.2566370614e-6; // N/A²
    public static final double STEFAN_BOLTZMANN_CONSTANT = 5.670374419e-8; // W/m²K⁴

    // Prevent instantiation
    private Constants() {
        throw new UnsupportedOperationException("Constants class cannot be instantiated.");
    }
}
