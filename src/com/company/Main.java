package com.company;

/**
 *
 * Create a program that will randomly select two numbers from 1-6 (like rolling two dice).
 * Show the dice rolls and end the program UNLESS the program rolls doubles.
 *
 * If the program rolls doubles, then it should roll again, show the new roll and stop UNLESS the program rolls doubles
 * again and so on. But on the third time you roll doubles, you don't get to roll again, on the third time you roll
 * doubles, you go to jail!
 *
 * The program should print the sum of the rolls and indicate if the user should stop or roll again or go to Jail.
 * See the example output below.
 *  
 * User rolls  2  &  6
 * Move 8 Spaces and stop
 *
 * User rolls  3  &  3
 * DOUBLES!
 * Move 6 Spaces and roll again getting...
 * User rolls 1 & 2
 * Move 3 Spaces and stop
 *
 * User rolls  2  &  2
 * DOUBLES!
 * Move 4 Spaces and roll again getting...
 * User rolls 1 & 1
 * DOUBLES!
 * Move 2 Spaces and roll again getting...
 * User rolls 6 & 6
 * DOUBLES!
 * GO TO JAIL --->
 */
public class Main {

    public static void main(String[] args) {
        int a ,b ,c = 0, counter = 0 ;
        while(true){
            a = 1+(int) (Math.random()*6);
            b = 1+(int) (Math.random()*6);
            System.out.println("User rolls " + a + " & " + b);
            c = a + b;
            if(a == b){
                System.out.println("DOUBLES!");
                counter++;
                if ( counter < 3){
                    System.out.println("Move " + c + " Spaces and roll again getting...");
                } else {
                    System.out.println("GO TO JAIL --->");
                    break;
                }
            } else {
                counter = 0; //reset counter
                System.out.println("Move " + c + " Spaces and stop ");
                //break;
            }
        }
    }
}
