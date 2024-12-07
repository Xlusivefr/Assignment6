package Classes;

/*
 * Class: CMSC203 
 * Instructor: Dr.Grinberg 
 * Description: This class represents a day of the week. It provides methods to get 
 * the day's name, check if the day is a weekend, and return a string representation 
 * of the day.
 * Due: 12/9/24 
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jedidiah Dawit  
 */

public class Day {
    private String dayName;

    /**
     * Constructor for Day. Initializes the day with a given name.
     * 
     * @param dayName The name of the day.
     */
    public Day(String dayName) {
        this.dayName = dayName;
    }

    /**
     * Getter for the day name.
     * 
     * @return The name of the day.
     */
    public String getDayName() {
        return dayName;
    }

    /**
     * Checks if the day is a weekend (Saturday or Sunday).
     * 
     * @return true if the day is a weekend, false otherwise.
     */
    public boolean isWeekend() {
        return dayName.equals("Saturday") || dayName.equals("Sunday");
    }

    /**
     * Returns a string representation of the day.
     * 
     * @return The name of the day as a string.
     */
    @Override
    public String toString() {
        return "Day: " + dayName;
    }
}