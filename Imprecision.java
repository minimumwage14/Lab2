
/**
 * Hi chat this is a class that shows how large numbers can create imprecision in Java
 * We will be using a large number for x and showing how x/x is close but not equal to 1
 *
 * @author Jacob Antonio
 * @version 1.1
 * @since 9/7/2025
 */
public class Imprecision
{ 
    public static void main(String[]args){
        double x = 12345.6789e200;
        double y,z;
        y= 1/x;
        z = x*y;
        System.out.println(" The value of x is " + x);
        System.out.println(" The value of y is " + y);
        System.out.println(" The value of z is " + z);
        System.out.println ("The value of 1-z is: " + (1-z));
}
}