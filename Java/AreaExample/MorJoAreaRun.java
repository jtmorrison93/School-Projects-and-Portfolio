package AreaExample;

/*
Program Name: MorJoAreaRun
Author: Joseph Morrison
Date: 11/2/2019
Class: CIT149 Java I 
Description: This program provides a user with an options 
menu and allows them to decide if they would like to calculate
the area of a rectangle or a triangle.
*/

import java.util.Scanner;

public class MorJoAreaRun {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Creates a new instance of MorJoArea
        MorJoArea testing = new MorJoArea();

        // Variable declaration and initialization
        int shapeType = 0;
        double firstDimension = 0;
        double secondDimension = 0;

        // Calls the menu method in MorJoArea and provides answer based on user input
        shapeType = testing.menu();
        // Processes rectangle.
        if (shapeType == 1) {
            System.out.println("Please enter the height.");
            firstDimension = keyboard.nextDouble();
            System.out.println("Please enter the width.");
            secondDimension = keyboard.nextDouble();
            testing.setFirstDimension(firstDimension);
            testing.setSecondDimension(secondDimension);
            testing.areaOfRectangle();
        }
        // Processes triangle
        else if (shapeType == 2) {
            System.out.println("Please enter the height.");
            firstDimension = keyboard.nextDouble();
            System.out.println("Please enter the base.");
            secondDimension = keyboard.nextDouble();
            testing.setFirstDimension(firstDimension);
            testing.setSecondDimension(secondDimension);
            testing.areaOfTriangle();
        }
        // Processes option 3, program ends.
        else if (shapeType == 3) {
            System.out.println("Thank you for using the program.");
            System.out.println("Program ended.");
            System.exit(0);
        }
        // Displays output.
        testing.displayOutput(shapeType);
    }
}