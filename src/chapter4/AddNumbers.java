package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        boolean again;

        Scanner scanner = new Scanner(System.in);

        do {
            //Ask user for first number
            System.out.println("What is your first number?");
            double firstNumber = scanner.nextDouble();

            //Ask user for second number
            System.out.println("What is your second number?");
            double secondNumber = scanner.nextDouble();

            double sum = firstNumber + secondNumber;

            System.out.println("The sum is : " + sum );
            System.out.println("Would you like to start over");
            String answer = scanner.next();

            if(answer.equals("y") || answer.equals("yes") || answer.equals("true")){
                again = true;
            }
            else{
                again = false;
            }
        } while (again);

            scanner.close();
    }
}
