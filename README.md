
# qphysics - A Java Physics Library

Version: 1.0

qphysics is a modular and comprehensive Java-based physics library designed for software applications requiring accurate and efficient physics computations. It provides tools for motion calculations, vector operations, force computations, energy transformations, and unit conversions. The library is optimized for scientific research, game development, robotics, and educational purposes.


## Team Description
1.[Noshin Sharmili](https://github.com/NoshinSharmili)

2.Noor-E-Fatiha

3.[Afridah Zarin Khan](https://github.com/AfridahKhan)

## Supervised by

Ishmam Tashdeed

Lecturer

Department of Computer Science and Engineering

## Features

- [Motion Calculations Module](https://github.com/NoshinSharmili/qphysics?tab=readme-ov-file#motion-calculations-module)
- [Vector Calculations Module] (#Vector Calculations Module)
- [Force Calculations Module] (#Force Calculations Module)
- [Energy/Work Calculations Module] (#Energy/Work Calculations Module)
- [Physics Constants Module] #Physics Constants Module)
- [Conversion Module] (#Conversion Module)

## Motion Calculations Module
### 1.Final Velocity Calculations

**`1.1 double finalVelocity(double initialVelocity, double time, double acceleration)`** <br>
Calculates the final velocity of an object given its initial velocity, time, and acceleration using the kinematic equation

Time Complexity: 0(1)

### Sample Input:

initialVelocity = 10.0,
time = 5.0,  
acceleration = 2.0  

### Sample Output:
Final Velocity = 20.0 m/s  
<br>

**`1.2 double finalVelocityUsingDisplacement(double initialVelocity, double displacement, double acceleration)`** <br>
Computes the final velocity of an object using displacement instead of time, using the equation

Time Complexity:O(1)

### Sample Input:

initialVelocity = 5.0,  
displacement = 20.0, 
acceleration = 2.0  

### Sample Output:

Final Velocity = 10.0 m/s 
<br>

## 2. Displacement Calculations
**`2.1 double displacement(double initialVelocity, double time, double acceleration)`** <br>

Calculates displacement using the kinematic equation

​Time Complexity:O(1)

### Sample Input:

initialVelocity = 10.0, 
time = 5.0,  
acceleration = 2.0  

### Sample Output:

Displacement = 75.0 m  
<br>

**`2.2 double displacementUsingFinalVelocity(double initialVelocity, double finalVelocity, double acceleration)`** <br>
Computes displacement based on initial velocity, final velocity, and acceleration 

Time Complexity:O(1)

### Sample Input:

initialVelocity = 5.0,  
finalVelocity = 10.0  
acceleration = 2.0  

### Sample Output:

Displacement = 18.75 m  
<br>

## 3. Acceleration Calculations
**`3.1 double acceleration(double finalVelocity, double initialVelocity, double time)`**
Computes acceleration using the formula

Time Complexity:O(1)

### Sample Input:
finalVelocity = 30.0, 
initialVelocity = 10.0, 
time = 4.0  

### Sample Output:

Acceleration = 5.0 m/s²  
<br>

**`3.2 double accelerationUsingDisplacement(double displacement, double initialVelocity, double time)`**
Computes acceleration using displacement instead of final velocity

Time Complexity:O(1)

### Sample Input:

displacement = 50.0,  
initialVelocity = 5.0, 
time = 10.0  

### Sample Output:

Acceleration = 0.5 m/s² 
<br>

## 4. Time Calculation
**`4.1 double time(double initialVelocity, double finalVelocity, double acceleration)`**

Computes the time taken for an object to reach a final velocity under constant acceleration:

Time Complexity:O(1)

### Sample Input:

initialVelocity = 0.0, 
finalVelocity = 20.0, 
acceleration = 4.0  

### Sample Output:

Time = 5.0 s  
<br>

## 5. Average Velocity Calculation
**`5.1 double averageVelocity(double initialVelocity, double finalVelocity)`**

Computes the average velocity over the motion duration using:

Time Complexity:O(1)

### Sample Input:
initialVelocity = 10.0,  
finalVelocity = 20.0,  

### Sample Output:

Average Velocity = 15.0 m/s 
<br>

## 6. Rotational Velocity Calculation
**`6.1 double rotationalVelocity(double angularVelocity, double time, double angularAcceleration)`**

Computes rotational velocity using the equation

Time Complexity:O(1)

### Sample Input:

angularVelocity = 5.0, 
time = 3.0, 
angularAcceleration = 2.0  

### Sample Output:

Rotational Velocity = 11.0 rad/s  
<br>

## Vector Calculations Module  

### 1. Vector Addition  

**`1.1 Vector vectorAddition(Vector v1, Vector v2)`** <br>  
Adds two vectors component-wise.  

Time Complexity: O(1)  

### Sample Input:  

v1 = (3.0, 4.0, 5.0)  
v2 = (1.0, 2.0, 3.0)  

### Sample Output:  
Resultant Vector = (4.0, 6.0, 8.0)  
<br>  

**`1.2 Vector vectorAddition(Vector v1, Vector v2, Vector v3)`** <br>  
Adds three vectors component-wise.  

Time Complexity: O(1)  

### Sample Input:  

v1 = (2.0, 3.0, 4.0)  
v2 = (1.0, 1.0, 1.0)  
v3 = (3.0, 2.0, 1.0)  

### Sample Output:  
Resultant Vector = (6.0, 6.0, 6.0)  
<br>  

## 2. Vector Subtraction  

**`2.1 Vector vectorSubtraction(Vector v1, Vector v2)`** <br>  
Subtracts `v2` from `v1` component-wise.  

Time Complexity: O(1)  

### Sample Input:  

v1 = (5.0, 6.0, 7.0)  
v2 = (2.0, 3.0, 4.0)  

### Sample Output:  
Resultant Vector = (3.0, 3.0, 3.0)  
<br>  

## 3. Dot Product Calculation  

**`3.1 double dotProduct(Vector v1, Vector v2)`** <br>  
Computes the dot product of two vectors.  

Time Complexity: O(1)  

### Sample Input:  

v1 = (3.0, 4.0, 5.0)  
v2 = (1.0, 2.0, 3.0)  

### Sample Output:  
Dot Product = 26.0  
<br>  

## 4. Cross Product Calculation  

**`4.1 Vector crossProduct(Vector v1, Vector v2)`** <br>  
Computes the cross product of two 3D vectors.  

Time Complexity: O(1)  

### Sample Input:  

v1 = (1.0, 2.0, 3.0)  
v2 = (4.0, 5.0, 6.0)  

### Sample Output:  
Resultant Vector = (-3.0, 6.0, -3.0)  
<br>  

## 5. Angle Between Vectors  

**`5.1 double angleBetweenVectors(Vector v1, Vector v2)`** <br>  
Computes the angle between two vectors in radians.  

Time Complexity: O(1)  

### Sample Input:  

v1 = (1.0, 0.0, 0.0)  
v2 = (0.0, 1.0, 0.0)  

### Sample Output:  
Angle = 1.5708 radians (90 degrees)  
<br>  

## 6. Scalar Multiplication  

**`6.1 Vector scalarMultiplication(Vector v, double scalar)`** <br>  
Multiplies a vector by a scalar.  

Time Complexity: O(1)  

### Sample Input:  

v = (2.0, 3.0, 4.0)  
scalar = 2.0  

### Sample Output:  
Resultant Vector = (4.0, 6.0, 8.0)  
<br>  

## 7. Vector Projection  

**`7.1 Vector projection(Vector v1, Vector v2)`** <br>  
Projects `v1` onto `v2`.  

Time Complexity: O(1)  

### Sample Input:  

v1 = (3.0, 4.0, 0.0)  
v2 = (1.0, 0.0, 0.0)  

### Sample Output:  
Projection Vector = (3.0, 0.0, 0.0)  
<br>  

