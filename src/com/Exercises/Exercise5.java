package com.Exercises;

public class Exercise5 {

    public static void main(String[] args) {

       //using For loop
        System.out.println("USING FOR LOOP");
       for(int i = 1; i <=30; i++){
           System.out.print(i+ " ");
       }

        System.out.println();

       //using while loop
        System.out.println("USING WHILE LOOP");

        int i=1;
        while (i<=30){
            System.out.print(i+ " ");
            i++;
        }

        System.out.println();
        System.out.println();

        //using for loop
        System.out.println("USING FOR LOOP");
        System.out.println();
        int count =1;
        for( i = 1 ;i <=30;i++){
            System.out.print(i+ " ");
            if (count%5==0){
                System.out.println();
            }
            count++;
        }
        System.out.println();

        //using while loop

        System.out.println("USING  WHILE LOOP");
        System.out.println();
        int j=1;
        int number=1;
        while (j<=30){
            System.out.print(j+ " ");
            if (number%5==0){
                System.out.println();
            }
            j++;
            number++;
        }
    }
}
