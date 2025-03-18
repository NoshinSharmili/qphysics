
# qphysics - A Java Physics Library

Version: 1.0

qphysics is a modular and comprehensive Java-based physics library designed for software applications requiring accurate and efficient physics computations. It provides tools for motion calculations, vector operations, force computations, energy transformations, projectile motion calculations, constants and unit conversions. The library is optimized for scientific research, game development, robotics, and educational purposes.


## Team Description
1.[Noshin Sharmili](https://github.com/NoshinSharmili)

2.[Noor-E-Fatiha](https://github.com/fatiha693)

3.[Afridah Zarin Khan](https://github.com/AfridahKhan)

## Supervised by

Ishmam Tashdeed

Lecturer

Department of Computer Science and Engineering

## Features

 > Click on the links to see documentation

- [Motion Calculations Module](https://github.com/NoshinSharmili/qphysics?tab=readme-ov-file#motion-calculations-module)
- [Vector Calculations Module](https://github.com/NoshinSharmili/qphysics?tab=readme-ov-file#vector-calculations-module)
- [Force Calculations Module](https://github.com/NoshinSharmili/qphysics?tab=readme-ov-file#force-calculations-module)
- [Energy/Work Calculations Module](https://github.com/NoshinSharmili/qphysics?tab=readme-ov-file#energy-calculations-module)
- [Physics Constants Module](https://github.com/NoshinSharmili/qphysics?tab=readme-ov-file#physics-constants-module)
- [Conversion Module](https://github.com/NoshinSharmili/qphysics?tab=readme-ov-file#conversion-module)
- [Projectile Motion Module](https://github.com/NoshinSharmili/qphysics?tab=readme-ov-file#projectile-motion-module)
- [Simulation Module](https://github.com/NoshinSharmili/qphysics?tab=readme-ov-file#simulation-module)

## Tools
**Language** : Java
**IDE** : IntelliJ Idea
**Version Control** : Git
**Documentation** : Readme

## Motion Calculations Module

### 1. Final Velocity Calculations

**`1.1 double finalVelocity(double initialVelocity, double time, double acceleration)`** <br>

Calculates the final velocity of an object given its initial velocity, time, and acceleration using the kinematic equation:

**v = u + at**  

Time Complexity: O(1)

### Sample Input:

initialVelocity = 10.0,  
time = 5.0,  
acceleration = 2.0  

### Sample Output:
Final Velocity = 20.0 m/s  
<br>
***
**`1.2 double finalVelocityUsingDisplacement(double initialVelocity, double displacement, double acceleration)`** <br>

Computes the final velocity of an object using displacement instead of time, using the equation:

**v² = u² + 2as**  

Time Complexity: O(1)

### Sample Input:

initialVelocity = 5.0,  
displacement = 20.0,  
acceleration = 2.0  

### Sample Output:

Final Velocity = 10.0 m/s  
<br>
***
### 2. Displacement Calculations
**`2.1 double displacement(double initialVelocity, double time, double acceleration)`** <br>

Calculates displacement using the kinematic equation:

**s = ut + (1/2)at²**  

Time Complexity: O(1)

### Sample Input:

initialVelocity = 10.0,  
time = 5.0,  
acceleration = 2.0  

### Sample Output:

Displacement = 75.0 m  
<br>
***
**`2.2 double displacementUsingFinalVelocity(double initialVelocity, double finalVelocity, double acceleration)`** <br>

Computes displacement based on initial velocity, final velocity, and acceleration:

**s = (v² - u²) / 2a**  

Time Complexity: O(1)

### Sample Input:

initialVelocity = 5.0,  
finalVelocity = 10.0,  
acceleration = 2.0  

### Sample Output:

Displacement = 18.75 m  
<br>
***
### 3. Acceleration Calculations
**`3.1 double acceleration(double finalVelocity, double initialVelocity, double time)`**

Computes acceleration using the formula:

**a = (v - u) / t**  

Time Complexity: O(1)

### Sample Input:
finalVelocity = 30.0,  
initialVelocity = 10.0,  
time = 4.0  

### Sample Output:

Acceleration = 5.0 m/s²  
<br>
***
**`3.2 double accelerationUsingDisplacement(double displacement, double initialVelocity, double time)`**

Computes acceleration using displacement instead of final velocity:

**a = (2(s - ut)) / t²**  

Time Complexity: O(1)

### Sample Input:

displacement = 50.0,  
initialVelocity = 5.0,  
time = 10.0  

### Sample Output:

Acceleration = 0.5 m/s²  
<br>
***
### 4. Time Calculation
**`4.1 double time(double initialVelocity, double finalVelocity, double acceleration)`**

Computes the time taken for an object to reach a final velocity under constant acceleration:

**t = (v - u) / a**  

Time Complexity: O(1)

### Sample Input:

initialVelocity = 0.0,  
finalVelocity = 20.0,  
acceleration = 4.0  

### Sample Output:

Time = 5.0 s  
<br>
***
### 5. Average Velocity Calculation
**`5.1 double averageVelocity(double initialVelocity, double finalVelocity)`**

Computes the average velocity over the motion duration using:

**v_avg = (u + v) / 2**  

Time Complexity: O(1)

### Sample Input:
initialVelocity = 10.0,  
finalVelocity = 20.0,  

### Sample Output:

Average Velocity = 15.0 m/s  
<br>
***
### 6. Rotational Velocity Calculation
**`6.1 double rotationalVelocity(double angularVelocity, double time, double angularAcceleration)`**

Computes rotational velocity using the equation:

**ω = ω₀ + αt**  

Time Complexity: O(1)

### Sample Input:

angularVelocity = 5.0,  
time = 3.0,  
angularAcceleration = 2.0  

### Sample Output:

Rotational Velocity = 11.0 rad/s  
<br>
***

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
***
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
***
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
***
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
***
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
***
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
***
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
***
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
***
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
***
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
***
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
***
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
***
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
***
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
***
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
***
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
***
### 9. Net Force  

**`9.1 double netForce(double[] forces)`** <br>  
Computes the net force as the sum of multiple force vectors.  

Time Complexity: O(n)  

### Sample Input:  
forces = {10.0, -5.0, 15.0, -10.0}  

### Sample Output:  
Net Force = 10.0 N  
<br>  
***

## Energy Calculations Module 

### 1. Kinetic Energy  

**`1.1 double kineticEnergy(double mass, double velocity)`** <br>  
Calculates kinetic energy using the formula:  

KE = (1/2) mv²  

Time Complexity: O(1)  

### Sample Input:  
mass = 2.0 kg  
velocity = 3.0 m/s  

### Sample Output:  
Kinetic Energy = 9.0 J  
<br>  
***
### 2. Potential Energy  

**`2.1 double potentialEnergy(double mass, double height, double gravity)`** <br>  
Computes gravitational potential energy using the formula:  

PE = mgh  

Time Complexity: O(1)  

### Sample Input:  
mass = 5.0 kg  
height = 10.0 m  
gravity = 9.81 m/s²  

### Sample Output:  
Potential Energy = 490.5 J  
<br>  
***
### 3. Gravitational Potential Energy  

**`3.1 double gravitationalPotentialEnergy(double mass1, double mass2, double distance)`** <br>  
Computes gravitational potential energy using the universal gravitation formula:  

 U = − (G m₁ m₂) / r 

Time Complexity: O(1)  

### Sample Input:  
mass1 = 5.97e24 kg (Earth’s mass)  
mass2 = 7.35e22 kg (Moon’s mass)  
distance = 3.84e8 m  

### Sample Output:  
Gravitational Potential Energy ≈ -4.1e28 J  
<br>  
***
### 4. Elastic Potential Energy  

**`4.1 double elasticPotentialEnergy(double springConstant, double displacement)`** <br>  
Computes elastic potential energy using Hooke’s law:  

U = (1/2) kx²  

Time Complexity: O(1)  

### Sample Input:  
springConstant = 200.0 N/m  
displacement = 0.1 m  

### Sample Output:  
Elastic Potential Energy = 1.0 J  
<br>  
***
### 5. Work Done  

**`5.1 double workDone(double force, double displacement, double angle)`** <br>  
Computes work done using the equation:  

W = Fd cos(θ)

Time Complexity: O(1)  

### Sample Input:  
force = 10.0 N  
displacement = 5.0 m  
angle = 30°  

### Sample Output:  
Work Done ≈ 43.3 J  
<br>  
***
### 6. Power  

**`6.1 double power(double workDone, double time)`** <br>  
Computes power using the equation:  

P = W / t  

Time Complexity: O(1)  

### Sample Input:  
workDone = 100.0 J  
time = 5.0 s  

### Sample Output:  
Power = 20.0 W  
<br>  
***
### 7. Power Using Force and Velocity  

**`7.1 double powerUsingForce(double force, double velocity)`** <br>  
Computes power using force and velocity:  

P = Fv 

Time Complexity: O(1)  

### Sample Input:  
force = 50.0 N  
velocity = 2.0 m/s  

### Sample Output:  
Power = 100.0 W  
<br>  
***
### 8. Mechanical Energy  

**`8.1 double mechanicalEnergy(double kineticEnergy, double potentialEnergy)`** <br>  
Computes total mechanical energy as:  

E = KE + PE

Time Complexity: O(1)  

### Sample Input:  
kineticEnergy = 100.0 J  
potentialEnergy = 200.0 J  

### Sample Output:  
Mechanical Energy = 300.0 J  
<br>  
***

## Physics Constants Module

### 1.Universal Constants

### 1.1 Gravitational Constant
**`public static final double GRAVITATIONAL_CONSTANT`**

Represents Newton’s gravitational constant, used in the universal law of gravitation:

G = 6.67430e-11 N⋅m²/kg² <br>
***
### 1.2 Speed of Light

**`public static final double SPEED_OF_LIGHT`** 

Represents the speed of light in a vacuum:

c = 2.99792458e8 m/s <br>
***
### 1.3 Planck Constant

**`public static final double PLANCK_CONSTANT`** 

Defines Planck’s constant used in quantum mechanics:

h = 6.62607015e-34 J.s <br>
***
### 1.4 Elementary Charge

**`public static final double ELEMENTARY_CHARGE`** 

ELEMENTARY_CHARGE Represents the charge of a single electron or proton:

e = 1.602176634e-19 C <br>
***
### 1.5 Avogadro Constant

**`public static final double AVOGADRO_CONSTANT`** 

Defines Avogadro’s number, the number of particles in a mole:

NA = 6.02214076e23 mol-1 <br>
***
### 1.6 Boltzmann Constant

**`public static final double BOLTZMANN_CONSTANT`** 

Relates temperature to energy in statistical mechanics:

kB = 1.380649e-23 J/K <br>
***
### 1.7 Gas Constant

**`public static final double GAS_CONSTANT`** 

Defines the universal gas constant:

R = 8.314 J/(mol.K) <br>
***
### 2. Earth-Specific Constants

### 2.1 Acceleration Due to Gravity

**`public static final double ACCELERATION_DUE_TO_GRAVITY`**

Represents the standard acceleration due to gravity on Earth:

g = 9.8065 m/s^2 <br>
***
### 2.2 Earth Mass

**`public static final double EARTH_MASS`**

Defines the mass of the Earth:

Mₑ = 5.92e24 kg <br>
***
### 2.3 Earth Radius

**`public static final double EARTH_RADIUS`**

Represents the mean radius of the Earth:

Rₑ = 6.371e6 m <br>
***
### 3. Electromagnetic Constants

### 3.1 Permittivity of Free Space

**`public static final double PERMITTIVITY_OF_FREE_SPACE`**

Represents the permittivity of free space (vacuum permittivity):

ε₀ = 8.854187817 × 10⁻¹² F/m
***
### 3.2 Permeability of Free Space

**`public static final double PERMEABILITY_OF_FREE_SPACE`**

Defines the permeability of free space (vacuum permeability):

μ₀ = 4π × 10⁻⁷ N/A²
***

### 3.3 Stefan-Boltzmann Constant

**`public static final double STEFAN_BOLTZMANN_CONSTANT`**

Defines the Stefan-Boltzmann constant, used in blackbody radiation calculations:

σ = 5.670374419 × 10⁻⁸ W⋅m⁻²⋅K⁻⁴
***

## Conversion Module

### 1. Length Conversions
**`1.1 double metersToKilometers(double meters)`**
Converts length from meters to kilometers using the formula:

km = m / 1000

Time Complexity: O(1)

Sample Input:
meters = 5000.0

Sample Output:
Kilometers = 5.0 km
<br>
***
**`1.2 double kilometersToMeters(double kilometers)`**

Converts length from kilometers to meters using the formula:

m = km × 1000

Time Complexity: O(1)

### Sample Input:

kilometers = 3.5

### Sample Output:

Meters = 3500.0 m
<br>
***
**`1.3 double metersToMiles(double meters)`**

Converts length from meters to miles using the formula:

mi = m / 1609.34

Time Complexity: O(1)

### Sample Input:

meters = 1609.34

### Sample Output:

Miles = 1.0 mi
<br>
***
**`1.4 double milesToMeters(double miles)`**

Converts length from miles to meters using the formula:

m = mi × 1609.34

Time Complexity: O(1)

### Sample Input:

miles = 2.0

### Sample Output:

Meters = 3218.68 m
<br>
***
### 2. Temperature Conversions

**`2.1 double celsiusToFahrenheit(double celsius)`**

Converts temperature from Celsius to Fahrenheit using the formula:

°F = (°C × 9/5) + 32

Time Complexity: O(1)

### Sample Input:

celsius = 25.0

### Sample Output:

Fahrenheit = 77.0 °F
<br>
***
**`2.2 double fahrenheitToCelsius(double fahrenheit)`**

Converts temperature from Fahrenheit to Celsius using the formula:

°C = (°F - 32) × 5/9

Time Complexity: O(1)

### Sample Input:

fahrenheit = 98.6

### Sample Output:

Celsius = 37.0 °C
<br>
***
### 3. Energy Conversions

**`3.1 double joulesToCalories(double joules)`**

Converts energy from joules to calories using the formula:

cal = J / 4.184

Time Complexity: O(1)

### Sample Input:

joules = 100.0

### Sample Output:

Calories = 23.92 cal
<br>
***
**`3.2 double caloriesToJoules(double calories)`**

Converts energy from calories to joules using the formula:

J = cal × 4.184

Time Complexity: O(1)

### Sample Input:

calories = 50.0

### Sample Output:

Joules = 209.2 J
<br>
***
### 4. Force Conversions

**`4.1 double newtonsToPounds(double newtons)`**

Converts force from newtons to pounds-force using the formula:

lbf = N × 0.224809

Time Complexity: O(1)

### Sample Input:

newtons = 10.0

### Sample Output:

Pounds-force = 2.24809 lbf
<br>
***
**`4.2 double poundsToNewtons(double pounds)`**

Converts force from pounds-force to newtons using the formula:

N = lbf / 0.224809

Time Complexity: O(1)

### Sample Input:

pounds = 5.0

### Sample Output:

Newtons = 22.2413 N
<br>
***
### 5. Time Conversions

**`5.1 double secondsToMinutes(double seconds)`**

Converts time from seconds to minutes using the formula:

min = s / 60

Time Complexity: O(1)

### Sample Input:

seconds = 180.0

### Sample Output:

Minutes = 3.0 min
<br>
***
**`5.2 double minutesToSeconds(double minutes)`**

Converts time from minutes to seconds using the formula:

s = min × 60

Time Complexity: O(1)

### Sample Input:

minutes = 2.5

### Sample Output:

Seconds = 150.0 s
<br>
***
### 6. Angle Conversions

**`6.1 double degreesToRadians(double degrees)`**

Converts angle from degrees to radians using the formula:

rad = degrees × (π / 180)

Time Complexity: O(1)

### Sample Input:

degrees = 180.0

### Sample Output:

Radians = 3.1416 rad
<br>
***
**`6.2 double radiansToDegrees(double radians)`**

Converts angle from radians to degrees using the formula:

degrees = rad × (180 / π)

Time Complexity: O(1)

### Sample Input:

radians = 1.57

### Sample Output:

Degrees = 89.95°
<br>
***
### 7. Power Conversions

**`7.1 double wattsToHorsePower(double watts)`**

Converts power from watts to horsepower using the formula:

hp = W / 745.7

Time Complexity: O(1)

### Sample Input:

watts = 1491.4

### Sample Output:

Horsepower = 2.0 hp
<br>
***
**`7.2 double horsePowerToWatts(double horsepower)`**

Converts power from horsepower to watts using the formula:

W = hp × 745.7

Time Complexity: O(1)

### Sample Input:

horsepower = 3.0

### Sample Output:

Watts = 2237.1 W
<br>
***
### 8. Volume Conversions

**`8.1 double litersToGallons(double liters)`**

Converts volume from liters to gallons using the formula:

gal = L / 3.78541

Time Complexity: O(1)

### Sample Input:

liters = 7.57

### Sample Output:

Gallons = 2.0 gal
<br>
***
**`8.2 double gallonsToLiters(double gallons)`**

Converts volume from gallons to liters using the formula:

L = gal × 3.78541

Time Complexity: O(1)

### Sample Input:

gallons = 5.0

### Sample Output:

Liters = 18.93 L
<br>
***
### 9. Mass Conversions

**`9.1 double kilogramsToPounds(double kilograms)`**

Converts mass from kilograms to pounds using the formula:

lb = kg × 2.20462

Time Complexity: O(1)

### Sample Input:

kilograms = 10.0

### Sample Output:

Pounds = 22.0462 lb

<br>
***
**`9.2 double poundsToKilograms(double pounds)`**

Converts mass from pounds to kilograms using the formula:

kg = lb / 2.20462

Time Complexity: O(1)

### Sample Input:

pounds = 50.0

### Sample Output:

Kilograms = 22.68 kg
<br>
***
## Projectile Motion Module

### 1. Time of Flight
**`1.1 double timeOfFlight(double velocity, double angle)`**

Calculates the total time the projectile remains in the air using the formula:

T = (2V₀ sin(θ)) / g

​where:

V₀ is the initial velocity (m/s) <br>
θ is the launch angle (degrees)<br>
g is the acceleration due to gravity (9.8 m/s²)<br>
Time Complexity: O(1)<br>

### Sample Input:
velocity = 20.0 m/s, angle = 45.0°

### Sample Output:
Time of Flight = 2.87 s
<br>
***
### 2. Maximum Height
**`2.1 double maxHeight(double velocity, double angle)`**

Calculates the peak height reached by the projectile using the formula:

H = (V₀² sin²(θ)) / (2g) 
 
where:

V₀ is the initial velocity (m/s)

θ is the launch angle (degrees)

g is the acceleration due to gravity (9.8 m/s²)

Time Complexity: O(1)

### Sample Input:

velocity = 30.0 m/s, angle = 60.0°

### Sample Output:

Maximum Height = 34.39 m
<br>
***
### 3. Total Range

**`3.1 double totalRange(double velocity, double angle)`**

Calculates the horizontal distance traveled by the projectile using the formula:

R = (V₀² sin(2θ)) / g 

where:

V₀ is the initial velocity (m/s)

θ is the launch angle (degrees)

g is the acceleration due to gravity (9.8 m/s²)

Time Complexity: O(1)

### Sample Input:

velocity = 25.0 m/s, angle = 30.0°

### Sample Output:

Total Range = 55.06 m <br>
***
### 4. Velocity at a Given Time

**`4.1 double velocityAtTime(double velocity, double angle, double time)`**

Calculates the projectile's velocity at a given time using the formulas:


Vₓ = V₀ cos(θ)  

Vᵧ = V₀ sin(θ) − g ⋅ t  

V = √(Vₓ² + Vᵧ²)  


where:

V₀ is the initial velocity (m/s)

θ is the launch angle (degrees)

g is the acceleration due to gravity (9.8 m/s²)

t is the elapsed time (s)

Time Complexity: O(1)

### Sample Input:
velocity = 40.0 m/s, angle = 45.0°, time = 2.0 s

### Sample Output:
Velocity at Time t = 34.18 m/s
<br>
***
### 5. Position at a Given Time

**`5.1 double[] positionAtTime(double velocity, double angle, double time)`**

Calculates the x (horizontal) and y (vertical) positions at a given time using the formulas:

X = V₀ cos(θ) ⋅ t  

Y = V₀ sin(θ) ⋅ t − (1/2) g t² 
 
where:

V₀ is the initial velocity (m/s)

θ is the launch angle (degrees)

g is the acceleration due to gravity (9.8 m/s²)

t is the elapsed time (s)

Time Complexity: O(1)

### Sample Input:

velocity = 50.0 m/s, angle = 30.0°, time = 3.0 s

### Sample Output:

Position at Time t = (X: 129.9 m, Y: 30.3 m)
<br>
***

## Simulation Module

### 1. Ball Throw Simulation
**`1.1 void simulateBallThrow(double initialVelocity)`** <br>

Simulates the vertical motion of a ball thrown upwards under gravity and displays time vs. displacement.

Formula Used:

Total time in air: T = (2u) / g

Displacement at time t: s = ut - (1/2)gt²

Time Complexity: O(n) (where n is total time steps)

Sample Input:
initialVelocity = 20.0 m/s

Sample Output:

`Time (s) | Distance (m)`

        0 |        0.00
        
        1 |       15.10
        
        2 |       20.20
        
        3 |       15.30
        
        4 |        0.00

`Total Time: 4.08 seconds`
***
        
