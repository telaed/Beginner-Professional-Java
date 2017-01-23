/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessmynumber;

/********************************************************************************
 *                                                                               *   
 *                                                                               *
 * We're going to write a little game! It's called Guess My Number. The computer *
 * "thinks of" a random number, and then the person tries to guess it. The       *
 * computer responds with oops, higher, lower, or you got it.                    *
 * After one round is over, the computer asks "Play again?" and if the user says *
 * "yes", it picks another random number and goes for another round. Otherwise   *
 * it exits.                                                                     *
 ********************************************************************************
 */

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random number = new Random(10);
        int randNum = number.nextInt(100);
        boolean isWrong = true;
        System.out.println("I'm thinking of a number between 1 and 100.  What is it?");
        
        while(isWrong){
        System.out.print("Guess: ");
        int guess = input.nextInt();
       
        if(guess>100)
            System.out.println("Oops! That number isn't between 1 and 100.  Try again.");
            else if(guess == randNum){
                System.out.println("You got it!  My number was " + randNum + ".");
                isWrong = false;
            }
            else if(guess<randNum)
                System.out.println("My number is higher.");
            else if(guess>randNum)
                System.out.println("My number is lower.");    
        
        }   
        
    }
    
}
