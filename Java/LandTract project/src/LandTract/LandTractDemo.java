package LandTract;
/*
Program Name: LandTractDemo
Author: Joseph Morrison
Date: 01/13/2020
Course: CIT249 JAVA II
Description: This program is a part of a package that has two feilds,
one for the tract's length and one for the width. Accepts user input
for the dimesions of the two tracts, determines if the tracts are the 
same size and displays the user imput.
*/


public class LandTractDemo {

    public static void main(String[] args){
        
        LandTract landTract = new LandTract(); //Creates new instance of the Landtract class


        landTract.getTractA(); //Calls the getTractA method
        landTract.getTractB(); //Calls the getTractB method

        landTract.equals(); //Calls the equals method
    }
}
