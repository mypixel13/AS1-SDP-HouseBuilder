# House Builder

##  Project Description

This project demonstrates the Builder design pattern in Java.

The product of the project is a House. The Builder pattern is used because a house has several parameters and can be constructed step by step.
#  5 Clean Code Principles
1. Meaningful Names
The code uses clear names that describe the purpose of variables and methods.

For example, in HouseBuilder:

public HouseBuilder setBedrooms(int bedrooms) {
this.bedrooms = bedrooms;
return this;
}

The name setBedrooms clearly shows that the method sets the number of bedrooms.

Another example from HouseDirector:

public House buildFamilyHouse() {

The method name clearly shows which type of house it creates.

2. Small Methods

The Builder methods are small and perform one simple action.

For example:

public HouseBuilder setFloors(int floors) {
this.floors = floors;
return this;
}

This method only sets the number of floors and returns the Builder.

The other setter methods follow the same simple structure.

3. Single Responsibility

Each class has a specific responsibility.

House represents the final product:

public class House {

HouseBuilder is responsible for constructing the House:

public class HouseBuilder {

HouseDirector is responsible for predefined house configurations:

public class HouseDirector {

Main is responsible for running and testing the program:

public class Main {

Separating these responsibilities makes the code easier to understand and maintain.

4. Validated Construction

The build() method checks the data before creating the final House object.

For example:

if (floors < MIN_FLOORS) {
throw new IllegalStateException(
"House must have at least one floor."
);
}

Another validation checks that the number of bedrooms does not exceed the total number of rooms:

if (bedrooms > rooms) {
throw new IllegalStateException(
"Bedrooms cannot exceed total rooms."
);
}

Only after the validation is completed does the Builder create the House:

return new House(
floors,
rooms,
bedrooms,
bathrooms,
garage,
garden
);

This prevents invalid House objects from being created.

5. No Magic Numbers

The validation uses named constants instead of unexplained numbers.

For example:

private static final int MIN_FLOORS = 1;
private static final int MIN_ROOMS = 1;
private static final int MIN_BATHROOMS = 1;

These constants are then used in validation:

if (floors < MIN_FLOORS) {
throw new IllegalStateException(
"House must have at least one floor."
);
}

Using named constants makes the meaning of the values clear and makes them easier to change.