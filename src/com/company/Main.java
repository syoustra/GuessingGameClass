package com.company;

/*
Give instructions
Pick the random number
Get guess from user
Compare guess to the number
  Notify user of higher or lower ... and guess again
  OR ... that they won, do they want to play again?
 */



public class Main {

    public static void main(String[] args) {
	// write your code here

        //Give Instructions
        System.out.println("Welcome to the Guessing Game! I'm thinking of a number between 1 and 100. Can you figure it out?");

        //Pick the Random Number
        int randomNumber = (int) Math.ceil(Math.random() * 100);
        System.out.println(randomNumber);







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
