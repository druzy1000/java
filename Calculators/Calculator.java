/**
 *Andrew Reyes
 *CSCI 1583 (Spring)
 *Homework 2
 *01/22/15
 **/

import java.util.Scanner;

public class Calculator
{
	public static void main (String[] args )
	{
		Scanner input = new Scanner(System.in); //Scanner
		double number1; //First Number
		double number2; //Second Number
		double total = 0; //Total of First Number and Second Number
		
		System.out.println("Welcome To My Calculator!"); //Greetings
		System.out.println("\nMENU OF OPERATIONS: \nADDITION(1), \nSUBTRACTION(2), \nMULTIPLICATION(3), \nDIVISION(4), \nMODULUS(5)"); //List of Operations
		
		System.out.println("\nEnter First Number."); //First Number
		number1 = input.nextDouble();
		
		System.out.println("Choose Your Operation."); //Operation Selection
		int result = input.nextInt(); 

		System.out.println("Enter Second Number."); //Second Number
		number2 = input.nextDouble();
			
			if (result == 1) //Addition Property
				{
				total = number1 + number2; //The total of first number and the second number
				System.out.println("Total = " + total);
				}
			if (result == 2) //Subtraction Property
				{	
				total = number1 - number2;
				System.out.println("Total = " + total);
				}
			if (result == 3) //Multiplication Property
				{
				total = number1 * number2;
				System.out.println("Total = " + total);
				}
			if (result == 4) //Division Property
				{
				total = number1 / number2;
				System.out.println("Total = " + total);
				}	
			if (result == 5){ //Modulus Property
				total = number1 - number2; 
				System.out.println("Total = " + total);
				}	
			
		System.out.println("Thank You For Using My Calculator!"); //Ending
	}
}