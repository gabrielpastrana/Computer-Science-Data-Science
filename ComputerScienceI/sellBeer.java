/*
   sellBeer.java: This is our sixth Java lesson. We are incorporating Chapter 3 concets of decision structures. These structures use boolean logic to produce a true path and a false path for each decision. There will be two questions we are asking in this program, with the second question being dependent 
   on the outcome of the first question. This interdependency relies on a positive answer, so there will be nesting on the true path. Our program will process one set of binary choice decision structure. These decision structures will help us determine two key factors behind when we can sell beer to a 
   customer vs. when we must deny the sale. Our program will act like a cash register that calculates a subtotal, a sales tax, a grand total and outputs a formatted receipt of the transaction.
   Authored by: Gabriel Vargas Pastrana
   CMP128-23124: Computer Science I
   Spring 2024
   Professor Tirrito
   County College of Morris
   Date Last Modified: 03/05/2024
*/

// java external class import statements area - to include classes from the java libraries
import java.util.Scanner;//to teach our source code how to use the scanner methods from the java utilities library

import javax.swing.JOptionPane;// to teach our source code how to use the JOptionPane methods from the javax swing library

// defining the public class and public main method
public class sellBeer
{
   public static void main(String [] args)
   {
      // initializing variables
      double price = 0.0 , subtotal = 0.0 , salesTax = 0.0 , grandTotal = 0.0;
      int quantity = 0;
      final float SALES_TAX_RATE = 0.05f;
      boolean hasId = false, proves21 = false;
      Scanner keyboard = new Scanner(System.in);
      String borderLine = "";
      
      // Display Welcome Banner
      for(int i = 0 ; i < 60 ; i++)
      {
            borderLine += "*";
      } // end of for loop
      borderLine += "\n";
      System.out.print(borderLine);
      System.out.println("*           Welcome to the Sell Beer App. v. 1.0           *") ;
      System.out.println("*            Written by: Gabriel Vargas Pastrana           *") ;
      System.out.println("*                 Date Modified: 03/05/2024                *") ;
      System.out.print(borderLine);
      
      // promt and get the id
      System.out.println("Ask the cosumer to provide their approved government id.");
      
      System.out.print("Did the costumer give you their ID? (true or false) ==> ");
      hasId = keyboard.nextBoolean();
      
      if(hasId)
      {
         System.out.print("Did the ID prove the costumer is at least 21 years old? (true or false) ==> ");
         proves21 = keyboard.nextBoolean();
         
         if(proves21)
         {
            System.out.println("Please give the ID back to your Customer. ");
            
            System.out.println("Your customer has proven they are legaly allowed to purchase beer.\nProceed with the sale.");
            
            //collecting the price and quantity
            price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of beer ==> "));
            
            quantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity of beer ==> "));
            
            // calculating the results
            subtotal = price * quantity;
            salesTax = subtotal * SALES_TAX_RATE;
            grandTotal = subtotal + salesTax;
            
            // display the formatted receipt
            System.out.print(borderLine);
            System.out.println("*                       SALES RECEIPT                      *");
            System.out.print(borderLine);
            System.out.printf("Beer\tQuantity: %d\tPrice: $%.2f\n", quantity, price);
            System.out.print(borderLine);
            System.out.printf("Subtotal: $%.2f\n", subtotal);
            System.out.printf("Sales Tax: $%.2f\n", salesTax); 
            System.out.printf("Grand Total: $%.2f\n", grandTotal);
            System.out.print(borderLine);
            System.out.println("*               Thank you for your purchase!               *");
            
            
            
         } //end of true path for proves21
         else
         {
            System.out.println("Your costumer is under the age of 21. DO NOT SELL BEER to minors! \nPlease scort the customer out of the store");
         
            JOptionPane.showMessageDialog(null,"Your costumer is under the age of 21. DO NOT SELL BEER to minors! \nPlease scort the customer out of the store");
         } //end of false path for proves 21
      } // end of true pathfor hasID
      else
      {
         System.out.println("Your costumer does not have ID. DO NOT SELL BEER to customers \nwhose age you cannot validate with proper governmental ID!\nAsk the costumer to come back with his ID.");
         
         JOptionPane.showMessageDialog(null,"Your customer does not have ID. DO NOT SELL BEER \nto customers whose age you cannot validate with propet governmental ID!\nAsk the customer to come back with their ID");
      } // end of false path for hasId
      
      // display the closing banner
      System.out.print(borderLine);
      System.out.println("*         Thank you for Using the Beer App. v. 1.0         *") ;
      System.out.println("*            Written by: Gabriel Vargas Pastrana           *") ;
      System.out.println("*                 Date Modified: 03/05/2024                *") ;
      System.out.print(borderLine);
      
   }// end of public main method
}// end of public class method