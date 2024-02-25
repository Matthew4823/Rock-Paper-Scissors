//Matthew Orellana
//Date June 12th 2022
//This program will allow the user to play rock paper scissors

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{ //class for Rock Paper Scissors
   public static void main(String [] args) { //
      Scanner console = new Scanner(System.in); //Scanner System
      Random r = new Random();
      int computerChoice, userChoice; //interger variables 
      String input, again; //string variables
       
      do{ //do while loop to loop if user input is yes it will loop
      
      System.out.print("Rock, Paper, or Scissors? ");
      input = console.nextLine();
      
      if(input.equalsIgnoreCase("rock")){ //if user input is rock it will equal 0
          userChoice = 0;
       }
       else if (input.equalsIgnoreCase("paper")) { //if user inpt is paper it
           userChoice = 1;
           }
       else  {
           userChoice = 2;
        }
        
       computerChoice = r.nextInt(3);
       
                     
       if (userChoice ==  computerChoice) {
          System.out.println("tie"); //tie if user choice is the same as computer choice 
          
          }
          else if ((userChoice == 0) && (computerChoice == 2)) {
             System.out.println("user wins");
          }
          else if ((userChoice == 1) && (computerChoice == 2)) {
              System.out.println("computer wins");
              
          }
          else if ((userChoice == 2) && (computerChoice == 0)) {
             System.out.println("computer wins"); 
             
          }
            else if ((userChoice == 2) && (computerChoice == 1)) {
             System.out.println("user wins"); 
             
             }
             else if ((userChoice == 1) && (computerChoice == 0)) {
             System.out.println("user wins");
             
              }
             else if ((userChoice == 0) && (computerChoice == 1)) {
             System.out.println("computer wins");
              }
              System.out.print("Do you want to play again? "); //gives the user the chance 
              again = console.nextLine();
            } while (again.equalsIgnoreCase("yes"));
      }
 }