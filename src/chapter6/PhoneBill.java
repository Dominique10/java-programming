package chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private int numberOfAlottedMintues;
    private int numberOfUsedMintues;

    public PhoneBill() {
        id = 0;
        baseCost = 79.99;
        numberOfAlottedMintues = 800;
        numberOfUsedMintues = 800;
    }

    public PhoneBill(int id) {
        this.id = id;
        baseCost = 79.99;
        numberOfAlottedMintues = 800;
        numberOfUsedMintues = 800;
    }

    public PhoneBill(int id, double baseCost, int numberOfAlottedMintues, int numberOfUsedMintues) {
        this.id = id;
        this.baseCost = baseCost;
        this.numberOfUsedMintues = numberOfUsedMintues;
        this.numberOfAlottedMintues = numberOfAlottedMintues;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(){
        this.baseCost = baseCost;
    }

    public int getNumberOfAlottedMintues(){
        return numberOfAlottedMintues;
    }

    public void setNumberOfAlottedMintues(int numberOfAlottedMintues){
        this.numberOfAlottedMintues = numberOfAlottedMintues;
    }

    public int getNumberOfUsedMintues(){
        return numberOfUsedMintues;
    }

    public void setNumberOfUsedMintues(int numberOfUsedMintues){
        this.numberOfUsedMintues = numberOfUsedMintues;
    }

    public double calculateTheOverage(){
        if (numberOfAlottedMintues >= numberOfUsedMintues){
            return 0;
        }
        double overageRate = .25;
        double overateMins =  numberOfUsedMintues - numberOfAlottedMintues;
        return overateMins * overageRate;
    }

    public double calculateTax(){
        double tax = .15;
        return (calculateTheOverage() + baseCost) * tax;
    }

    public double calculateTotal(){
        return baseCost + calculateTax() + calculateTheOverage();
    }

    public void finalBill(){
        System.out.println(String.format("Phone Bill Statement\n" +
                "ID: %d\n" +
                "Plan: $%.2f\n" +
                "Overage: $%.2f\n" +
                "Tax: $%.2f\n" +
                "Total: $%.2f",id ,baseCost, calculateTheOverage(), calculateTax(), calculateTotal()));
    }
}
