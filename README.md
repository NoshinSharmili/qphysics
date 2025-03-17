
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
- [Vector Calculations Module](https://github.com/NoshinSharmili/qphysics?tab=readme-ov-file#vector-calculations-module)
- [Force Calculations Module](https://github.com/NoshinSharmili/qphysics?tab=readme-ov-file#force-calculations-module)
- [Energy/Work Calculations Module](https://github.com/NoshinSharmili/qphysics?tab=readme-ov-file#energy-calculations-module)
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

### 2. Displacement Calculations
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

### 3. Acceleration Calculations
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

### 4. Time Calculation
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

### 5. Average Velocity Calculation
**`5.1 double averageVelocity(double initialVelocity, double finalVelocity)`**

Computes the average velocity over the motion duration using:

Time Complexity:O(1)

### Sample Input:
initialVelocity = 10.0,  
finalVelocity = 20.0,  

### Sample Output:

Average Velocity = 15.0 m/s 
<br>

### 6. Rotational Velocity Calculation
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

### 2. Vector Subtraction  

**`2.1 Vector vectorSubtraction(Vector v1, Vector v2)`** <br>  
Subtracts `v2` from `v1` component-wise.  

Time Complexity: O(1)  

### Sample Input:  

v1 = (5.0, 6.0, 7.0)  
v2 = (2.0, 3.0, 4.0)  

### Sample Output:  
Resultant Vector = (3.0, 3.0, 3.0)  
<br>  

### 3. Dot Product Calculation  

**`3.1 double dotProduct(Vector v1, Vector v2)`** <br>  
Computes the dot product of two vectors.  

Time Complexity: O(1)  

### Sample Input:  

v1 = (3.0, 4.0, 5.0)  
v2 = (1.0, 2.0, 3.0)  

### Sample Output:  
Dot Product = 26.0  
<br>  

### 4. Cross Product Calculation  

**`4.1 Vector crossProduct(Vector v1, Vector v2)`** <br>  
Computes the cross product of two 3D vectors.  

Time Complexity: O(1)  

### Sample Input:  

v1 = (1.0, 2.0, 3.0)  
v2 = (4.0, 5.0, 6.0)  

### Sample Output:  
Resultant Vector = (-3.0, 6.0, -3.0)  
<br>  

### 5. Angle Between Vectors  

**`5.1 double angleBetweenVectors(Vector v1, Vector v2)`** <br>  
Computes the angle between two vectors in radians.  

Time Complexity: O(1)  

### Sample Input:  

v1 = (1.0, 0.0, 0.0)  
v2 = (0.0, 1.0, 0.0)  

### Sample Output:  
Angle = 1.5708 radians (90 degrees)  
<br>  

### 6. Scalar Multiplication  

**`6.1 Vector scalarMultiplication(Vector v, double scalar)`** <br>  
Multiplies a vector by a scalar.  

Time Complexity: O(1)  

### Sample Input:  

v = (2.0, 3.0, 4.0)  
scalar = 2.0  

### Sample Output:  
Resultant Vector = (4.0, 6.0, 8.0)  
<br>  

### 7. Vector Projection  

**`7.1 Vector projection(Vector v1, Vector v2)`** <br>  
Projects `v1` onto `v2`.  

Time Complexity: O(1)  

### Sample Input:  

v1 = (3.0, 4.0, 0.0)  
v2 = (1.0, 0.0, 0.0)  

### Sample Output:  
Projection Vector = (3.0, 0.0, 0.0)  
<br>  

## Force Calculations Module

### 1. Newton's Second Law  

**`1.1 double force(double mass, double acceleration)`** <br>  
Calculates force using Newton's second law of motion.  

Time Complexity: O(1)  

### Sample Input:  
mass = 10.0 kg  
acceleration = 5.0 m/s²  

### Sample Output:  
Force = 50.0 N  
<br>  

### 2. Gravitational Force  

**`2.1 double gravitationalForce(double mass1, double mass2, double distance)`** <br>  
Computes gravitational force between two objects using Newton's law of universal gravitation.  

Time Complexity: O(1)  

### Sample Input:  
mass1 = 5.97e24 kg (Earth’s mass)  
mass2 = 7.35e22 kg (Moon’s mass)  
distance = 3.84e8 m  

### Sample Output:  
Gravitational Force = 1.98e20 N  
<br>  

### 3. Frictional Force  

**`3.1 double friction(double coefficientOfFriction, double normalForce)`** <br>  
Calculates the force of friction using the friction equation.  

Time Complexity: O(1)  

### Sample Input:  
coefficientOfFriction = 0.5  
normalForce = 100.0 N  

### Sample Output:  
Frictional Force = 50.0 N  
<br>  

### 4. Spring Force  

**`4.1 double springForce(double springConstant, double displacement)`** <br>  
Computes force exerted by a spring using Hooke's law.  

Time Complexity: O(1)  

### Sample Input:  
springConstant = 200.0 N/m  
displacement = 0.1 m  

### Sample Output:  
Spring Force = -20.0 N  
<br>  

### 5. Centripetal Force  

**`5.1 double centripetalForce(double mass, double velocity, double radius)`** <br>  
Computes centripetal force for circular motion.  

Time Complexity: O(1)  

### Sample Input:  
mass = 2.0 kg  
velocity = 4.0 m/s  
radius = 2.0 m  

### Sample Output:  
Centripetal Force = 8.0 N  
<br>  

### 6. Electrostatic Force  

**`6.1 double electrostaticForce(double charge1, double charge2, double distance)`** <br>  
Computes the electrostatic force between two charged particles using Coulomb’s law.  

Time Complexity: O(1)  

### Sample Input:  
charge1 = 1.6e-19 C  
charge2 = 1.6e-19 C  
distance = 1.0e-10 m  

### Sample Output:  
Electrostatic Force = 2.3e-9 N  
<br>  

### 7. Drag Force  

**`7.1 double dragForce(double dragCoefficient, double fluidDensity, double velocity, double crossSectionalArea)`** <br>  
Calculates the resistive force experienced by an object moving through a fluid.  

Time Complexity: O(1)  

### Sample Input:  
dragCoefficient = 0.5  
fluidDensity = 1.225 kg/m³  
velocity = 10.0 m/s  
crossSectionalArea = 1.0 m²  

### Sample Output:  
Drag Force = 61.25 N  
<br>  

### 8. Torque  

**`8.1 double torque(double force, double distance)`** <br>  
Computes the rotational effect of a force about a pivot.  

Time Complexity: O(1)  

### Sample Input:  
force = 10.0 N  
distance = 2.0 m  

### Sample Output:  
Torque = 20.0 Nm  
<br>  

### 9. Net Force  

**`9.1 double netForce(double[] forces)`** <br>  
Computes the net force as the sum of multiple force vectors.  

Time Complexity: O(n)  

### Sample Input:  
forces = {10.0, -5.0, 15.0, -10.0}  

### Sample Output:  
Net Force = 10.0 N  
<br>  

## Energy Calculations Module 

### 1. Kinetic Energy  

**`1.1 double kineticEnergy(double mass, double velocity)`** <br>  
Calculates kinetic energy using the formula:  
\[
KE = \frac{1}{2} m v^2
\]  

Time Complexity: O(1)  

### Sample Input:  
mass = 2.0 kg  
velocity = 3.0 m/s  

### Sample Output:  
Kinetic Energy = 9.0 J  
<br>  

### 2. Potential Energy  

**`2.1 double potentialEnergy(double mass, double height, double gravity)`** <br>  
Computes gravitational potential energy using the formula:  
\[
PE = mgh
\]  

Time Complexity: O(1)  

### Sample Input:  
mass = 5.0 kg  
height = 10.0 m  
gravity = 9.81 m/s²  

### Sample Output:  
Potential Energy = 490.5 J  
<br>  

### 3. Gravitational Potential Energy  

**`3.1 double gravitationalPotentialEnergy(double mass1, double mass2, double distance)`** <br>  
Computes gravitational potential energy using the universal gravitation formula:  
\[
U = - \frac{G m_1 m_2}{r}
\]  

Time Complexity: O(1)  

### Sample Input:  
mass1 = 5.97e24 kg (Earth’s mass)  
mass2 = 7.35e22 kg (Moon’s mass)  
distance = 3.84e8 m  

### Sample Output:  
Gravitational Potential Energy ≈ -4.1e28 J  
<br>  

### 4. Elastic Potential Energy  

**`4.1 double elasticPotentialEnergy(double springConstant, double displacement)`** <br>  
Computes elastic potential energy using Hooke’s law:  
\[
U = \frac{1}{2} k x^2
\]  

Time Complexity: O(1)  

### Sample Input:  
springConstant = 200.0 N/m  
displacement = 0.1 m  

### Sample Output:  
Elastic Potential Energy = 1.0 J  
<br>  

### 5. Work Done  

**`5.1 double workDone(double force, double displacement, double angle)`** <br>  
Computes work done using the equation:  
\[
W = F d \cos(\theta)
\]  

Time Complexity: O(1)  

### Sample Input:  
force = 10.0 N  
displacement = 5.0 m  
angle = 30°  

### Sample Output:  
Work Done ≈ 43.3 J  
<br>  

### 6. Power  

**`6.1 double power(double workDone, double time)`** <br>  
Computes power using the equation:  
\[
P = \frac{W}{t}
\]  

Time Complexity: O(1)  

### Sample Input:  
workDone = 100.0 J  
time = 5.0 s  

### Sample Output:  
Power = 20.0 W  
<br>  

### 7. Power Using Force and Velocity  

**`7.1 double powerUsingForce(double force, double velocity)`** <br>  
Computes power using force and velocity:  
\[
P = F v
\]  

Time Complexity: O(1)  

### Sample Input:  
force = 50.0 N  
velocity = 2.0 m/s  

### Sample Output:  
Power = 100.0 W  
<br>  

### 8. Mechanical Energy  

**`8.1 double mechanicalEnergy(double kineticEnergy, double potentialEnergy)`** <br>  
Computes total mechanical energy as:  
\[
E = KE + PE
\]  

Time Complexity: O(1)  

### Sample Input:  
kineticEnergy = 100.0 J  
potentialEnergy = 200.0 J  

### Sample Output:  
Mechanical Energy = 300.0 J  
<br>  

## Physics Constant Module
### 1.Universal Constants

###1.1 Gravitational Constant
**`public static final double GRAVITATIONAL_CONSTANT`**
Represents Newton’s gravitational constant, used in the universal law of gravitation:
G = 6.67430e-11; // N⋅m²/kg² <br>

1.2 Speed of Light

public static final double SPEED_OF_LIGHT Represents the speed of light in a vacuum:

1.3 Planck Constant

public static final double PLANCK_CONSTANT Defines Planck’s constant, used in quantum mechanics:

1.4 Elementary Charge

public static final double ELEMENTARY_CHARGE Represents the charge of a single electron or proton:

1.5 Avogadro Constant

public static final double AVOGADRO_CONSTANT Defines Avogadro’s number, the number of particles in a mole:

1.6 Boltzmann Constant

public static final double BOLTZMANN_CONSTANT Relates temperature to energy in statistical mechanics:

1.7 Gas Constant

public static final double GAS_CONSTANT Defines the universal gas constant:
