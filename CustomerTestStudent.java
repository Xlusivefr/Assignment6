package Testing;

/* 
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This test class confirms the functionality of the Customer class, 
 * including tests for the constructor, getters, setters, equality, and string representation.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit  
 */

import static org.junit.jupiter.api.Assertions.*;
import Classes.Customer;
import org.junit.jupiter.api.Test;

public class CustomerTestStudent {

    /**
     * Tests the constructor of the Customer class to ensure proper initialization.
     */
    @Test
    public void testCustomerConstructor() {
        Customer customer = new Customer("Jedidiah Dawit", "Jayd232@gmail.com");
        assertEquals("Jedidiah Dawit", customer.getName(), "The name should be 'Jedidiah Dawit'");
        assertEquals("Jayd232@gmail.com", customer.getEmail(), "The email should be 'Jayd232@gmail.com'");
    }

    /**
     * Tests the setters and getters of the Customer class for correctness.
     */
    @Test
    public void testSettersAndGetters() {
        Customer customer = new Customer("Sam Pucket", "Sampuck@gmail.com");

        // Test setter and getter for name
        customer.setName("New Name");
        assertEquals("New Name", customer.getName(), "The name should be updated to 'New Name'");

        // Test setter and getter for email
        customer.setEmail("Sampuck@gmail.com");
        assertEquals("Sampuck@gmail.com", customer.getEmail(), "The email should be updated to 'Sampuck@gmail.com'");
    }

    /**
     * Tests the toString method of the Customer class for accurate string representation.
     */
    @Test
    public void testToString() {
        Customer customer = new Customer("Jedidiah Dawit", "Jayd232@gmail.com");
        String expected = "Customer Name: Jedidiah Dawit, Email: Jayd232@gmail.com";
        assertEquals(expected, customer.toString(), "The toString method should return the correct string representation");
    }

    /**
     * Tests the equals method of the Customer class for proper equality comparison.
     */
    @Test
    public void testEquals() {
        Customer customer1 = new Customer("Jedidiah Dawit", "Jayd232@gmail.com");
        Customer customer2 = new Customer("Jedidiah Dawit", "Jayd232@gmail.com");
        Customer customer3 = new Customer("Sam Pucket", "Sampuck@gmail.com");

        assertTrue(customer1.equals(customer2), "Two customers with the same name and email should be equal");
        assertFalse(customer1.equals(customer3), "Customers with different name or email should not be equal");
    }

    /**
     * Main method to display the programmer's name.
     */
    public static void main(String[] args) {
        System.out.println("Programmer: Jedidiah Dawit");
    }
}
