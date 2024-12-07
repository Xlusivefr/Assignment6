package Classes;

/*
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This class represents an order in the BevShop. It allows for adding 
 * different types of beverages to the order and calculating the total price. It also 
 * includes methods to count beverages of a certain type and size, and to check if 
 * the order is placed on a weekend.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit  
 */


import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<Beverage> beverages;

    /**
     * Constructor for Order. Initializes an empty list of beverages.
     */
    public Order() {
        beverages = new ArrayList<>();
    }

    /**
     * Adds a new Coffee beverage to the order.
     * 
     * @param name The name of the coffee.
     * @param size The size of the coffee.
     */
    public void addNewBeverage(String name, Size size) {
        beverages.add(new Coffee(name, size));
    }

    /**
     * Adds a new Alcohol beverage to the order.
     * 
     * @param name The name of the alcohol.
     * @param size The size of the alcohol.
     * @param weekend Indicates if the order is made on a weekend.
     * @param ageVerified Indicates if the customer's age is verified.
     */
    public void addNewBeverage(String name, Size size, boolean weekend, boolean ageVerified) {
        beverages.add(new Alcohol(name, size, weekend));
    }

    /**
     * Adds a new Smoothie beverage to the order.
     * 
     * @param name The name of the smoothie.
     * @param size The size of the smoothie.
     * @param numOfFruits The number of fruits in the smoothie.
     * @param proteinPowder Indicates if protein powder is added.
     */
    public void addNewBeverage(String name, Size size, int numOfFruits, boolean proteinPowder) {
        beverages.add(new Smoothie(name, size, numOfFruits, proteinPowder));
    }

    /**
     * Calculates the total price of the order by summing the price of all beverages.
     * 
     * @return The total price of the order.
     */
    public double calcOrderTotal() {
        double total = 0.0;
        for (Beverage beverage : beverages) {
            total += beverage.calculatePrice();
        }
        return total;
    }

    /**
     * Finds the number of beverages of a specific type in the order.
     * 
     * @param type The type of beverage to count.
     * @return The count of beverages of the specified type.
     */
    public int findNumOfBeveType(Type type) {
        int count = 0;
        for (Beverage beverage : beverages) {
            if (beverage.getType() == type) {
                count++;
            }
        }
        return count;
    }

    /**
     * Checks if the order was placed on a weekend.
     * 
     * @return true if the order is placed on a weekend, false otherwise.
     */
    public boolean isWeekend() {
        // Stub implementation, assuming default is false
        return false;
    }

    /**
     * Returns a list of all beverages in the order.
     * 
     * @return A list of beverages.
     */
    public List<Beverage> getBeverages() {
        return beverages;
    }

    /**
     * Counts the number of beverages of a specific size in the order.
     * 
     * @param size The size of the beverages to count.
     * @return The count of beverages of the specified size.
     */
    public int getBeverageCountBySize(Size size) {
        int count = 0;
        for (Beverage beverage : beverages) {
            if (beverage.getSize() == size) {
                count++;
            }
        }
        return count;
    }
}
