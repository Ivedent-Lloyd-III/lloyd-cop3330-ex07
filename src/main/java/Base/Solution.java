package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 07
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double conFact = (double) 0.09290304;

        int roomLength = roomLength();
        int roomWidth = roomWidth();

        System.out.println("You entered the dimensions of " + roomLength + " feet by " + roomWidth + " feet.");

        int areaSqft = roomLength * roomWidth;
        double areaSqmeters = areaSqft * conFact;

        System.out.println("The area is");
        System.out.println(+areaSqft+" square feet");

        DecimalFormat format = new DecimalFormat("0.000");
        System.out.print(format.format(areaSqmeters));
        System.out.print(" square meters");

    }

    private static int roomLength(){

        System.out.print("What is the length of the room in feet? ");
        String length = in.nextLine();
        int roomLength = Integer.parseInt(length);
        return roomLength;

    }

    private static int roomWidth(){

        System.out.print("What is the width of the room in feet? ");
        String width = in.nextLine();
        int roomWidth = Integer.parseInt(width);
        return roomWidth;

    }

}
