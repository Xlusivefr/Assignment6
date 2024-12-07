package Classes;

/*
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This class represents a customer with a name and email. 
 * It provides methods to get and set these attributes, and a method to return 
 * a string representation of the customer. It also includes a copy constructor 
 * for creating a new customer from an existing one.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit  
 */


public class Customer {
    private String name;
    private String email;

    /**
     * Constructor for Customer. Initializes a customer with a given name and email.
     * 
     * @param name The name of the customer.
     * @param email The email of the customer.
     */
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Copy constructor for creating a new Customer from an existing one.
     * 
     * @param other The customer to copy from.
     */
    public Customer(Customer other) {
        this.name = other.name;
        this.email = other.email;
    }

    /**
     * Getter for the customer's name.
     * 
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the customer's name.
     * 
     * @param name The new name to set for the customer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the customer's email.
     * 
     * @return The email of the customer.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for the customer's email.
     * 
     * @param email The new email to set for the customer.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Compares two Customer objects for equality based on their name and email.
     * 
     * @param obj The object to compare.
     * @return true if the customers are the same, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Check if the objects are the same instance
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Check for null or different class
        }
        Customer customer = (Customer) obj; // Cast the object to Customer
        return name.equals(customer.name) && email.equals(customer.email); // Compare name and email
    }

    /**
     * Returns a string representation of the customer.
     * 
     * @return A string containing the customer's name and email.
     */
    @Override
    public String toString() {
        return String.format("Customer Name: %s, Email: %s", name, email);
    }
}
