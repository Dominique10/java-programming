package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        //Initialize known variables
        int rate = 15;
        int maxHours = 40;

        //Get input of unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < 10){
            System.out.println("Invalid entry. Your hours worked need to be between 1 and 40. Please try again");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay is $" + gross);

    }
}
