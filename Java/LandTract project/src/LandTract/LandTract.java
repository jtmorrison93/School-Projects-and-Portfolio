package LandTract;
/* 
Program Name: LandTract
Author: Joseph Morrison
Date: 01/13/2020
Course: CIT249 JAVA II
Description: This program is a part of a package that has two feilds,
one for the tract's length and one for the width. Accepts user input
for the dimesions of the two tracts, determines if the tracts are the 
same size and displays the user imput.
*/

import java.util.Scanner;

public class LandTract {
   
   //Variable decleration and initialization 
    Scanner keyboard = new Scanner(System.in);  
    static double lengthA;
    static double widthA;
    static double lengthB;
    static double widthB;

    //Prompts user to input using a keybord the length and width of the first tract
    void getTractA() {
        System.out.println("Enter the length of first Tract.");
        lengthA = keyboard.nextDouble();
        System.out.println("Enter the width of the first tract.");
        widthA = keyboard.nextDouble();
    }
    //Computes the area of the first tract/tractA
    static double getAreaA(double areaA) {
        areaA = lengthA * widthA;
        System.out.println("The area of the first tract is: " + areaA);
        return areaA;
    }
    //Prompts user to input using a keyboard the length and width of the second tract
    void getTractB() {
        System.out.println("Enter the length of second Tract.");
        lengthB = keyboard.nextDouble();
        System.out.println("Enter the width of the second tract.");
        widthB = keyboard.nextDouble();
    }
    //Computes the area of the second tract/tractB
    static double getAreaB(double areaB) {
        areaB = lengthB * widthB;
        System.out.println("The area of the second tract is: " + areaB);
        return areaB;
    }
    public String toStringA() {
        String strA;
        //String strB;
        strA = "The area of the first tract is: " + getAreaA(0);
        //strB = "The area of the second tract is : " + getAreaB(0);
        return strA;
     }
     public String toStringB() {
        //String strA;
        String strB;
        //strA = "The area of the first tract is: " + getAreaA(0);
        strB = "The area of the second tract is : " + getAreaB(0);
        return strB;
     }
     //Determines if the two tracts are the same size and prints a boolean value.
     public boolean equals() {
        boolean status;
        if(getAreaA(0) == getAreaB(0)){
           status = true;
        } else {
           status = false;
        }
        System.out.println("The tracts are the same size: " + status);
        return status;
     }
}
