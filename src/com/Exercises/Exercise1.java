package com.Exercises;

import javax.swing.*;
import java.util.Scanner;

public class Exercise1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Exercise1 ex1 = new Exercise1();
        ex1.jOption();
        ex1.usingScanner();

    }

    // using JOptionPane to ask user input and popup the massage

    public void jOption() {
        String firstName;
        String lastName;
        firstName = JOptionPane.showInputDialog("Please Enter  your  First  Name ? ");
        lastName = JOptionPane.showInputDialog("Please Enter Your Last Name ");
        JOptionPane.showMessageDialog(null, " Hi " + firstName + " " + lastName);
        //System.exit(0);
    }

    // using scanner to ask users input

    public void usingScanner() {
        System.out.println("Please Enter Your First Name :");
        String firstName = sc.nextLine();
        System.out.println("please Enter your Last Name   : ");
        String lastName = sc.nextLine();
        System.out.println("Hi " + firstName + " " + lastName);

    }


}
