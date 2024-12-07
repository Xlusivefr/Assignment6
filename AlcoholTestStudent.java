package Testing;

/*
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This test class confirms the functionality of the Alcohol class, 
 * including testing methods for retrieving attributes, calculating prices, 
 * and verifying the correctness of the equals and hashCode methods. 
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Jedidiah Dawit  
*/

import Classes.Size;
import Classes.Alcohol;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlcoholTestStudent {

    /**
     * Tests if the getName method returns the correct name of the beverage.
     */
    @Test
    void testGetName() {
        Alcohol alcohol = new Alcohol("Whiskey", Size.MEDIUM, true);
        assertEquals("Whiskey", alcohol.getName(), "The name should be 'Whiskey'");
    }

    /**
     * Tests if the getSize method returns the correct size of the beverage.
     */
    @Test
    void testGetSize() {
        Alcohol alcohol = new Alcohol("Whiskey", Size.MEDIUM, true);
        assertEquals(Size.MEDIUM, alcohol.getSize(), "The size should be 'MEDIUM'");
    }

    /**
     * Tests if the isAlcoholic method returns true for alcoholic beverages.
     */
    @Test
    void testIsAlcoholic() {
        Alcohol alcohol = new Alcohol("Whiskey", Size.MEDIUM, true);
        assertTrue(alcohol.isAlcoholic(), "The alcohol should be alcoholic");
    }

    /**
     * Tests if the calculatePrice method calculates the price correctly.
     */
    @Test
    void testCalculatePrice() {
        Alcohol alcohol = new Alcohol("Whiskey", Size.MEDIUM, true);
        assertEquals(5.0, alcohol.calculatePrice(), "The price should be the same as the base price plus an extra charge for alcohol");
    }

    /**
     * Tests if the toString method returns the expected string representation.
     */
    @Test
    void testToString() {
        Alcohol alcohol = new Alcohol("Whiskey", Size.MEDIUM, true);
        String expected = "Beverage: Whiskey, Type: ALCOHOL, Size: MEDIUM, Base Price: 3.00 | Alcoholic: true";
        assertEquals(expected, alcohol.toString(), "The toString method should return the correct string");
    }

    /**
     * Tests if the equals method correctly compares two Alcohol objects.
     */
    @Test
    void testEquals() {
        Alcohol alcohol1 = new Alcohol("Whiskey", Size.MEDIUM, true);
        Alcohol alcohol2 = new Alcohol("Whiskey", Size.MEDIUM, true);
        Alcohol alcohol3 = new Alcohol("Vodka", Size.SMALL, true);

        assertTrue(alcohol1.equals(alcohol2), "Alcohol objects with the same name, size, and alcoholic status should be equal");
        assertFalse(alcohol1.equals(alcohol3), "Alcohol objects with different properties should not be equal");
    }

    /**
     * Tests if the hashCode method generates the same hash code for equal objects.
     */
    @Test
    void testHashCode() {
        Alcohol alcohol1 = new Alcohol("Whiskey", Size.MEDIUM, true);
        Alcohol alcohol2 = new Alcohol("Whiskey", Size.MEDIUM, true);

        // Hash codes of equal objects should be the same
        assertEquals(alcohol1.hashCode(), alcohol2.hashCode(), "Hash codes of equal Alcohol objects should match");
    }

    /**
     * Main method to display the programmer's name.
     */
    public static void main(String[] args) {
        System.out.println("Programmer: Jedidiah Dawit");
    }
}
