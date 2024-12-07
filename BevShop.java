package Classes;

/*
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This class represents a beverage shop, where beverages and customers are managed. 
 * It allows adding beverages and customers, calculating the total price of all beverages, and retrieving lists of beverages and customers.
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

public class BevShop {
    private List<Beverage> beverages;
    private List<Customer> customers;

    /**
     * Constructor for the BevShop class. Initializes the lists for beverages and customers.
     */
    public BevShop() {
        beverages = new ArrayList<>();
        customers = new ArrayList<>();
    }

    /**
     * Adds a beverage to the shop's beverage list.
     * 
     * @param beverage The beverage to add.
     */
    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    /**
     * Adds a customer to the shop's customer list.
     * 
     * @param customer The customer to add.
     */
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    /**
     * Calculates the total price for all beverages in the shop.
     * 
     * @return The total price for all beverages.
     */
    public double getTotalPrice() {
        double total = 0;
        for (Beverage beverage : beverages) {
            total += beverage.calculatePrice(); // Sum up the prices of all beverages
        }
        return total;
    }

    /**
     * Retrieves the list of all beverages in the shop.
     * 
     * @return A list of all beverages.
     */
    public List<Beverage> getBeverages() {
        return beverages;
    }

    /**
     * Retrieves the list of all customers in the shop.
     * 
     * @return A list of all customers.
     */
    public List<Customer> getCustomers() {
        return customers;
    }

    /**
     * Returns a string representation of the beverage shop, including details about all beverages and customers.
     * 
     * @return The string representation of the beverage shop.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Beverages:\n");
        for (Beverage beverage : beverages) {
            sb.append(beverage.toString()).append("\n"); // Append details for each beverage
        }

        sb.append("Customers:\n");
        for (Customer customer : customers) {
            sb.append(customer.toString()).append("\n"); // Append details for each customer
        }

        return sb.toString();
    }
}