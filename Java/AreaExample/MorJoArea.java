package AreaExample;

/*
Program Name: MorJoArea
Author: Joseph Morrison
Date: 11/2/2019
Class: CIT149 Java I 
Description: This program provides a user with an options 
menu and allows them to decide if they would like to calculate
the area of a rectangle or a triangle.
*/

import java.util.Scanner;

public class MorJoArea {

    // Variable declaration and initialization
    private double area = 0;
    private double firstDimension = 0;
    private double secondDimension = 0;
    Scanner keyboard = new Scanner(System.in);

    // Creates method menu for user to select which option theyd like to choose
    // from.
    public int menu() {
        int menuOption = 0;
        while (menuOption < 1 || menuOption > 3) {
            System.out.println("Please select from the following menu:");
            System.out.println("1. Area of a rectangle");
            System.out.println("2. Area of a triangle");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Selection: ");
            menuOption = keyboard.nextInt();
            System.out.println();
            if (menuOption < 1 || menuOption > 3) {
                System.out.println("Invalid Menu Selection!");
                System.out.println("Please make another selection.");
                System.out.println();
            }
        }
        // returns user input to MorJoAreaRun
        return menuOption;
    }

    // Accepts user input to determine the first dimension
    public void setFirstDimension(double num1) {
        if ((num1 <= 0) || (num1 > 100)) {
            System.out.println("First dimension number out of range.");
            System.out.println("Program ended");
            System.exit(0);
        } else {
            firstDimension = num1;
        }
    }

    // Accepts user input to determine the second dimension
    public void setSecondDimension(double num2) {
        if ((num2 <= 0) || (num2 > 100)) {
            System.out.println("Second dimension number out of range.");
            System.out.println("Program ended");
            System.exit(0);
        } else {
            secondDimension = num2;
        }
    }

    // Computes the area of a rectangle
    public void areaOfRectangle() {
        area = firstDimension * secondDimension;
    }

    // Computes the area of a triangle
    public void areaOfTriangle() {
        area = (firstDimension * secondDimension) / 2;
    }

    // Displays the output based upon user input.
    public void displayOutput(int menuOption) {
        if (menuOption == 1) {
            System.out.println("********* Area Calculation *********");
            System.out.println("The height was: " + firstDimension);
            System.out.println("The width was: " + secondDimension);
            System.out.println("The area of the rectangle is: " + area);
            System.out.println("************************************");
        } else if (menuOption == 2) {
            System.out.println("********* Area Calculation *********");
            System.out.println("The height was: " + firstDimension);
            System.out.println("The width was: " + secondDimension);
            System.out.println("The area of the triangle is: " + area);
            System.out.println("************************************");
        }
    }
}
