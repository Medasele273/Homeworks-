package com.Exercises;

import java.util.Scanner;

public class Exercise4 {
    static Scanner sc = new Scanner(System.in);
    int number1;
    int number2;
    int total;

    public static void main(String[] args) {
      Exercise4 mathematicsGame = new Exercise4();
      mathematicsGame.menu();

    }

    public void menu() {

        int i = 0;
        int choose;
        System.out.println("=========================================================");
        System.out.println("WELCOME TO  THE MATHEMATICS GAME");
        System.out.println("==========================================================");
        System.out.println("Choose The Game you want to play :");
        System.out.println("===========================================================");
        System.out.println("1. ADDITION :");
        System.out.println("2. SUBTRACTION :");
        System.out.println("3. MULTIPLICATION :");
        System.out.println("4. DIVISION :");
        System.out.println("5. Quit and  Exit (Q/E)");
        System.out.println("===============================================================");
        System.out.println("Enter your choose here : ");
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choose good bye");
        }
    }

    // ====================== Addition Method ========================================================
    public void addition() {

        System.out.println("Welcome to Addition Game Enjoy it:");
        System.out.println("====================================================");
        System.out.println("Enter Two Numbers........");
        System.out.println("=====================================================");
        System.out.println("Enter Number 1 here ....:");

        number1 = sc.nextInt();
        System.out.println("Enter Number 2 here ......:");
        number2 = sc.nextInt();
        total = number1 + number2;
        System.out.println("What will be the Answer :" + number1 + " + " + number2);
        System.out.println("===================================================");
        System.out.println("Enter Your Answer Here .....");
        int answer = sc.nextInt();
        if (answer == total) {
            System.out.println("Great Job You got the Answer .");
        } else {
            System.out.println("You miss the Answer. The Answer is " + total);
        }
        System.out.println("Do you want to continue play ? Y/N");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        if (in.equalsIgnoreCase("Y")) {
            addition();
        } else if (in.equalsIgnoreCase("N")) {
            menu();
        } else {
            System.exit(0);
        }

    }


    //=============================== Subtraction Method ====================================

    public void subtraction() {

        System.out.println("Welcome to Subtraction Game Enjoy it:");
        System.out.println("====================================================");
        System.out.println("Enter Two Numbers........");
        System.out.println("=====================================================");
        System.out.println("Enter Number 1 here ....:");
        number1 = sc.nextInt();
        System.out.println("Enter Number 2 here ......:");
        number2 = sc.nextInt();
        total = number1 - number2;
        System.out.println("What will be the Answer :" + number1 + " - " + number2);
        System.out.println("===================================================");
        System.out.println("Enter Your Answer Here .....");
        int answer = sc.nextInt();
        if (answer == total) {
            System.out.println("Great Job You got the Answer .");
        } else {
            System.out.println("You miss the Answer. The Answer is " + total);
        }
        System.out.println("Do you want to continue play ? Y/N");

        String in = sc.nextLine();
        if (in.equalsIgnoreCase("Y")) {
            subtraction();
        } else if (in.equalsIgnoreCase("N")) {
            menu();
        } else {
            System.exit(0);
        }
    }

    //===================== Multiplication Method =================================

    public void multiplication() {

        System.out.println("Welcome to Multiplication Game Enjoy it:");
        System.out.println("====================================================");
        System.out.println("Enter Two Numbers........");
        System.out.println("=====================================================");
        System.out.println("Enter Number 1 here ....:");
        number1 = sc.nextInt();
        System.out.println("Enter Number 2 here ......:");
        number2 = sc.nextInt();
        total = number1 * number2;
        System.out.println("What will be the Answer :" + number1 + " * " + number2);
        System.out.println("===================================================");
        System.out.println("Enter Your Answer Here .....");
        int answer = sc.nextInt();
        if (answer == total) {
            System.out.println("Great Job You got the Answer .");
        } else {
            System.out.println("You miss the Answer. The Answer is " + total);
        }
        System.out.println("Do you want to continue play ? Y/N");

        String in = sc.nextLine();
        if (in.equalsIgnoreCase("Y")) {
            multiplication();
        } else if (in.equalsIgnoreCase("N")) {
            menu();
        } else {
            System.exit(0);
        }
    }

    //========================= Division Method ============================================================

    public void division() {

        System.out.println("Welcome to Division Game Enjoy it:");
        System.out.println("====================================================");
        System.out.println("Enter Two Numbers........");
        System.out.println("=====================================================");
        System.out.println("Enter Number 1 here ....:");
        number1 = sc.nextInt();
        System.out.println("Enter Number 2 here ......:");
        number2 = sc.nextInt();
        total = number1 / number2;
        System.out.println("What will be the Answer :" + number1 + " / " + number2);
        System.out.println("===================================================");
        System.out.println("Enter Your Answer Here .....");
        int answer = sc.nextInt();
        if (answer == total) {
            System.out.println("Great Job You got the Answer .");
        } else {
            System.out.println("You miss the Answer. The Answer is " + total);
        }
        System.out.println("Do you want to continue play ? Y/N");

        String in = sc.nextLine();
        if (in.equalsIgnoreCase("Y")) {
            division();
        } else if (in.equalsIgnoreCase("N")) {
            menu();
        } else {
            System.exit(0);
        }
    }
}
