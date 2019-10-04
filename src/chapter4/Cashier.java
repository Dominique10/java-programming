package chapter4;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {

        //Get the number of items to scan
        System.out.println("How many items will you be scanning?");
        Scanner scanner = new Scanner(System.in);
        int quantity =  scanner.nextInt();
        //scanner.close();

        double total = 0;

        //create loop to iterate through all items and get the costs
        for(int i=0; i < quantity; i++){
            System.out.println("How much does this item cost?");
            double itemCost = scanner.nextDouble();
            total = total + itemCost;
        }
        scanner.close();
        System.out.println("Your total is $" + total);
    }

}
