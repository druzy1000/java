/**
 *Andrew Reyes
 *CSCI 1583 (Spring)
 *Homework 4
 *02/25/15
 **/
//USE AN ARRAY LIST IF POSSIBLE

import java.util.Scanner;

public class GradeCalculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] hwGrade = new int[5];
		int[] quizGrade = new int[5];
		int[] testGrade = new int[5];
		int choice = 0;
do	
	{
	printMenu();
	choice = input.nextInt();
			String name = "";
			double hwAvg = 0;
			double qzAvg = 0;
			double tsAvg = 0;

			if(choice == 1)
		{
				System.out.println("Enter student's name: ");
				name = studentName();

				for(int i = 0; i < hwGrade.length; i = i + 1)
					{	
					System.out.println("Enter homework grades.");
					hwGrade[i] = input.nextInt();
					}
				 	hwAvg = average(hwGrade);
			
				for(int i = 0; i < quizGrade.length; i = i + 1)
				{
					System.out.println("Enter quiz grades.");
					quizGrade[i] = input.nextInt();
				}
				qzAvg = average(quizGrade);
				
				for(int i = 0; i < testGrade.length; i = i + 1)
				{
					System.out.println("Enter test grades.");
					testGrade[i] = input.nextInt();
				}
				
				tsAvg = average(testGrade);
				
				double finalGrade = finalAverage(hwAvg, qzAvg, tsAvg);
				System.out.println("Homework average:" + hwAvg);
				System.out.println("Quiz average:" + qzAvg);
				System.out.println("Test average:" + tsAvg);
				System.out.println("Final average for " + name + " is " + finalGrade + ".");

			}		
		}

		
		while(choice != 2);
			System.out.println("Thanks for using GradeBook 2.0");	
	}

	
	public static void printMenu()
		{ 
		System.out.println("1. Enter a new student.");
		System.out.println("2. Quit.");
		}
	
	
	public static String studentName()
		{
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		return name;
		}
	
	
	public static double average(int[] grades)
		{
			double total = 0;
			double avg = 0;
			for(int i = 0; i < grades.length; i = i + 1)
				{
					total = (total + grades[i]);
					
				}
					avg = total/grades.length;
						return avg;
		}

	public static double finalAverage(double hwAvg, double qzAvg, double tsAvg)
	{
		double result = (0.25*hwAvg)+(0.25*qzAvg)+(0.5*tsAvg);
		return result;
	}

}