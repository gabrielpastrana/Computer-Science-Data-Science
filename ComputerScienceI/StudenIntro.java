/*
   StudenIntro.java: This program introduces one of my classmates. It also introduces us to the use of variable initialization statements and output statements.
   Athored by: Gabriel Vargas Pastrana
   CMP128-23124: Computer Science I
   Spring 2024
   Professor Tirrito
   County College of Morris
   Date Last Modified: 01/23/2024
*/

public class StudenIntro
{
   public static void main (String [] args)
   {
      // VARIABLES INITIALIZATION AREA
      
      String name = "Marzia Rahimi";
      String major = "Compter Science";
      String why = "this class is a requirement for my major";
      String what = "Improve programming skills";
      String techExp = " No technical experience.";
      String progExp = "Any programming eperience.";
      String job = " Teacher in elementary school.";
      String fact = " Marzia is from Afghanistan and like baking.";
      
      // PROCESSIN THE DATA VALUES INTO MEANING INFORMATION THAT GETS OUTPUT TO THE USER
      
      System.out.println("This is a little Java programm to demonstrate using variables and" + 
         " output statements to share and introduction of one of my classmates. \n" + "Their name is: " + 
         name + ". Their major is: " + major + ". \nThey are taking this course because " + why + 
         ". They hope to get the followin benefit out of this course: " + what + ".\n" + progExp + techExp + job + fact +
         " That is all the information I have to share about my classmate at this time. \n");
         
      // END OF PROGRAM OUTPUT MESSAGE
      System.out.println("<--- THIS IS THE END OF THE PROGRAM --->");
         
      
   }//end of public method main
}//end of my public class