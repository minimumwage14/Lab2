
/**
 * Stock will compute the commision earned by a stock broker
 * Asks user to input price/share + number of shares
 * will output total value of shares + broker commision
 *
 * @author Jacob Antonio
 * @version 1.0
 * @since 9/14/2025
 */
import java.util.Scanner;
public class Stock
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    //define variables
    double numberOfShares;
    double pricePerShare;
    double sharesValue;
    final double commission; 
    double totalCost;
    
    //prompt user to enter Price per share + Number of shares
      System.out.println("Enter number of shares purchased: ");
        numberOfShares = keyboard.nextDouble();
      System.out.println("Enter price per share: ");
        pricePerShare = keyboard.nextDouble();
    //Calculate
    sharesValue = numberOfShares * pricePerShare;
    commission = sharesValue * 0.02;
    totalCost = sharesValue + commission;
    //print total share value, commission, and total cost
      System.out.println("Total cost of shares are: $" + sharesValue);
      System.out.println("Commission cost is: $" + commission);
      System.out.println("Total cost is: $" + totalCost);
  }
}