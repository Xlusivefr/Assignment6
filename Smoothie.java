package Classes;

/*
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This class represents a Smoothie beverage, extending the Beverage class.
 * It includes attributes for the number of fruits and whether protein powder is added. 
 * The class calculates the price based on the size, number of fruits, and whether protein is added.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Jedidiah Dawit  
*/

public class Smoothie extends Beverage {
    private int numOfFruits;  // The number of fruits in the smoothie
    private boolean addProtein;  // Flag to check if protein is added

    // Constructor for Smoothie
    public Smoothie(String name, Size size, int numOfFruits, boolean addProtein) {
        super(name, Type.SMOOTHIE, size);  // Calls the superclass constructor
        this.numOfFruits = numOfFruits;
        this.addProtein = addProtein;
    }

    // Implementing calculatePrice method from Beverage class
    @Override
    public double calculatePrice() {
        double basePrice = getBasePrice();  // Get base price from the Beverage class
        // Extra cost based on the number of fruits and whether protein is added
        double additionalPrice = (numOfFruits * 0.5) + (addProtein ? 1.0 : 0);  
        return basePrice + additionalPrice;  // Return total price
    }

    // Override toString method to return smoothie details, ensuring basePrice is formatted to two decimal places
    @Override
    public String toString() {
        // Call toString from Beverage and format the base price to two decimal places
        return super.toString().replaceAll("Base Price: \\d+(\\.\\d{1,2})?", "Base Price: " + String.format("%.2f", getBasePrice()));
    }
}
