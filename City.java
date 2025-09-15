/**
 * City prompts the user to enter the name of a city, which the app reads and returns:
 * Number of characters
 * City name in all caps
 * City name in all lowercase
 * First character of City name
 *
 * @author Jacob Antonio
 * @version 1.0
 * @since 9/14/2025
 */

import java.util.Scanner;

public class City
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      //variables
      String cityName;
      
      //prompt user + collect input
      System.out.println("Enter a city: ");
        cityName = keyboard.nextLine();
      
      //output
      System.out.println("The city entered has: " + cityName.length() + " chars");
      System.out.println("In upper case: " + cityName.toUpperCase());
      System.out.println("In lower case: " + cityName.toLowerCase());
      System.out.println("First character: " +cityName.charAt(0));
    }
}