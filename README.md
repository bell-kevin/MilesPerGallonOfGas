# MilesPerGallonOfGas
SDEV 2210 Project
Create a project that calculates miles per gallon for a given trip, and accumulates the miles and gallons to calculate an overall MPG for the vehicle.

Create a class named MPG that includes private instance variables for miles, gallons, and mpg, which are doubles. Add class variables for totalMiles, totalGallons, and totalMPG, which are doubles, and numTrips, which is an integer. Create a constructor which accepts 2 double parameters, one for miles, one for gallons. Inside the constructor, set the instance variables for miles and gallons, and calculate the mpg. Add to the class variables for totalMiles and TotalGallons, and increment the number of trips.

Create an instance method named displayCurrentMPG( ) which displays the MPG variable for a specific trip object. Create a class method named displayTotalMPG( ) which calculates and displays the overall MPG for all of the trip objects.

The driver class will instantiate 4 trips, display the MPG for each trip, and display the overall MPG.

For the sample session, use the following values:
Trip1: miles = 320, gallons = 29
Trip2: miles = 325.8, gallons = 32.1
Trip3: miles = 412.5, gallons = 35
Trip4: miles = 345, gallons = 32.6

Note that these 4 trips test all the possible combinations of variable types – 2 integers, 2 doubles, 1 integer and 1 double, 1 double and 1 integer. It’s always good practice to test all possible situation.

Once the program works as it should to match the sample session, run the project twice more, with different numbers for every trip, and take screenshots of the results.
