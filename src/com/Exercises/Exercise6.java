package com.Exercises;

import java.util.Scanner;

public class Exercise6 {

    static Scanner sc = new Scanner(System.in);
    int start;
    int end;
    int count = 1;

    public static void main(String[] args) {
        Exercise6 exe6 = new Exercise6();
         exe6.forLoop();
          exe6.whileLoop();
        exe6.forLoop2();
        exe6.whileLoop2();

    }

    public void forLoop() {
        System.out.println("USING FOR LOOP");

        System.out.println("Enter the start value ");
        start = sc.nextInt();
        System.out.println("Enter the end value");
        end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            if (count % 10 == 0) {
                System.out.println();
            }
            count++;
        }
        System.out.println();
        System.out.println();
    }

    public void whileLoop() {
        System.out.println("USING WHILE LOOP");

        System.out.println("Enter the start value ");
        start = sc.nextInt();
        System.out.println("Enter the end value");
        end = sc.nextInt();
        int i = start;
        int number = 1;
        while (i <= end) {
            System.out.print(i + " ");
            if (number % 10 == 0) {
                System.out.println();
            }
            i++;
            number++;
        }
        System.out.println();
        System.out.println();
    }

    public void forLoop2() {
        System.out.println("USING FOR LOOP");

        System.out.println("Enter the start value ");
        start = sc.nextInt();
        System.out.println("Enter the end value");
        end = sc.nextInt();
        for (int i = start; i <= end; i += 3) {
            System.out.print(i + " ");
            if (count % 10 == 0) {
                System.out.println();
            }
            count++;
        }
        System.out.println();
        System.out.println();

    }

    public void whileLoop2() {
        System.out.println("USING WHILE LOOP");

        System.out.println("Enter the start value ");
        start = sc.nextInt();
        System.out.println("Enter the end value");
        end = sc.nextInt();
        int i = start;
        int number = 1;
        while (i <= end) {
            System.out.print(i + " ");
            if (number % 10 == 0) {
                System.out.println();
            }
            i+=3;
            number++;

        }
    }
}