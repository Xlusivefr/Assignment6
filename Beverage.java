package Classes;

/*
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This class represents a generic beverage with properties such as name, type, size, and base price. 
 * It provides an abstract method for calculating the price, to be implemented by subclasses.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit  
 */


import java.util.Objects;

public abstract class Beverage {
    private String name;
    private Type type;
    private Size size;
    private double basePrice;

    /**
     * Constructor for Beverage, initializes the name, type, size, and base price.
     * 
     * @param name The name of the beverage.
     * @param type The type of the beverage (e.g., ALCOHOL, SMOOTHIE).
     * @param size The size of the beverage (e.g., SMALL, MEDIUM, LARGE).
     */
    public Beverage(String name, Type type, Size size) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.basePrice = calculateBasePrice(size); // Calls helper method to calculate base price based on size
    }

    /**
     * Getter for name.
     * 
     * @return The name of the beverage.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for type.
     * 
     * @return The type of the beverage (e.g., ALCOHOL, SMOOTHIE).
     */
    public Type getType() {
        return type;
    }

    /**
     * Getter for size.
     * 
     * @return The size of the beverage.
     */
    public Size getSize() {
        return size;
    }

    /**
     * Getter for base price.
     * 
     * @return The base price of the beverage based on its size.
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * Abstract method for calculating the price, to be implemented by subclasses.
     * 
     * @return The total price of the beverage.
     */
    public abstract double calculatePrice();

    /**
     * Helper method to calculate base price based on size.
     * 
     * @param size The size of the beverage.
     * @return The base price for the given size.
     */
    protected double calculateBasePrice(Size size) {
        switch (size) {
            case SMALL: return 2.0;
            case MEDIUM: return 3.0;
            case LARGE: return 4.0;
            default: return 0.0;
        }
    }

    /**
     * Returns a string representation of the Beverage object, including name, type, size, and base price.
     * 
     * @return The string representation of the beverage.
     */
    @Override
    public String toString() {
        return String.format("Beverage: %s, Type: %s, Size: %s, Base Price: %.2f", name, type, size, basePrice);
    }

    /**
     * Compares this beverage to another object for equality. Two beverages are considered equal if they have
     * the same name, type, size, and base price.
     * 
     * @param obj The object to compare with.
     * @return true if the objects are equal, otherwise false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Check if the objects are the same instance
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Check for null or different class
        }
        Beverage beverage = (Beverage) obj;
        return Double.compare(beverage.basePrice, basePrice) == 0 &&
               Objects.equals(name, beverage.name) &&
               type == beverage.type &&
               size == beverage.size;
    }

    /**
     * Generates a hash code for the Beverage object, based on name, type, size, and base price.
     * 
     * @return The hash code for this Beverage object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, type, size, basePrice);
    }
}