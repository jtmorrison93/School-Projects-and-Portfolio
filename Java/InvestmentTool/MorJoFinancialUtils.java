package InvestmentTool;
/*
Program Name: MorJoFinancialUtils
Author: Joseph Morrison
Date: 10/17/2019
Class: CIT149 JAVA I
Description: This program is designed to calculate investments based upon user input.
*/

public class MorJoFinancialUtils 
{
	static void displayInstructions() 
	{
		//Displays the instructions given to the user to input
		System.out.println("Please enter the monthly investment, the number of months of the investment,"
				+ " and the annual interst rate.");
	}

	static double calculateFutureValue(double investment, int duration, double rate) 
	{
		//Variable declriation 
		double value = 0;
		
		for (int i=1; i<duration; i++){
			value = (value + duration) * (1 + rate); //computes the value of futureValue 
			
		}

		return value;
	}
}