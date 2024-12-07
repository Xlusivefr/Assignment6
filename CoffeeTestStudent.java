package Testing;

/* 
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This test class checks the functionality of the Coffee class, 
 * including tests for retrieving attributes, calculating prices, 
 * and validating equality and hash codes for Coffee objects.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit  
 */

import Classes.Size;
import Classes.Coffee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoffeeTestStudent {

    /**
     * Tests if the getName method returns the correct name of the coffee.
     */
    @Test
    void testGetName() {
        Coffee coffee = new Coffee("Latte", Size.MEDIUM);
        assertEquals("Latte", coffee.getName(), "The name should be 'Latte'");
    }

    /**
     * Tests if the getSize method returns the correct size of the coffee.
     */
    @Test
    void testGetSize() {
        Coffee coffee = new Coffee("Latte", Size.MEDIUM);
        assertEquals(Size.MEDIUM, coffee.getSize(), "The size should be 'MEDIUM'");
    }

    /**
     * Tests if the calculatePrice method calculates the price correctly.
     */
    @Test
    void testCalculatePrice() {
        Coffee coffee = new Coffee("Latte", Size.MEDIUM);
        assertEquals(3.0, coffee.calculatePrice(), "The price should be 3.0 for a medium coffee");
    }

    /**
     * Tests if the toString method returns the expected string representation of the Coffee object.
     */
    @Test
    void testToString() {
        Coffee coffee = new Coffee("Latte", Size.MEDIUM);
        String expected = "Beverage: Latte, Type: COFFEE, Size: MEDIUM, Base Price: 3.00";
        assertEquals(expected, coffee.toString(), "The toString method should return the correct string");
    }

    /**
     * Tests if the equals method correctly compares two Coffee objects.
     */
    @Test
    void testEquals() {
        Coffee coffee1 = new Coffee("Latte", Size.MEDIUM);
        Coffee coffee2 = new Coffee("Latte", Size.MEDIUM);
        Coffee coffee3 = new Coffee("Espresso", Size.SMALL);

        assertTrue(coffee1.equals(coffee2), "Two Coffee objects with the same name and size should be equal");
        assertFalse(coffee1.equals(coffee3), "Coffee objects with different properties should not be equal");
    }

    /**
     * Tests if the hashCode method generates consistent hash codes for equal objects.
     */
    @Test
    void testHashCode() {
        Coffee coffee1 = new Coffee("Latte", Size.MEDIUM);
        Coffee coffee2 = new Coffee("Latte", Size.MEDIUM);
        Coffee coffee3 = new Coffee("Espresso", Size.SMALL);

        assertEquals(coffee1.hashCode(), coffee2.hashCode(), "Hash codes for equal Coffee objects should be the same");
        assertNotEquals(coffee1.hashCode(), coffee3.hashCode(), "Hash codes for different Coffee objects should not be the same");
    }

    /**
     * Main method to display the programmer's name.
     */
    public static void main(String[] args) {
        System.out.println("Programmer: Jedidiah Dawit");
    }
}
