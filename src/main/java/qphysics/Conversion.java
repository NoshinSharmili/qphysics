package qphysics;

/**
 * The Conversion module provides methods for converting between various units
 * including length, temperature, energy, force, time, and angles.
 * Each method takes input in one unit and returns the equivalent value in another unit.
 */
public class Conversion {

    /**
     * Converts meters to kilometers.
     * @param meters Length in meters (m)
     * @return Length in kilometers (km)
     */
    public static double metersToKilometers(double meters) {
        return meters / 1000;
    }

    /**
     * Converts kilometers to meters.
     * @param kilometers Length in kilometers (km)
     * @return Length in meters (m)
     */
    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }

    /**
     * Converts meters to miles.
     * @param meters Length in meters (m)
     * @return Length in miles (mi)
     */
    public static double metersToMiles(double meters) {
        return meters / 1609.34;
    }

    /**
     * Converts miles to meters.
     * @param miles Length in miles (mi)
     * @return Length in meters (m)
     */
    public static double milesToMeters(double miles) {
        return miles * 1609.34;
    }

    /**
     * Converts Celsius to Fahrenheit.
     * @param celsius Temperature in degrees Celsius (°C)
     * @return Temperature in degrees Fahrenheit (°F)
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Converts Fahrenheit to Celsius.
     * @param fahrenheit Temperature in degrees Fahrenheit (°F)
     * @return Temperature in degrees Celsius (°C)
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Converts joules to calories.
     * @param joules Energy in joules (J)
     * @return Energy in calories (cal)
     */
    public static double joulesToCalories(double joules) {
        return joules / 4.184;
    }

    /**
     * Converts calories to joules.
     * @param calories Energy in calories (cal)
     * @return Energy in joules (J)
     */
    public static double caloriesToJoules(double calories) {
        return calories * 4.184;
    }

    /**
     * Converts newtons to pounds-force.
     * @param newtons Force in newtons (N)
     * @return Force in pounds-force (lbf)
     */
    public static double newtonsToPounds(double newtons) {
        return newtons * 0.224809;
    }

    /**
     * Converts pounds-force to newtons.
     * @param pounds Force in pounds-force (lbf)
     * @return Force in newtons (N)
     */
    public static double poundsToNewtons(double pounds) {
        return pounds / 0.224809;
    }

    /**
     * Converts seconds to minutes.
     * @param seconds Time in seconds (s)
     * @return Time in minutes (min)
     */
    public static double secondsToMinutes(double seconds) {
        return seconds / 60;
    }

    /**
     * Converts minutes to seconds.
     * @param minutes Time in minutes (min)
     * @return Time in seconds (s)
     */
    public static double minutesToSeconds(double minutes) {
        return minutes * 60;
    }

    /**
     * Converts degrees to radians.
     * @param degrees Angle in degrees (°)
     * @return Angle in radians (rad)
     */
    public static double degreesToRadians(double degrees) {
        return Math.toRadians(degrees);
    }

    /**
     * Converts radians to degrees.
     * @param radians Angle in radians (rad)
     * @return Angle in degrees (°)
     */
    public static double radiansToDegrees(double radians) {
        return Math.toDegrees(radians);
    }
    // Power Conversions
    /**
     * Converts watts to horsepower.
     * @param watts Power in watts (W)
     * @return Power in horsepower (hp)
     */
    public static double wattsToHorsePower(double watts) {
        return watts / 745.7;
    }

    /**
     * Converts horsepower to watts.
     * @param horsepower Power in horsepower (hp)
     * @return Power in watts (W)
     */
    public static double horsePowerToWatts(double horsepower) {
        return horsepower * 745.7;
    }

    // Volume Conversions
    /**
     * Converts liters to gallons.
     * @param liters Volume in liters (L)
     * @return Volume in gallons (gal)
     */
    public static double litersToGallons(double liters) {
        return liters / 3.78541;
    }

    /**
     * Converts gallons to liters.
     * @param gallons Volume in gallons (gal)
     * @return Volume in liters (L)
     */
    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Mass Conversions
    /**
     * Converts kilograms to pounds.
     * @param kilograms Mass in kilograms (kg)
     * @return Mass in pounds (lb)
     */
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    /**
     * Converts pounds to kilograms.
     * @param pounds Mass in pounds (lb)
     * @return Mass in kilograms (kg)
     */
    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }
}

