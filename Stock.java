
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
    double commission; 
    double totalCostShares;
    final double COMM_RATE = 0.02;
    //prompt user to enter Price per share + Number of shares
      System.out.println("Enter number of shares purchased: ");
        numberOfShares = keyboard.nextDouble();
      System.out.println("Enter price per share: ");
        pricePerShare = keyboard.nextDouble();
    //Calculate
    sharesValue = numberOfShares * pricePerShare;
    commission = sharesValue * COMM_RATE;
    totalCostShares = sharesValue + commission;
    //print total share value, commission, and total cost
      System.out.printf("Total cost of shares are: $%,.2f\nCommission cost is: $ %,.2f\nTotal Cost is: $%,.2f",
      sharesValue, commission, totalCostShares);
  }
}