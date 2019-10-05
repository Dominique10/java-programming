package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0;i < LENGTH; i++){
            int randomNumber;
            do {
               randomNumber = random.nextInt(MAX_TICKET_NUMBER)+ 1;
            }while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){

        //This is called an enhanced loop. It iterates through array and
        // each time assigns the current element to 'value'
        for(int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }

        //If we've reached this point, then the value was not found in the array.
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index >= 0){
            return true;
        }
        else return false;
    }

    public static void printTicket(int ticket[]){
        for(int i = 0;i < ticket.length;i++){
            System.out.print(ticket[i]+ " | ");
        }
    }
}

