/*
   BankAcct.java: This is our fifth lesso. We are learning how to spend on simple variables with more of the primitive data types. Through a Java update released in a prior version, it now uses the printf method to format currency. 
   It also introduces Decision Structures by utilizing Binary Bypass (Single Alternative) Decisions and Binary Choice (Dual Alternative) Decisions. As well as condition statements that use relational operators and condition statements that use Boolean flags.
   We will continue to take input for user data.
   Athored by: Gabriel Vargas Pastrana
   CMP128-23124: Computer Science I
   Spring 2024
   Professor Tirrito
   County College of Morris
   Date Last Modified: 02/27/2024
*/

import java.util.Scanner;

public class BankAcct
{
   public static void main(String [] args)
   {
      // Variable Initializations Area
      String fName = "" , mI = "" , lName = "" , street = "" , apt = "" , state = "" , zip = "" , acctNum = "" , city = "" ;
      double startBal = 0.0 , endBal = 0.0 , transAmt = 0.0 ;
      char acctType = ' ' , transType = ' ' ;
      float intRate = 0.0f ;
      boolean posBal = false , hasApt = false;
      
      Scanner keyboard = new Scanner(System.in) ;
      
      // Collecting Variable Data From User Via Input Statements
      System.out.print("Please Enter the Customer's First Name --> ") ;
      fName = keyboard.nextLine() ;
      System.out.print("Please Neter the Customer's Middle Initial --> ") ;
      mI = keyboard.nextLine() ; 
      System.out.print("Please Enter the Customer's Last Name --> " ) ;
      lName = keyboard.nextLine() ;
      System.out.print("Please Enter the Customer's Street Address --> " ) ;
      street = keyboard.nextLine() ;
      System.out.print("Do you live in an Apartmet Building? (true or false) --> " ) ;
      hasApt = keyboard.nextBoolean() ;
      keyboard.nextLine() ; // Emptyin the remaining newLine character from the input buffer
      
      if ( hasApt == true )
      {
         System.out.print("Please Enter the Customer's Apartment Number --> ") ;
         apt = keyboard.nextLine() ;
      }
      
      System.out.print("Please Enter the Customer's City --> " ) ;
      city = keyboard.nextLine() ;
      System.out.print("Please Enter the Customer's State --> " ) ;
      state = keyboard.nextLine() ;
      System.out.print("Please Enter the Customer's Zip Code --> " ) ;
      zip = keyboard.nextLine() ;
      System.out.print("Please Enter the Customer's Account Number --> " ) ;
      acctNum = keyboard.nextLine() ;
      System.out.print("Please Enter the Customer's Account Type as a Single Character (C = Checking, S = Savings) --> " ) ;
      acctType = (keyboard.nextLine()).charAt(0) ;
      System.out.print("Please Enter the Customer's Transaction Type as a Sincle Character (D = Deposit, W = Withdrawal) --> " ) ;
      transType = (keyboard.nextLine()).charAt(0) ;
      System.out.print("Please Enter the Customer's Starting Balance --> $" ) ;
      startBal = keyboard.nextDouble() ;
      System.out.print("Please Enter the Customer's Transaction Amount --> $" ) ;
      transAmt = keyboard.nextDouble() ;
      
      if ( acctType == 'S' || acctType == 's' )
      {
      System.out.print("Please Enter the Customer's Interest Rate for this Account (as a floating-point number, not a whole percentage) --> " ) ;
      intRate = keyboard.nextFloat() ;
      }
      
      keyboard.nextLine() ; // Flushing the input buffer as a courtesy to any future potential input
      // End of User Data Inputs Area
       
      // Display Welcome Banner
      System.out.println("************************************************************") ;
      System.out.println("*          Welcome to the Bank Account App. v. 1.0         *") ;
      System.out.println("*            Written by: Gabriel Vargas Pastrana           *") ;
      System.out.println("*                 Date Modified: 02/27/2024                *") ;
      System.out.println("************************************************************") ;
      
      // Calculatin the ending balance based on whether we are processing a withdrawal or a deposit. The false path is for the withdrawal. Anything other than a deposit is assumed to be a withdrawal.
      if ( transType == 'D' || transType == 'd' )
      {
         endBal = startBal + transAmt ;
      } // end of true path
      else
      {
         endBal = startBal - transAmt ;
      } // end of false path
      
      // Determing if we have a positive ending balence or a negative ending balance so we can update the boolean flag for posBal
      
      if ( endBal >= 0.0 )
      {
         posBal = true; // this ensures costume's won't be charged overdraft fees if their accounts are in good standing.
      } // end of true path
      else
      {
         posBal = false; // alwats flip your flag back to false on the false path, rather then taking for granted that it was defaulted to false at initialization.
      } // end of false path
      
      // displaying all of the account information after processing the transaction
      System.out.println("Account Owner: " + fName + " " + mI + " " + lName + "\n") ;
      
      System.out.println("Account Type: " + acctType + "\n") ;
      
      System.out.println("Account Number: " + acctNum + "\n") ;
      
      System.out.println("Customer Address: ") ;
      System.out.println("----------------") ;
      System.out.println(street) ;
      if (hasApt)
      {
         System.out.println("Apt. #" + apt) ;
         apt = keyboard.nextLine() ;
      } // end of true path and entire binary bypass decision structure
      
      System.out.println(city + ", " + state + " " + zip + "\n") ;
      
      System.out.printf("Starting Account Balane --> $%.2f\n" , startBal) ;
      System.out.printf("Transaction Amount --> $%.2f\n" , transAmt) ;
      System.out.println("Transaction Type --> " + transType) ;
      System.out.printf("Ending Account Balance --> $%.2f\n", endBal) ;
      
      if ( posBal )
      {
         System.out.println("\nThe account currently has a positive balance and remains in good standing!") ;
      } // end of true path
      else
      {
         System.out.println("\nWARNING! Your account currently has a negative balance due to a withdrawal the exceeded the starting balance. \nYour account is in poor standing, as you have gone below $0 and also incurred a $35 Overdraft Fee.\nYou must Pay $" + (endBal -= 35.00) + 
         " within the next 10 days to avoid further fees and collections processing. \n") ;
      } // end of false path
      
      // Display last Banner
      System.out.println("************************************************************") ;
      System.out.println("*       Thanks for Using the Bank Account App. v. 1.0      *") ;
      System.out.println("*            Written by: Gabriel Vargas Pastrana           *") ;
      System.out.println("*                 Date Modified: 02/27/2024                *") ;
      System.out.println("************************************************************") ;
      
   } // End of main method.
} // End of public class BankAcct