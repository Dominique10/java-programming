package chapter6;

public class PhoneBillCalculator {

    public static void main(String args[]){
        PhoneBill bill = new PhoneBill(11171911);
        bill.setNumberOfUsedMintues(1000);
        bill.finalBill();
    }
}