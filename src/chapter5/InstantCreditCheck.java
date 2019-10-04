package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    //initialize known variables
    static double salaryRequirement = 25000;
    static double creditScoreRequirement = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        //Get what we don't know
        double credit = getCredit();
        double salary = getSalary();
        scanner.close();

        //check if the user is qualified
        boolean qualified = isUserQualified(salary, credit);

        //notify user
        notifyUser(qualified);

    }

    public static double getSalary(){
        //Get Salary
        System.out.println("Enter Your Salary:");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static double getCredit(){
        //Get Credit Score
        System.out.println("Enter Your Credit Score:");
        double creditScore = scanner.nextDouble();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, double creditScore){
        if(creditScore >= creditScoreRequirement && salary >= salaryRequirement){
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("You have been approved");
        }
        else{
            System.out.println("Nawwwwwwwwwwwwww, please try again at a later date.");
        }
    }

}
