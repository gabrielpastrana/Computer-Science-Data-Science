/*
   Binary.java: This program introduces concepts of arimethic expressions in programming through Java arimethic operators. We lear how and why to perform two different kinds of division in Java;
   quotient division AND modulus division. Our example teaches how to convert a decimal number (Base-10) to a binary number (Base-2) which requires knowing the quotient and the remainder of a division. 
   We would also declare and assign values to several integer variables to save data temporarily for each of the eight bits in the converted binary number, as well as a temporary variable to sore the remainder on each calculation,
   that we will then swap into a bit variable.
   We would also have a variable that keeps track of the number we need to convert. We would also use output statements to present the converted information by taking advantage of String concatenation to string together the binary digits (bits).
   Finally, we will collect a new integer to convert to binary from the user and do it all over again.
   Athored by: Gabriel Vargas Pastrana
   CMP128-23124: Computer Science I
   Spring 2024
   Professor Tirrito
   County College of Morris
   Date Last Modified: 02/20/2024
*/
import java.util.Scanner;

public class Binary
{
   public static void main(String [] args)
   {
      int numToConvert = 0;
      int bitOne = 0;
      int bitTwo = 0;
      int bitThree = 0;
      int bitFour = 0;
      int bitFive = 0;
      int bitSix = 0;
      int bitSeven = 0;
      int bitEight = 0;
      int remainder = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      // Display Welcome Banner
      System.out.println("************************************************************");
      System.out.println("*        Welcome to the Binary Number Converter App.       *");
      System.out.println("*            Written by: Gabriel Vargas Pastrana           *");
      System.out.println("*                 Date Modified: 02/20/2024                *");
      System.out.println("************************************************************");
      
      // Display details Number Convert
      System.out.println("This program will take a Decimal Number and conver it to a Base-2 Binary Number to ilustrate how a computer converts our characters to machine code." +
      " For this first conversion, we will use the example of the capital letter A, which is 65 (Base-10) on the ASC/UNICODE Character Map. \n");
      
      // Calculatin the Binary Conversion Value
      numToConvert = 65;
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitEight = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitSeven = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitSix = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitFive = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitFour = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitThree = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitTwo = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitOne = remainder;
      
      
      // Display the Results
      System.out.println("The conversion to binary has completed!\n\n65 (Base-10) in Binary is: " + bitOne + bitTwo + bitThree + bitFour + bitFive + bitSix + bitSeven + bitEight + ".\n");
      
      // Collecting Input from the User for next number to convert
      System.out.println("Enter a new Base-10 Number to Convert to Binary: ");
      numToConvert = keyboard.nextInt();
      
      int userNumber = numToConvert;
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitEight = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitSeven = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitSix = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitFive = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitFour = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitThree = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitTwo = remainder;
      
      
      remainder = numToConvert % 2;
      
      numToConvert = numToConvert / 2;
      
      bitOne = remainder;
      
      
      // Display the Results
      System.out.println("The conversion to binary has completed!\n\n" + userNumber + " (Base-10) in Binary is: " + bitOne + bitTwo + bitThree + bitFour + bitFive + bitSix + bitSeven + bitEight + ".\n");
      
      // Display Closing Banner
      System.out.println("************************************************************");
      System.out.println("*     Thanks for Using the Binary Number Converter App     *");
      System.out.println("*            Written by: Gabriel Vargas Pastrana           *");
      System.out.println("*                 Date Modified: 02/20/2024                *");
      System.out.println("************************************************************");

      
   } // end public main method
} // end public class binary