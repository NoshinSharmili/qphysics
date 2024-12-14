package qphysics;

public class VectorCalculations {

    /**
     * Adds two vectors.
     * @param v1 The first vector
     * @param v2 The second vector
     * @return The resulting vector after addition
     */
    public static Vector vectorAddition(Vector v1, Vector v2) {
        return new Vector(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
    }

    /**
     * Adds three vectors.
     * @param v1 The first vector
     * @param v2 The second vector
     * @param v3 The third vector
     * @return The resulting vector after addition
     */
    public static Vector vectorAddition(Vector v1, Vector v2, Vector v3) {
        return new Vector(v1.getX() + v2.getX() + v3.getX(), v1.getY() + v2.getY() + v3.getY(), v1.getZ() + v2.getZ() + v3.getZ());
    }

    /**
     * Subtracts vector v2 from vector v1.
     * @param v1 The first vector
     * @param v2 The second vector
     * @return The resulting vector after subtraction
     */
    public static Vector vectorSubtraction(Vector v1, Vector v2) {
        return new Vector(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ());
    }

    /**
     * Calculates the dot product of two vectors.
     * @param v1 The first vector
     * @param v2 The second vector
     * @return The dot product (a scalar value)
     */
    public static double dotProduct(Vector v1, Vector v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
    }

    /**
     * Calculates the cross product of two vectors (only meaningful in 3D).
     * @param v1 The first vector
     * @param v2 The second vector
     * @return The resulting vector after cross product
     */
    public static Vector crossProduct(Vector v1, Vector v2) {
        double x = v1.getY() * v2.getZ() - v1.getZ() * v2.getY();
        double y = v1.getZ() * v2.getX() - v1.getX() * v2.getZ();
        double z = v1.getX() * v2.getY() - v1.getY() * v2.getX();
        return new Vector(x, y, z);
    }

    /**
     * Calculates the angle between two vectors in radians.
     * @param v1 The first vector
     * @param v2 The second vector
     * @return The angle in radians
     */
    public static double angleBetweenVectors(Vector v1, Vector v2) {
        double dot = dotProduct(v1, v2);
        double magProduct = v1.magnitude() * v2.magnitude();
        return Math.acos(dot / magProduct);
    }

    /**
     * Scales a vector by a scalar value.
     * @param v The vector to scale
     * @param scalar The scalar value
     * @return The resulting vector after scaling
     */
    public static Vector scalarMultiplication(Vector v, double scalar) {
        return new Vector(v.getX() * scalar, v.getY() * scalar, v.getZ() * scalar);
    }

    /**
     * Projects vector v1 onto vector v2.
     * @param v1 The vector to project
     * @param v2 The vector onto which v1 is projected
     * @return The projection vector
     */
    public static Vector projection(Vector v1, Vector v2) {
        double scale = dotProduct(v1, v2) / Math.pow(v2.magnitude(), 2);
        return scalarMultiplication(v2, scale);
    }
}
