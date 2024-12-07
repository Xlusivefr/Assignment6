package Testing;

/* 
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This test class checks the functionality of the Order class, 
 * testing methods for adding beverages (coffee, alcohol, smoothie), 
 * calculating the total order price, checking for weekend orders, 
 * and counting beverages by size.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit  
 */

import Classes.*;
import Classes.Size;
import Classes.Type;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTestStudent {

    /**
     * Tests adding a coffee beverage to the order.
     */
    @Test
    void testAddCoffee() {
        Order order = new Order();
        order.addNewBeverage("Latte", Size.MEDIUM);  // Adding a coffee beverage
        assertEquals(1, order.findNumOfBeveType(Type.COFFEE), "The order should have 1 coffee beverage.");
    }

    /**
     * Tests adding an alcohol beverage to the order.
     */
    @Test
    void testAddAlcohol() {
        Order order = new Order();
        order.addNewBeverage("Wine", Size.LARGE, false, false);  // Adding an alcohol beverage
        assertEquals(1, order.findNumOfBeveType(Type.ALCOHOL), "The order should have 1 alcohol beverage.");
    }

    /**
     * Tests adding a smoothie beverage to the order.
     */
    @Test
    void testAddSmoothie() {
        Order order = new Order();
        order.addNewBeverage("Strawberry Smoothie", Size.SMALL, 3, true);  // Adding a smoothie beverage
        assertEquals(1, order.findNumOfBeveType(Type.SMOOTHIE), "The order should have 1 smoothie beverage.");
    }

    /**
     * Tests the calculation of the total price of the order.
     */
    @Test
    void testCalcOrderTotal() {
        Order order = new Order();

        // Add beverages
        order.addNewBeverage("Latte", Size.MEDIUM);  // Adding a coffee beverage
        order.addNewBeverage("Wine", Size.LARGE, false, false);  // Adding an alcohol beverage
        order.addNewBeverage("Strawberry Smoothie", Size.SMALL, 3, true);  // Adding a smoothie beverage

        // Dynamically calculate the expected total
        double expectedTotal = 0.0;
        for (Beverage bev : order.getBeverages()) {
            expectedTotal += bev.calculatePrice();
        }

        // Compare calculated total with actual total
        double actualTotal = order.calcOrderTotal();
        assertEquals(expectedTotal, actualTotal, "The total should match the sum of beverage prices.");
    }

    /**
     * Tests if the order is marked as a weekend order.
     */
    @Test
    void testIsWeekend() {
        Order order = new Order();
        assertFalse(order.isWeekend(), "The order should not be on the weekend by default.");
    }

    /**
     * Tests getting the count of beverages by their size.
     */
    @Test
    void testGetBeverageCountBySize() {
        Order order = new Order();

        // Add beverages with different sizes
        order.addNewBeverage("Latte", Size.MEDIUM);
        order.addNewBeverage("Cappuccino", Size.MEDIUM);
        order.addNewBeverage("Wine", Size.LARGE);
        
        int mediumCount = order.getBeverageCountBySize(Size.MEDIUM);
        assertEquals(2, mediumCount, "There should be 2 beverages of size MEDIUM.");
        
        int largeCount = order.getBeverageCountBySize(Size.LARGE);
        assertEquals(1, largeCount, "There should be 1 beverage of size LARGE.");
    }
}

