/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richmond Chris-Koka
 */


import java.util.Scanner;

public class KeepGuessing{
        public static void main(String[] args)
   {
      int UserGuess;
      int CompuGuess = (int)(10 * Math.random() + 1);
      Scanner keyboard = new Scanner(System.in);
      
     System.out.println("I have chosen a number between 1 and 10. Try to guess it. ");
     System.out.print( "Your Guess : " );
     UserGuess = keyboard.nextInt();
     
    while ( UserGuess != CompuGuess )
    {
      System.out.println("That is incorrect. Guess again");
      System.out.print( "Your Guess : " );
      UserGuess = keyboard.nextInt();
    }

    if ( UserGuess == CompuGuess )
    {
     System.out.println( "That's right! You're a good guesser. " );
    }

   }

}
