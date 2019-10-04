package chapter3;

import java.util.Scanner;

public class ChangeForADollar {

    public static void main(String[] args) {

        double valueOfPennies = .01;
        double valueOfNickles = .05;
        double valueOfDimes = .10;
        double valuesOfQuarters = .25;
        int dollarAmount = 1;

    //You'll ask them how many pennies would you like?
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int penniesWanted = scanner.nextInt();
    //How many nickels would you like?
        System.out.println("How many nickels would you like?");
        int nickelsWanted = scanner.nextInt();
    //How many dimes?
        System.out.println("How many dimes would you like?");
        int dimesWanted = scanner.nextInt();
    //And then, how many quarters?
        System.out.println("How many quarters would you like?");
        int quartersWanted = scanner.nextInt();
        scanner.close();

        double penniesValue = penniesWanted * valueOfPennies;
        double nickelsValue = nickelsWanted * valueOfNickles;
        double dimesValue = dimesWanted * valueOfDimes;
        double quarterValue = quartersWanted * valuesOfQuarters;

        double sum = (penniesValue + nickelsValue + dimesValue + quarterValue);
        System.out.println(sum);

        if(sum == dollarAmount){
            System.out.println("You win!");
        }
        else if (sum > dollarAmount){
            double amountOver = sum - dollarAmount;
            System.out.println("You were " + String.format("%.2f",amountOver) + " cents over the dollar amount");
        }
        else{
            double amountOver = dollarAmount - sum;
            System.out.println("You were " + String.format("%.2f",amountOver) + " cents under the dollar amount");
        }
    }
}
