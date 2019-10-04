package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollTheDieGame {
    /*
    The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.

    Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of
    spaces on the game board. Here’s the code to do this ((import is java.util.Random):
    After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
    Repeat this 4 additional times, for 5 rolls in total.
    However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
    If they are greater than or less than 20 spaces exactly, they lose.
    Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
     */
    public static void main(String[] args) {

        //initialize known variables
        int boardSpaces = 20;
        int maxRolls = 5;
        int userSpace = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //Game instructions
        System.out.println("Let's play a game!!!!");
        System.out.println("The objective of this game is to travel the entire game board of" +
                " 20 spaces within 5 die rolls.");

        //Start Game
        System.out.println("Ready to play? Roll the die by typing 'start'");
        String startGame = scanner.next();
        scanner.close();

        for(int i = 0;i<maxRolls; i++){
            //Random number between 1-6
            int die = random.nextInt(6) + 1;

            userSpace = userSpace + die;

            if(userSpace == boardSpaces){
                //System.out.println("Roll #" +(i+1)+ " You're on space " +userSpace + ". Congrats, you win!");
                System.out.println(String.format("Roll #%d: You're on space %d. Congrats, you win!",i+1,userSpace));
                break;
            }
            else if(userSpace > boardSpaces){
                System.out.println("That has taken you pass " + boardSpaces + ". You lose, I win....AGAIN");
                break;
            }
            else{
                System.out.println(String.format("Roll # %d: You've rolled a %d. " +
                                "You are now on space %d and have %d more to go.",
                        i+1, die, userSpace, boardSpaces - userSpace));
            }
            if (i+1 == maxRolls)
                System.out.println("You have maxed out the amount of rolls....Better Luck Next Time");

            System.out.println();
        }
    }
}
