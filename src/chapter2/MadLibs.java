package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        /*Create a program that asks a user for the following items:
        * Season of the year
        * whole number
        * adjective
        *Make a sentence with the input from the user.
        * */

        System.out.println("What is your favorite season....");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("What is your favorite number....");
        double number = scanner.nextDouble();

        System.out.println("One more thing, give me an adjective....");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + season + " " + adjective + " day, I drink a miniumn "+  number +" of cups of coffee");
    }
}
