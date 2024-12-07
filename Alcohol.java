package Classes;

/*
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This class represents an alcoholic beverage and its related attributes and methods.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit  
 */


import java.util.Objects;

public class Alcohol extends Beverage {

    private boolean isAlcoholic;

    /**
     * Constructor for Alcohol, initializes the beverage's name, size, and alcohol status.
     * 
     * @param name The name of the beverage.
     * @param size The size of the beverage (e.g., SMALL, MEDIUM, LARGE).
     * @param isAlcoholic Indicates whether the beverage is alcoholic.
     */
    public Alcohol(String name, Size size, boolean isAlcoholic) {
        super(name, Type.ALCOHOL, size); // Calls the superclass constructor
        this.isAlcoholic = isAlcoholic;
    }

    /**
     * Getter for isAlcoholic
     * 
     * @return true if the beverage is alcoholic, otherwise false.
     */
    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    /**
     * Implements the calculatePrice method from the Beverage class.
     * Adds a surcharge of 2.0 to the base price if the beverage is alcoholic.
     * 
     * @return The total price of the beverage.
     */
    @Override
    public double calculatePrice() {
        // Adds a surcharge of 2.0 to the base price if the beverage is alcoholic
        return getBasePrice() + (isAlcoholic ? 2.0 : 0.0); 
    }

    /**
     * Override toString method to include alcohol status.
     * 
     * @return A string representation of the Alcohol object.
     */
    @Override
    public String toString() {
        return super.toString() + " | Alcoholic: " + isAlcoholic;
    }

    /**
     * Implements the equals method to compare Alcohol objects.
     * Two Alcohol objects are considered equal if they have the same name, size, and alcohol status.
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
        Alcohol alcohol = (Alcohol) obj; // Cast the object to Alcohol
        return isAlcoholic == alcohol.isAlcoholic &&
               Objects.equals(getName(), alcohol.getName()) &&
               getSize() == alcohol.getSize(); // Compare the relevant fields
    }

    /**
     * Override hashCode to match the equals method.
     * 
     * @return The hash code of the Alcohol object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSize(), isAlcoholic);
    }
}
