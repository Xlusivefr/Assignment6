package Classes;

/*
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This class simulates a beverage shop where customers can place orders.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit  
 */

import java.util.Scanner;

public class BevShopDriverApp {

    /**
     * The main method of the BevShopDriverApp. It initializes the shop and customers, 
     * processes customer input, and manages orders for beverages (alcohol, coffee, and smoothies).
     * 
     * 
     */
    public static void main(String[] args) {
        // Create the BevShop instance
        BevShop shop = new BevShop();

        // Create and add customers
        Customer customer1 = new Customer("Jedidiah", "Jayd232@gmail.com");
        Customer customer2 = new Customer("Sam", "Sampuck@gmail.com");
        shop.addCustomer(customer1);
        shop.addCustomer(customer2);

        // Start a new order for customer1 (Jedidiah)
        System.out.println("Start please a new order:");
        Order order1 = new Order();
        System.out.println("Your Total Order for now is " + order1.calcOrderTotal());
        Scanner scanner = new Scanner(System.in);

        // Jedidiah's (customer1) details
        System.out.println("Would you please enter your name?");
        String name = scanner.nextLine();
        System.out.println("Would you please enter your age?");
        int age = scanner.nextInt();
        scanner.nextLine(); // To consume the newline left by nextInt()

        System.out.println("Your age is " + age + " and your name is " + name);

        if (age >= 21) {
            System.out.println("Your age is above 20 and you are eligible to order alcohol");
        } else {
            System.out.println("Your age is not appropriate for alcohol drinks!");
        }

        // Ask if they want to add alcohol drinks
        System.out.println("Would you like to add an alcohol drink to your order? (Yes/No)");
        String addAlcohol = scanner.nextLine();

        if (addAlcohol.equalsIgnoreCase("Yes") && age >= 21) {
            addAlcoholBeveragesToOrder(order1, scanner);
        }

        // Ask if they want to add Coffee to their order
        System.out.println("Would you like to add a coffee to your order? (Yes/No)");
        String addCoffee = scanner.nextLine();

        if (addCoffee.equalsIgnoreCase("Yes")) {
            addCoffeeToOrder(order1, scanner);
        }

        // Display final order details for Jedidiah
        System.out.println("Total items on your order: " + order1.getBeverages().size());
        System.out.println("The Total Price on the Order: " + order1.calcOrderTotal());

        // Add a new order for customer2 (Sam)
        System.out.println("#------------------------------------#");
        System.out.println("Would you please start a new order");
        Order order2 = new Order();
        System.out.println("Would you please enter your name?");
        name = scanner.nextLine();
        System.out.println("Would you please enter your age?");
        age = scanner.nextInt();
        scanner.nextLine(); // To consume the newline left by nextInt()

        System.out.println("Your age is " + age + " and your name is " + name);
        System.out.println("The Total Price on the Order: " + order2.calcOrderTotal());

        // Ask if they want to add Smoothie to the order
        System.out.println("Would you like to add a smoothie to your order? (Yes/No)");
        String addSmoothie = scanner.nextLine();

        if (addSmoothie.equalsIgnoreCase("Yes")) {
            addSmoothieToOrder(order2, scanner);
        }

        // Ask if they want to add more smoothies or coffee
        System.out.println("Would you like to add another smoothie to your order? (Yes/No)");
        String addAnotherSmoothie = scanner.nextLine();
        if (addAnotherSmoothie.equalsIgnoreCase("Yes")) {
            addSmoothieToOrder(order2, scanner);
        }

        System.out.println("Would you like to add a coffee to your order? (Yes/No)");
        String addAnotherCoffee = scanner.nextLine();
        if (addAnotherCoffee.equalsIgnoreCase("Yes")) {
            addCoffeeToOrder(order2, scanner);
        }

        // Display final order details for Sam
        System.out.println("Total items on your order: " + order2.getBeverages().size());
        System.out.println("The Total Price on the Order: " + order2.calcOrderTotal());

        // Summary of all orders
        double totalAmount = order1.calcOrderTotal() + order2.calcOrderTotal();
        System.out.println("Total amount for all Orders: " + totalAmount);

        scanner.close(); // Close the scanner to avoid memory leak
    }

    /**
     * Adds alcohol beverages to the order.
     *
     * @param order The order to which beverages will be added.
     * @param scanner The Scanner object to get user input.
     */
    private static void addAlcoholBeveragesToOrder(Order order, Scanner scanner) {
        System.out.println("Which alcohol drink would you like to add (Beer, Wine, Whiskey)?");
        String drink = scanner.nextLine();
        order.addNewBeverage(drink, Size.MEDIUM, true, true);  // Add Alcohol beverage
        System.out.println("The current order of drinks is " + order.getBeverages().size());
        System.out.println("The Total Price on the Order is " + order.calcOrderTotal());
    }

    /**
     * Adds a coffee beverage to the order.
     *
     * @param order The order to which beverages will be added.
     * @param scanner The Scanner object to get user input.
     */
    private static void addCoffeeToOrder(Order order, Scanner scanner) {
        System.out.println("Which coffee would you like to add (e.g., Espresso, Latte, Cappuccino)?");
        String coffeeType = scanner.nextLine();
        order.addNewBeverage(coffeeType, Size.MEDIUM);  // Add Coffee
        System.out.println("Total items on your order is " + order.getBeverages().size());
        System.out.println("The Total Price on the Order: " + order.calcOrderTotal());
    }

    /**
     * Adds a smoothie beverage to the order.
     *
     * @param order The order to which beverages will be added.
     * @param scanner The Scanner object to get user input.
     */
    private static void addSmoothieToOrder(Order order, Scanner scanner) {
        System.out.println("Which smoothie would you like to add (e.g., Mango, Berry)?");
        String smoothieType = scanner.nextLine();
        order.addNewBeverage(smoothieType, Size.MEDIUM, 3, true);  // Add Smoothie
        System.out.println("The Total Price on the Order: " + order.calcOrderTotal());
    }
}