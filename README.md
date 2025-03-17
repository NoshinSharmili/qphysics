
# qphysics - A Java Physics Library

Version: 1.0

qphysics is a modular and comprehensive Java-based physics library designed for software applications requiring accurate and efficient physics computations. It provides tools for motion calculations, vector operations, force computations, energy transformations, and unit conversions. The library is optimized for scientific research, game development, robotics, and educational purposes.


## Team Description
1.Noshin Sharmili

2.Noor-E-Fatiha

3.Afridah Zarin Khan

## Supervised by

Ishmam Tashdeed

Lecturer

Department of Computer Science and Engineering

## Features

- [Motion Calculations Module] (#motion-calculations-module)
- [Vector Calculations Module] (#Vector Calculations Module)
- [Force Calculations Module] (#Force Calculations Module)
- [Energy/Work Calculations Module] (#Energy/Work Calculations Module)
- [Physics Constants Module] #Physics Constants Module)
- [Conversion Module] (#Conversion Module)

## Motion Calculations Module

## 1. Final Velocity Calculations

### 1.1 double finalVelocity(double initialVelocity, double time, double acceleration)
Calculates the final velocity of an object given its initial velocity, time, and acceleration using the kinematic equation

Time Complexity: 𝑂(1)

### Sample Input:

initialVelocity = 10.0,
time = 5.0,  
acceleration = 2.0  

### Sample Output:
Final Velocity = 20.0 m/s  

### 1.2 double finalVelocityUsingDisplacement(double initialVelocity, double displacement, double acceleration)

Computes the final velocity of an object using displacement instead of time, using the equation

Time Complexity:O(1)

### Sample Input:

initialVelocity = 5.0,  

displacement = 20.0, 

acceleration = 2.0  

### Sample Output:

Final Velocity = 10.0 m/s  

## 2. Displacement Calculations
### 2.1 double displacement(double initialVelocity, double time, double acceleration)

Calculates displacement using the kinematic equation

​Time Complexity:O(1)

### Sample Input:

initialVelocity = 10.0, 
time = 5.0,  
acceleration = 2.0  

### Sample Output:

Displacement = 75.0 m  

### 2.2 double displacementUsingFinalVelocity(double initialVelocity, double finalVelocity, double acceleration)
Computes displacement based on initial velocity, final velocity, and acceleration 

Time Complexity:O(1)

### Sample Input:

initialVelocity = 5.0,  
finalVelocity = 10.0  
acceleration = 2.0  

### Sample Output:

Displacement = 18.75 m  

## 3. Acceleration Calculations
### 3.1 double acceleration(double finalVelocity, double initialVelocity, double time)
Computes acceleration using the formula

Time Complexity:O(1)

### Sample Input:
finalVelocity = 30.0, 
initialVelocity = 10.0, 
time = 4.0  

### Sample Output:

Acceleration = 5.0 m/s²  

### 3.2 double accelerationUsingDisplacement(double displacement, double initialVelocity, double time)

Computes acceleration using displacement instead of final velocity

Time Complexity:O(1)

### Sample Input:

displacement = 50.0,  
initialVelocity = 5.0, 
time = 10.0  

### Sample Output:

Acceleration = 0.5 m/s²  
## 4. Time Calculation
### 4.1 double time(double initialVelocity, double finalVelocity, double acceleration)

Computes the time taken for an object to reach a final velocity under constant acceleration:

Time Complexity:O(1)

### Sample Input:

initialVelocity = 0.0, 
finalVelocity = 20.0, 
acceleration = 4.0  

### Sample Output:

Time = 5.0 s  

## 5. Average Velocity Calculation
### 5.1 double averageVelocity(double initialVelocity, double finalVelocity)

Computes the average velocity over the motion duration using:

Time Complexity:O(1)

### Sample Input:
initialVelocity = 10.0,  
finalVelocity = 20.0,  

### Sample Output:

Average Velocity = 15.0 m/s  

## 6. Rotational Velocity Calculation
### 6.1 double rotationalVelocity(double angularVelocity, double time, double angularAcceleration)

Computes rotational velocity using the equation

Time Complexity:O(1)

### Sample Input:

angularVelocity = 5.0, 
time = 3.0, 
angularAcceleration = 2.0  

### Sample Output:

Rotational Velocity = 11.0 rad/s  
