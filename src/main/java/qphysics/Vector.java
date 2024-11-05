package qphysics;

import static java.lang.Math.*;

public class Vector {
    private double[] data;
    private int size;

    /**
     * Instantiates a new Vector.
     *
     * @param data the data
     */
    public Vector(double[] data) {
        this.data = data;
        this.size = data.length;
    }

    /**
     * Instantiates a new Vector.
     *
     * @param size the size
     */
    public Vector(int size) {
        this.size = size;
        this.data = new double[size];
    }

    /**
     * Gets component.
     *
     * @param index the index
     * @return the component
     */
    public double getComponent(int index) {
        return this.data[index];
    }

    /**
     * Sets component.
     *
     * @param index the index
     * @param value the value
     */
    public void setComponent(int index, double value) {
        this.data[index] = value;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Add vector.
     *
     * @param other the other vector
     * @return the vector
     */
    public Vector vectorAddition(Vector other) {
        if (this.size != other.size) {
            throw new IllegalArgumentException("Vectors must be of same size");
        } else {
            Vector result = new Vector(this.size);
            for (int i = 0; i < this.size; i++) {
                result.data[i] = this.data[i] + other.data[i];
            }
            return result;
        }
    }

    /**
     * Subtract vector.
     *
     * @param other the other vector
     * @return the vector
     */
    public Vector vectorSubtraction(Vector other) {
        if (this.size != other.size) {
            throw new IllegalArgumentException("Vectors must be of same size");
        } else {
            Vector result = new Vector(this.size);
            for (int i = 0; i < this.size; i++) {
                result.data[i] = this.data[i] - other.data[i];
            }
            return result;
        }
    }

    /**
     * dot product double.
     *
     * @param other the other vector
     * @return the dot product in double
     */
    public double dotProduct(Vector other) {
        if (this.size != other.size) {
            throw new IllegalArgumentException("Vectors must be of same size");
        } else {
            double result = 0;
            for (int i = 0; i < this.size; i++) {
                result += this.data[i] * other.data[i];
            }
            return result;
        }
    }

    /**
     * Cross product of vector.
     * @param other the other vector
     * @return the vector
     */
    public Vector crossProduct(Vector other) {
        if (this.size != 3 || other.size != 3) {
            throw new IllegalArgumentException("Vectors must be of size 3");
        } else {
            Vector result = new Vector(3);
            result.data[0] = this.data[1] * other.data[2] - this.data[2] * other.data[1];
            result.data[1] = this.data[2] * other.data[0] - this.data[0] * other.data[2];
            result.data[2] = this.data[0] * other.data[1] - this.data[1] * other.data[0];
            return result;
        }
    }

    /**
     * calculate the magnitude
     * @return the magnitude in double
     */
    public double getMagnitude() {
        double result = 0;
        for (int i = 0; i < this.size; i++) {
            result += this.data[i] * this.data[i];
        }
        return sqrt(result);
    }

    /**
     * Get unit vector.
     *
     * @return other the other vector
     */
    public Vector getUnitVector() {
        Vector result = new Vector(this.size);
        double magnitude = this.getMagnitude();
        for (int i = 0; i < this.size; i++) {
            result.data[i] = this.data[i] / magnitude;
        }
        return result;
    }



    /**
     * Calculates the angle between two vectors in radians.
     * @param other the other vector
     * @return The angle between the vectors in radians.
     */
    public double angleBetween(Vector other) {
        // Check that the vectors are of the same size
        if (this.getSize() != other.getSize()) {
            throw new IllegalArgumentException("Vectors must be of the same size.");
        }
        double dotProduct= this.dotProduct(other);
        double cosTheta = dotProduct/ (this.getMagnitude() *other.getMagnitude());
        return cosTheta;
    }

    /**
     * Scale.
     * @param value the value
     */
    public void scale(double value){
        for(int i = 0; i < this.size; i++){
            this.data[i] *= value;
        }
    }



    /**
     * Get scaled vector.
     * @param value the value
     * @return the vector
     */
    public Vector getScaled(double value){
        Vector result = new Vector(this.size);
        for(int i = 0; i < this.size; i++){
            result.data[i] = this.data[i] * value;
        }
        return result;
    }


    /**
     * Print vector.
     */
    public void printVector(){
        System.out.print("[");
        for(int i = 0; i < this.size; i++){
            System.out.print(this.data[i]);
            if(i != this.size - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * check if two vectors are equal
     *
     * @param other the other vector
     * @return true or false
     */

    public boolean isEqual(Vector other) {
        if (this.size != other.size) {
            return false;
        } else {
            for (int i = 0; i < this.size; i++) {
                if (this.data[i] != other.data[i]) {
                    return false;
                }
            }
            return true;
        }
    }

}
