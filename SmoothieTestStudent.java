package Testing;

/* 
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This test class verifies the functionality of the Smoothie class, 
 * testing methods for getting attributes (name, size), calculating price, 
 * string representation, equality comparison, and hash code generation.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit  
 */

import Classes.Size;
import Classes.Smoothie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SmoothieTestStudent {

    /**
     * Test for the getName() method.
     * Confirms that the name of the smoothie is correctly returned.
     */
    @Test
    void testGetName() {
        Smoothie smoothie = new Smoothie("Strawberry Smoothie", Size.SMALL, 3, true);
        // Verifying that the getName() method returns the correct name.
        assertEquals("Strawberry Smoothie", smoothie.getName(), "The name should be 'Strawberry Smoothie'");
    }

    /**
     * Test for the getSize() method.
     * Confirms that the size of the smoothie is correctly returned.
     */
    @Test
    void testGetSize() {
        Smoothie smoothie = new Smoothie("Strawberry Smoothie", Size.SMALL, 3, true);
        // Verifying that the getSize() method returns the correct size.
        assertEquals(Size.SMALL, smoothie.getSize(), "The size should be 'SMALL'");
    }

    /**
     * Test for the calculatePrice() method.
     * Confirms that the price of the smoothie is calculated correctly based on the size,
     * number of fruits, and whether protein is added.
     */
    @Test
    void testCalculatePrice() {
        // The base price for SMALL size smoothie should be 2.0 as per the Beverage class
        Smoothie smoothie = new Smoothie("Strawberry Smoothie", Size.SMALL, 3, true);
        // Price breakdown: 2.0 (base price) + 3*0.5 (fruit cost) + 1.0 (protein cost)
        double expectedPrice = 2.0 + (3 * 0.5) + 1.0;  
        // Verifying that the calculated price matches the expected price
        assertEquals(expectedPrice, smoothie.calculatePrice(), 0.01, "The price should be calculated correctly.");
    }

    /**
     * Test for the toString() method.
     * Verifies that the string representation of the smoothie is correct.
     */
    @Test
    void testToString() {
        Smoothie smoothie = new Smoothie("Strawberry Smoothie", Size.SMALL, 3, true);
        // Expected string format based on the Beverage class and smoothie properties
        String expected = "Beverage: Strawberry Smoothie, Type: SMOOTHIE, Size: SMALL, Base Price: 2.00";
        // Verifying that the toString() method returns the correct string representation
        assertEquals(expected, smoothie.toString(), "The toString method should return the correct string.");
    }

    /**
     * Test for the equals() method.
     * Confirms that two smoothie objects with the same properties are considered equal,
     * while those with different properties are not equal.
     */
    @Test
    void testEquals() {
        Smoothie smoothie1 = new Smoothie("Strawberry Smoothie", Size.SMALL, 3, true);
        Smoothie smoothie2 = new Smoothie("Strawberry Smoothie", Size.SMALL, 3, true);
        Smoothie smoothie3 = new Smoothie("Mango Smoothie", Size.LARGE, 5, false);

        // Verifying that two smoothies with the same properties are equal
        assertTrue(smoothie1.equals(smoothie2), "Two smoothie objects with the same properties should be equal.");
        // Verifying that two smoothies with different properties are not equal
        assertFalse(smoothie1.equals(smoothie3), "Smoothie objects with different properties should not be equal.");
    }

    /**
     * Test for the hashCode() method.
     * Confirms that the hashCode for two equal smoothie objects is the same,
     * while for different smoothie objects it should be different.
     */
    @Test
    void testHashCode() {
        Smoothie smoothie1 = new Smoothie("Strawberry Smoothie", Size.SMALL, 3, true);
        Smoothie smoothie2 = new Smoothie("Strawberry Smoothie", Size.SMALL, 3, true);
        Smoothie smoothie3 = new Smoothie("Mango Smoothie", Size.LARGE, 5, false);

        // Verifying that hashCodes for equal smoothies are the same
        assertEquals(smoothie1.hashCode(), smoothie2.hashCode(), "Hash codes for equal smoothie objects should be the same.");
        // Verifying that hashCodes for different smoothies are not the same
        assertNotEquals(smoothie1.hashCode(), smoothie3.hashCode(), "Hash codes for different smoothie objects should not be the same.");
    }
}
