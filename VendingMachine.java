// Carlos John Escala
// September 4th, 2024
// Lab 5 Vending Machine
// This program calculates the change from a purchase

//Cited from book page 125
import java.util.Scanner;
public class VendingMachine
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
    // ^^ now u instantiated the scanner u can use it
        System.out.println("Enter the cost of the item in cents (We only have 1 dollar or less items)");
    // ^^ what you want the user to type so that they think that the code runs & isn't broken
        int itemCost = keyboard.nextInt();
        System.out.println ("You bought an item for " + itemCost + " cents and you gave me a dollar");
        if (itemCost < 35)
        {
            System.out.println ("Error: Item cannot cost less than 35 cents");
        }
        else if (itemCost > 100)
        {
            System.out.println ("Error: Item costs more than a dollar");
        }
        else if (itemCost % 5 != 0)
        {
            System.out.println ("Error: Must be within 5 cent increment");
        }
        else 
        {

        int amount = 100 - itemCost;
        int quarters, dimes, nickels;
        quarters = amount / 25;
        amount = amount % 25;
        dimes = amount / 10;
        nickels = amount / 5;
        
        System.out.println ("so your change is: \n"
        + quarters + "quarters\n"
        + dimes + "dimes\n"
        + nickels + "nickels\n");
        }
    }
}