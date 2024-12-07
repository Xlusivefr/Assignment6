package Testing;

/* 
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This test class confirms the functionality of the BevShop class, 
 * including tests for adding beverages and customers, calculating total prices, 
 * and validating the toString method.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit  
 */

import Classes.Alcohol;
import Classes.BevShop;
import Classes.Customer;
import Classes.Size;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BevShopTestStudent {

    /**
     * Tests if the addBeverage method in BevShop adds a beverage to the list successfully.
     */
    @Test
    void testAddBeverage() {
        // Create a BevShop instance
        BevShop shop = new BevShop();
        
        // Create an Alcohol instance
        Alcohol alcohol = new Alcohol("Whiskey", Size.MEDIUM, true);
        
        // Add the beverage to the shop
        shop.addBeverage(alcohol);
        
        // Verify that the beverage list size increases
        assertEquals(1, shop.getBeverages().size(), "The shop should have 1 beverage");
    }

    /**
     * Tests if the addCustomer method in BevShop adds a customer to the customer list correctly.
     */
    @Test
    void testAddCustomer() {
        // Create a BevShop instance
        BevShop shop = new BevShop();
        
        // Create a Customer instance
        Customer customer = new Customer("Jedidiah Dawit", "Jayd232@gmail.com");
        
        // Add the customer to the shop
        shop.addCustomer(customer);
        
        // Verify that the customer list size increases
        assertEquals(1, shop.getCustomers().size(), "The shop should have 1 customer");
    }

    /**
     * Tests if the total price of all beverages in the shop is calculated correctly.
     */
    @Test
    void testGetTotalPrice() {
        // Create a BevShop instance
        BevShop shop = new BevShop();
        
        // Create an Alcohol instance
        Alcohol alcohol = new Alcohol("Whiskey", Size.MEDIUM, true);
        
        // Add the beverage to the shop
        shop.addBeverage(alcohol);
        
        // Verify that the total price matches the beverage's price
        assertEquals(5.0, shop.getTotalPrice(), "The total price should be 5.0");
    }

    /**
     * Tests if the toString method of BevShop provides the correct string representation.
     */
    @Test
    void testToString() {
        // Create a BevShop instance
        BevShop shop = new BevShop();
        
        // Create an Alcohol instance
        Alcohol alcohol = new Alcohol("Whiskey", Size.MEDIUM, true);
        
        // Create a Customer instance
        Customer customer = new Customer("Jedidiah Dawit", "Jayd232@gmail.com");
        
        // Add the beverage and customer to the shop
        shop.addBeverage(alcohol);
        shop.addCustomer(customer);
        
        // Expected output from toString method
        String expected = "Beverage: Whiskey, Type: ALCOHOL, Size: MEDIUM, Base Price: 3.00 | Alcoholic: true";
        
        // Verify if the toString method contains the expected string
        assertTrue(shop.toString().contains(expected), "The toString method should include the beverage information");
    }

    /**
     * Prints the programmer's name at the end of the test execution.
     */
    public static void main(String[] args) {
        System.out.println("Programmer: Jedidiah Dawit");
    }
}
