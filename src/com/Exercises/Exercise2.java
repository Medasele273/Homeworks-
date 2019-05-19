package com.Exercises;

import java.util.Scanner;

public class Exercise2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Exercise2 ex2 = new Exercise2();
        ex2.exercise2();
    }
    // Accepting the value of the speed ,seconds and minutes .

    public void exercise2() {

        double speed;
        double seconds;
        int minutes;
        int input;
        System.out.println("Please Enter Speed :");
        speed = sc.nextDouble();
        System.out.println("please Enter Seconds :");
        seconds = sc.nextDouble();
        System.out.println("please Enter minutes :");
        minutes = sc.nextInt();
        System.out.println("Do you want the Answer in Meter or in Kilometer ");
        System.out.println("Enter 1 for Meter , 2 for Kilometer ");
        input = sc.nextInt();

            if (input == 1) {
                System.out.println("The distance you traveled is " + distanceInMeter(speed, seconds, minutes) + " Meters");
            } else {
                System.out.println("The distance you traveled is " + distanceInKilometer(speed, seconds, minutes) + " KiloMeters");
            }

    }

    // to calculate the distance in Meters

    public double distanceInMeter(double speed, double seconds, int minutes) {
        double distanceInMeter;
        distanceInMeter = speed * ((minutes * 60) + seconds);
        return distanceInMeter;
    }
    // to calculate the distance in Kilometers

    public double distanceInKilometer(double speed, double seconds, int minutes) {
        double distanceInKiloMeter;
        distanceInKiloMeter = speed * (minutes * 60 + seconds) / 3.6;
        return distanceInKiloMeter;

    }
}
