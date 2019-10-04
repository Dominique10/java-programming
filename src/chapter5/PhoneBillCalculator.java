package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    //initialize known variables
    static double overageRate = .25;
    static double tax = .15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Get info
        double baseCost = planBaseCost();
        double overMinutes = overMinutes();
        double overRate = overageFee(overMinutes);
        double calculatedTax = calculateTax(overRate, baseCost);
        finalTotal(baseCost, overRate, calculatedTax);
    }

    public static double planBaseCost(){
        System.out.println("Enter base cost of plan:");
        return scanner.nextDouble();
    }

    public static double overMinutes(){
        System.out.println("Enter overage minutes:");
        return scanner.nextDouble();
    }

    public static double overageFee(double overateMins){
        return overateMins * overageRate;
    }

    public static double calculateTax(double overRate, double baseCost){
        return (overRate + baseCost) * tax;
    }

    public static void finalTotal( double baseCost, double overRate, double calculatedTax){
        System.out.println(String.format("Phone Bill Statement\n" +
                "Plan: $%.2f\n" +
                "Overage: $%.2f\n" +
                "Tax: $%.2f\n" +
                "Total: $%.2f",baseCost, overRate, calculatedTax, calculatedTax + baseCost + overRate));
    }
}
