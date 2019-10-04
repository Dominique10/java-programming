package chapter3;

import java.util.Scanner;

public class LoanQualifer {

    public static void main(String[] args) {

        //Initialize what we know
        int salaryRequirement = 30000;
        int currentJobRequirement = 2;

        System.out.println("How much money do you make?");
        Scanner scanner = new Scanner(System.in);
        double incomeAnswer = scanner.nextInt();

        if(incomeAnswer >= salaryRequirement){

            System.out.println("How many years have you been on your current job?");
            double yearsOnJob = scanner.nextInt();
            scanner.close();

            if(yearsOnJob >= currentJobRequirement){
                System.out.println("You qualify for the loan.");
            }
            else {
                System.out.println("You do not quality for the loan at this time. Nested else...");
            }
        }
        else {
            System.out.println("You do not quality for the loan at this time.");
        }

    }

}
