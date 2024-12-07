package Classes;

/*
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This class represents a coffee beverage. It extends the Beverage class and 
 * implements the methods for calculating the price, checking equality, and generating a string representation.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit  
 */


import java.util.Objects;

public class Coffee extends Beverage {

    /**
     * Constructor for Coffee class. Initializes the coffee beverage with the specified name and size.
     * 
     * @param name The name of the coffee.
     * @param size The size of the coffee (SMALL, MEDIUM, LARGE).
     */
    public Coffee(String name, Size size) {
        super(name, Type.COFFEE, size);  // Calls the superclass constructor
    }

    /**
     * Calculates the price of the coffee beverage based on its size. 
     * This method assumes no extra cost for the coffee size but can be modified if needed.
     * 
     * @return The price of the coffee.
     */
    @Override
    public double calculatePrice() {
        double basePrice = getBasePrice();  // Get base price from the Beverage class
        return basePrice;  // Returning base price, can be adjusted later if needed
    }

    /**
     * Returns a string representation of the coffee, including the details of the beverage.
     * 
     * @return A string containing the details of the coffee.
     */
    @Override
    public String toString() {
        return super.toString();  // Calls the toString method from Beverage class
    }

    /**
     * Compares this coffee to another object for equality. 
     * The coffee is considered equal to another object if they have the same name and size.
     * 
     * @param obj The object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Check if the objects are the same instance
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Check for null or different class
        }
        Coffee coffee = (Coffee) obj; // Cast the object to Coffee
        return Objects.equals(getName(), coffee.getName()) && getSize() == coffee.getSize(); // Compare the relevant fields
    }

    /**
     * Returns a hash code value for the coffee based on its name and size.
     * 
     * @return The hash code value for this coffee.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSize());
    }
}