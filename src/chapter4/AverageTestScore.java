package chapter4;

import java.util.Scanner;

public class AverageTestScore {

    public static void main(String[] args) {

        //initialize the known values
        int numberOfStudents = 24;
        int numberOfTests = 4;
        double combinedTestScore = 0;
        double average = 0;
        Scanner scanner = new Scanner(System.in);

        //Process each student test scores
        for(int i = 0; i<numberOfStudents; i++){
            System.out.println("Enter grades for student "+(i+1)+":");
            for(int j = 0; j<numberOfTests; j++){
                System.out.println("What is the test score for test #" + (j+1) + "?");
                double testScore = scanner.nextDouble();
                combinedTestScore = combinedTestScore + testScore;
            }
            average = combinedTestScore / numberOfTests;
            System.out.println("Average test score for student " +(i+1)+" is: " + average);
        }
    }
}
