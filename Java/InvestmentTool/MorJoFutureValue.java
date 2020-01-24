package InvestmentTool;
/*
Program Name: MorJoFutureValue
Author: Joseph Morrison
Date: 10/17/2019
Class: CIT149 JAVA I
Description: This program is designed to calculate investments based upon user input.
*/

import java.util.Scanner;

public class MorJoFutureValue {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// Declare and initialize variables
		double monthlyInvestment = 0;
		int numMonths = 0;
		double annualInterestRate = 0;
		double monthlyInterestRate = 0;
		double futureValue = 0;

		MorJoFinancialUtils.displayInstructions();

		// Prompt at receive input for monthly investment, the number of months of the
		// investment, and the annual interest rate System.out.println("Enter the
		// monthly investment");
		
		monthlyInvestment = keyboard.nextDouble();
		
		numMonths = keyboard.nextInt();
		
		annualInterestRate = keyboard.nextDouble();
		monthlyInterestRate = annualInterestRate / 12;
		futureValue = MorJoFinancialUtils.calculateFutureValue(monthlyInvestment, numMonths, monthlyInterestRate);
		System.out.println("After " + numMonths + " months, \n at a rate of " + monthlyInterestRate
				+ "%, \n your monthly investment of $" + monthlyInvestment + " \n will be worth $" + futureValue);
		keyboard.close();
	}
}