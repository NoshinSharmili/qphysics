package qphysics;

public final class Constants {

    /**Universal Constants
    /** Gravitational constant (N⋅m²/kg²) */
    public static final double GRAVITATIONAL_CONSTANT = 6.67430e-11;
    /** Speed of light in vacuum (m/s) */
    public static final double SPEED_OF_LIGHT = 2.99792458e8;
    /** Planck's constant (J⋅s) */
    public static final double PLANCK_CONSTANT = 6.62607015e-34;
    /** Elementary charge (C) */
    public static final double ELEMENTARY_CHARGE = 1.602176634e-19;
    /** Avogadro's constant (mol⁻¹) */
    public static final double AVOGADRO_CONSTANT = 6.02214076e23;
    /** Boltzmann's constant (J/K) */
    public static final double BOLTZMANN_CONSTANT = 1.380649e-23;
    /** Universal gas constant (J/(mol⋅K)) */
    public static final double GAS_CONSTANT = 8.314;

    /**Earth-Specific Constants
    /** Standard acceleration due to gravity on Earth (m/s²) */
    public static final double ACCELERATION_DUE_TO_GRAVITY = 9.80665;
    /** Mass of the Earth (kg) */
    public static final double EARTH_MASS = 5.972e24;
    /** Mean radius of the Earth (m) */
    public static final double EARTH_RADIUS = 6.371e6;

    /** Electromagnetic Constants
    /** Permittivity of free space (F/m) */
    public static final double PERMITTIVITY_OF_FREE_SPACE = 8.854187817e-12;
    /** Permeability of free space (N/A²) */
    public static final double PERMEABILITY_OF_FREE_SPACE = 1.2566370614e-6;
    /** Stefan-Boltzmann constant (W/m²K⁴) */
    public static final double STEFAN_BOLTZMANN_CONSTANT = 5.670374419e-8;

    /**
     * Private constructor to prevent instantiation of the Constants class.
     * This ensures that the class is used only as a container for static values.
     */
    private Constants() {
        throw new UnsupportedOperationException("Constants class cannot be instantiated.");
    }
}
