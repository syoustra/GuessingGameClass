package com.company;

/*
Give instructions
Pick the random number
Get guess from user
Compare guess to the number
  Notify user of higher or lower ... and guess again
  OR ... that they won, do they want to play again?
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Initialize our scanner, so we can take input from the user
        Scanner input = new Scanner(System.in);

        //Set number of guesses
        int numberOfGuesses = 0;
        final int MAX_GUESS_COUNT = 4;


        //Give Instructions
        System.out.println("Welcome to the Guessing Game! I'm thinking of a number between 1 and 100. Can you figure it out?");

        //Pick the Random Number
        int randomNumber = (int) Math.ceil(Math.random() * 100);
//        System.out.println(randomNumber);

        //Get the Guess from the User
        int guessedNumber;


            // Try/Catch to check for invalid user input
            try {
                // Do/while will loop through guesses until correct guess given
                do {
                    System.out.println("Guess a number between 1 and 100");
                    guessedNumber = input.nextInt();
                    System.out.println("You guessed the number " + guessedNumber);

                    //Compare the Guess to the Random Number
                    if (randomNumber > guessedNumber) {
                        System.out.println("Your guess is too low. Guess higher.");
                        numberOfGuesses++;
                        System.out.println("You have made " + numberOfGuesses + " guesses.");
                    } else if (randomNumber < guessedNumber) {
                        System.out.println("Your guess is too high. Guess lower.");
                        numberOfGuesses++;
                        System.out.println("You have made " + numberOfGuesses + " guesses.");
                    } else {
                        numberOfGuesses++;
                        System.out.println("Congratulations! You guessed my number " + randomNumber + " in " + numberOfGuesses + " tries!!!");
                    }

                } while (randomNumber != guessedNumber && numberOfGuesses <= MAX_GUESS_COUNT);

            } catch (Exception e) {
                System.out.println("Please enter an actual number.");
            }






        // HOW TO GET A USABLE RANDOM NUMBER
//        double randomNumber;
//        randomNumber = Math.random();
//        System.out.println("The Random Number is: " + randomNumber);
//
//        double randomNumberTimesHundred = randomNumber * 100;
//        System.out.println("The Random Number times 100 is :" + randomNumberTimesHundred);
//
//        int randomNumberRoundedToCeil = (int) Math.ceil(randomNumberTimesHundred);
//        System.out.println("The Rounded ciel is: " + randomNumberRoundedToCeil);
//
//        int randomNumberRoundedToFloor = (int) Math.floor(randomNumberTimesHundred);
//        System.out.println("The Rounded to Floor is: " + randomNumberRoundedToFloor);
//
//        int randomNumberRoundedNormally = (int) Math.round(randomNumberTimesHundred);
//        System.out.println("The Rounding that we're used to: " + randomNumberRoundedNormally);


    }
}
