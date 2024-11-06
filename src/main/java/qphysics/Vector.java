package qphysics;

public class Vector {
    private final double x;
    private final double y;
    private final double z;

    // Constructors for 2D and 3D vectors
    public Vector(double x, double y) {
        this(x, y, 0);
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // Calculate the magnitude (length) of the vector
    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Returns a unit vector in the same direction as this vector
    public Vector unitVector() {
        double mag = magnitude();
        return new Vector(x / mag, y / mag, z / mag);
    }

    @Override
    public String toString() {
        return String.format("Vector(%.2f, %.2f, %.2f)", x, y, z);
    }
}
