package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("Input a number cooresponding to the days of the week. 1-7");
        int weekValue = scanner.nextInt() - 1;
        scanner.close();
        
        System.out.println(daysOfWeek[weekValue]);
    }
}
