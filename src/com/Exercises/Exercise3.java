package com.Exercises;

import java.util.Scanner;

public class Exercise3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Exercise3 exe3 = new Exercise3();
        exe3.calculateAreas();

    }

    public double calculateAreas() {
        double squareSide;
        double circleRadius;
        double triangleBase;
        double triangleHeigth;
        double areaOfSquare;
        double areaOfCircle;
        double areaOfTriangle;
        double maxArea;
        String maxOfString;


        //Accepting the value of square side
        System.out.println("Enter the Square Side :");
        squareSide = sc.nextDouble();
        areaOfSquare = squareSide * squareSide;
        System.out.println("Area of a Square is " +areaOfSquare);
        System.out.println();

        //Accepting the value of Circle Radius
        System.out.println("Enter the Circle Radius :");
        circleRadius = sc.nextDouble();
        areaOfCircle = circleRadius * circleRadius * Math.PI;
        System.out.println("Area of the Circle is :" +areaOfCircle);
        System.out.println();

        //Accepting the value of Triangle Base and Height
        System.out.println("Enter The Triangle  Base ");
        triangleBase = sc.nextDouble();
        System.out.println("Enter The Triangle Height :");
        triangleHeigth = sc.nextDouble();
        areaOfTriangle = (triangleBase * triangleHeigth) / 2;
        System.out.println("Area of the Triangle is :" +areaOfTriangle);


        // To find the Maximum Area Assign one of the Areas to maxArea
        maxArea = areaOfSquare;

        if (areaOfCircle > maxArea && areaOfCircle > areaOfTriangle) {
            maxArea = areaOfCircle;
            maxOfString = "Circle has the largest Area with :";
          //  System.out.println(maxOfString+ " " +maxArea);
        }

         else if (areaOfTriangle > maxArea && areaOfTriangle > areaOfCircle){
            maxArea = areaOfTriangle;
            maxOfString ="Triangle has the largest Area with :";
           // System.out.println(maxOfString+ " " +maxArea);
        } else {


            maxArea = areaOfSquare;
            maxOfString = "Square has the largest Area with :";
           // System.out.println(maxOfString + " " + maxArea);
        }
        System.out.println(maxOfString+ " " +maxArea);
          return maxArea;
    }
}
