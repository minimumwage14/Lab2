
/**
 * Tip will prompt a user to input the price of a meal
 * it will then use a tax rate of 6.75% and a tip of 20% (after tax)
 * to calculate the total cost of the meal.
 * 
 * Tip will output the tax on the meal, the tip cost of the meal,
 * and the total cost af the meal (tax + tip inlcuded)
 *
 * @author Jacob Antonio
 * @version 1.0
 * @since 9/14/2025
 */
import java.util.Scanner;
public class Tip
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    //define variables
    double mealAmount;
    final double taxAmount; 
    final double tipAmount;
    double totalCost;
    
    //prompt user to enter meal amount
      System.out.println("Enter meal amount: ");
        mealAmount = keyboard.nextDouble();
    
    //Calculate
    taxAmount = 0.0675 * mealAmount;
    tipAmount = 0.20 * (taxAmount + mealAmount);
    totalCost = mealAmount + taxAmount + tipAmount;
    //print total share value, commission, and total cost
      System.out.println("Tax amount is: $" + taxAmount);
      System.out.println("Tip amount is: $" + tipAmount);
      System.out.println("Total bill is: $" + totalCost);
  }
}