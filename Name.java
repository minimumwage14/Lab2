
/**
 * Name will ask you to input your first, middledle, and last name on your keyboard
 * it will then print your name back to you, as well as your initials
 * @author Jacob Antonio
 * @version 1.0
 * @since 9/14/2025
 */

import java.util.Scanner;

public class Name
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    //define variables for full name and initials
      String firstName;
      String middleName;
      String lastName;
      char firstInitial;
      char middleInitial;
      char lastInitial;
    
    //prompt user to input name + use input to define variables
      System.out.println("Enter your first name:");
        firstName = keyboard.next();
        firstInitial = firstName.charAt(0);
      System.out.println("Enter your middle name:");
        middleName = keyboard.next();
        middleInitial = middleName.charAt(0);
      System.out.println("Enter your last name:");  
        lastName = keyboard.next();
        lastInitial = lastName.charAt(0);
    
    //print user name and initials
      System.out.println("My name is " + firstName + " " +middleName + " " + lastName);
      System.out.println("My initials are " + firstInitial + middleInitial + lastInitial);
  }
}